########################################
# 1. BASIC DEVICE CONFIGURATION
########################################

hostname R1
enable secret class
service password-encryption

line console 0
 password cisco
 login
 transport input all
 exit

line vty 0 4
 password cisco
 login
 transport input all
 exit

interface FastEthernet0/0
 ip address 192.168.1.1 255.255.255.0
 no shutdown



########################################
# 2. VLANs AND TRUNKING
########################################

# Create VLAN
vlan 10
 name IT_Department
 exit

# Assign Access Port
interface FastEthernet0/1
 switchport mode access
 switchport access vlan 10
 exit

# Move All Ports to a VLAN
vlan 99
interface range FastEthernet0/1 - 24
 switchport access vlan 99
 exit

# Configure Trunk
interface GigabitEthernet0/1
 switchport trunk encapsulation dot1q
 switchport mode trunk
 switchport trunk allowed vlan 10
 exit

# Native VLAN
interface <TRUNK_PORT>
 switchport trunk native vlan <VLAN_ID>
 exit



########################################
# 3. INTER-VLAN ROUTING
########################################

interface fa0/0.10
 description VLAN_10
 encapsulation dot1q 10
 ip address 10.136.8.65 255.255.255.192

interface fa0/0.20
 description VLAN_20
 encapsulation dot1q 20
 ip address 10.136.8.129 255.255.255.192



########################################
# 4. DHCP RELAY & DHCP SERVER
########################################

# DHCP Relay
interface fa0/0
 ip address 10.136.8.1 255.255.255.192
 no shutdown
 ip helper-address 10.136.0.100

# DHCP Server
ip dhcp excluded-address 192.168.1.1 192.168.1.10
ip dhcp pool POOL1
 network 192.168.1.0 255.255.255.0
 default-router 192.168.1.1
 dns-server 8.8.8.8 8.8.4.4
 lease 0 0 30



########################################
# 5. DHCP SNOOPING
########################################

ip dhcp snooping
ip dhcp snooping vlan 10

interface GigabitEthernet0/1
 ip dhcp snooping trust

interface GigabitEthernet0/2
 ip dhcp snooping limit rate 10



########################################
# 6. RIP
########################################

router rip
 version 2
 no auto-summary
 network 192.168.1.0
 network 10.0.0.0
 passive-interface FastEthernet0/1
 default-information originate
 redistribute static

# RIP MD5 Authentication
key chain RIP_KEY
 key 1
  key-string cisco

interface FastEthernet0/1
 ip rip authentication mode md5
 ip rip authentication key-chain RIP_KEY



########################################
# 7. EIGRP
########################################

router eigrp 100
 network 10.0.0.0
 no auto-summary
 redistribute rip metric 10000 100 255 1 1500



########################################
# 8. NAT / PAT
########################################

# Static NAT
ip nat inside source static 192.168.10.254 209.165.201.5
interface Serial0/1/0
 ip nat inside
interface Serial0/1/1
 ip nat outside

# Dynamic NAT
ip nat pool POOL1 203.0.113.5 203.0.113.10 netmask 255.255.255.248
access-list 1 permit 192.168.1.0 0.0.0.255
ip nat inside source list 1 pool POOL1

# PAT (Overload)
ip nat inside source list 1 interface FastEthernet0/1 overload
interface FastEthernet0/0
 ip nat inside
interface Serial0/1/1
 ip nat outside

# Port Forwarding
ip nat inside source static tcp 192.168.1.100 80 203.0.113.5 8080



########################################
# 9. ACCESS CONTROL LISTS (ACLs)
########################################

# Standard ACL
access-list 10 permit 192.168.1.0 0.0.0.255
interface FastEthernet0/1
 ip access-group 10 in

# Extended ACL
access-list 101 deny tcp host 192.168.1.10 host 172.16.0.1 eq 80
access-list 101 permit ip any any
interface FastEthernet0/1
 ip access-group 101 in



########################################
# 10. PORT SECURITY
########################################

interface FastEthernet0/1
 switchport mode access
 switchport port-security
 switchport port-security maximum 1
 switchport port-security violation shutdown



########################################
# 11. WIFI AP CONFIGURATION
########################################

dot11 ssid HEG_WIFI
 vlan 10
 authentication open
 guest-mode
 authentication key-management wpa version 2
 wpa-psk ascii 0 cisco123

interface dot11radio 0
 no shutdown
 ssid HEG_WIFI
 encryption vlan 10 mode ciphers aes-ccm

interface dot11radio 0.10
 encapsulation dot1q 10
 bridge-group 1

interface FastEthernet0.10
 encapsulation dot1q 10
 bridge-group 1

interface FastEthernet0
 no shutdown



########################################
# 12. SSH CONFIGURATION
########################################

username helpdesk privilege 1 secret MonitorOnly123
username network-admin privilege 15 secret FullAccess456

hostname Router1
ip domain-name company.com
crypto key generate rsa general-keys modulus 2048
username admin privilege 15 secret StrongPass2024!

line vty 0 4
 transport input ssh
 login local
 exec-timeout 5 0

ip ssh version 2
ip ssh time-out 60
ip ssh authentication-retries 3

write memory



########################################
# 13. VERIFICATION COMMANDS
########################################

show ip interface brief
show ip route
show ip protocols
show ip dhcp binding
show ip dhcp snooping
show access-lists
show ip nat translations
show port-security
show running-config
show dot11 bssid
show bridge verbose
clear dot11 client <mac_address>



########################################
# 14. DEBUG COMMANDS
########################################

debug ip rip
debug ip dhcp server events
debug ip packet
