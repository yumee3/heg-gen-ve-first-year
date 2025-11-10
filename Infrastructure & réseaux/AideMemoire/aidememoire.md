# Cisco Commands Complete (Markdown Version)

## 1. Configuration de base

```bash
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
```

## 2. VLAN et Trunk

### Déplacement global des interfaces vers un nouveau VLAN
```bash
Switch(config)# vlan 99
Switch(config)# interface range FastEthernet0/1 - 24
Switch(config-if-range)# switchport access vlan 99
Switch(config-if-range)# exit
```

### Création d’un VLAN
```bash
Switch(config)# vlan 10
Switch(config-vlan)# name IT_Departement
Switch(config-vlan)# exit
```

### Affectation à une interface access
```bash
Switch(config)# interface FastEthernet0/1
Switch(config-if)# switchport mode access
Switch(config-if)# switchport access vlan 10
Switch(config-if)# exit
```

### Configuration d’un trunk
```bash
Switch(config)# interface GigabitEthernet0/1
Switch(config-if)# switchport trunk encapsulation dot1q
Switch(config-if)# switchport mode trunk
Switch(config-if)# switchport trunk allowed vlan 10
Switch(config-if)# exit
```

### VLAN natif sur un trunk
```bash
Switch(config)# interface [TRUNK_PORT]
Switch(config-if)# switchport trunk native vlan [VLAN_ID]
Switch(config-if)# exit
```

## 3. Routage inter-VLAN

```bash
R1(config)# interface fa0/0.10
R1(config-subif)# description VLAN_10
R1(config-subif)# encapsulation dot1q 10
R1(config-subif)# ip address 10.136.8.65 255.255.255.192

R1(config)# interface fa0/0.20
R1(config-subif)# description VLAN_20
R1(config-subif)# encapsulation dot1q 20
R1(config-subif)# ip address 10.136.8.129 255.255.255.192
```

## 4. DHCP Relay et configuration serveur DHCP

```bash
R1(config)# interface fa0/0
R1(config-if)# ip address 10.136.8.1 255.255.255.192
R1(config-if)# no shutdown
R1(config-if)# ip helper-address 10.136.0.100

ip dhcp excluded-address 192.168.1.1 192.168.1.10
ip dhcp pool POOL1
 network 192.168.1.0 255.255.255.0
 default-router 192.168.1.1
 dns-server 8.8.8.8 8.8.4.4
 lease 0 0 30
```

## 5. DHCP Snooping

```bash
ip dhcp snooping
ip dhcp snooping vlan 10

interface GigabitEthernet0/1
 ip dhcp snooping trust

interface GigabitEthernet0/2
 ip dhcp snooping limit rate 10
```

## 6. RIP (Routing Information Protocol)

```bash
router rip
 version 2
 no auto-summary
 network 192.168.1.0
 network 10.0.0.0
 passive-interface FastEthernet0/1
 default-information originate
 redistribute static
```

### Authentification MD5 RIP
```bash
key chain RIP_KEY
 key 1
  key-string cisco

interface FastEthernet0/1
 ip rip authentication mode md5
 ip rip authentication key-chain RIP_KEY
```

## 7. EIGRP

```bash
router eigrp 100
 network 10.0.0.0
 no auto-summary
 redistribute rip metric 10000 100 255 1 1500
```

## 8. NAT

### Statique
```bash
ip nat inside source static 192.168.10.254 209.165.201.5
interface Serial0/1/0
 ip nat inside
interface Serial0/1/1
 ip nat outside
```

### Dynamique
```bash
ip nat pool POOL1 203.0.113.5 203.0.113.10 netmask 255.255.255.248
access-list 1 permit 192.168.1.0 0.0.0.255
ip nat inside source list 1 pool POOL1
```

### PAT (NAT Overload)
```bash
ip nat inside source list 1 interface FastEthernet0/1 overload
interface FastEthernet0/0
 ip nat inside
interface Serial0/1/1
 ip nat outside
```

### Redirection de port
```bash
ip nat inside source static tcp 192.168.1.100 80 203.0.113.5 8080
```

## 9. ACL (Listes de contrôle d’accès)

### Standard
```bash
access-list 10 permit 192.168.1.0 0.0.0.255
interface FastEthernet0/1
 ip access-group 10 in
```

### Étendue
```bash
access-list 101 deny tcp host 192.168.1.10 host 172.16.0.1 eq 80
access-list 101 permit ip any any
interface FastEthernet0/1
 ip access-group 101 in
```

## 10. Sécurité des ports

```bash
interface FastEthernet0/1
 switchport mode access
 switchport port-security
 switchport port-security maximum 1
 switchport port-security violation shutdown
```

## 11. Wi-Fi (SSID, Radio, Bridge)

```bash
! Créer le SSID

dot11 ssid HEG_WIFI
 vlan 10
 authentication open
 guest-mode
 authentication key-management wpa version 2
 wpa-psk ascii 0 cisco123

! Activer l’interface radio

interface dot11radio 0
 no shutdown
 ssid HEG_WIFI
 encryption vlan 10 mode ciphers aes-ccm

! Créer les sous-interfaces WiFi et Ethernet

interface dot11radio 0.10
 encapsulation dot1q 10
 bridge-group 1

interface FastEthernet0.10
 encapsulation dot1q 10
 bridge-group 1

interface FastEthernet0
 no shutdown
```

## 12. SSH et sécurité

```bash

# Création d'utilisateur et gestion des accès

# Exemple utilisateur simple
username helpdesk privilege 1 secret MonitorOnly123

# Exemple utilisateur admin
username network-admin privilege 15 secret FullAccess456

Router# configure terminal

# Step 1: Définir un nom pour le router
Router(config)# hostname Router1

# Step 2: Configurer un nom de domaine
Router1(config)# ip domain-name company.com

# Step 3: Générer une paire de clé RSA (2048-bit --> pour une sécurité renforcée)

Router1(config)# crypto key generate rsa general-keys modulus 2048
The name for the keys will be: Router1.company.com
% The key modulus size is 2048 bits
% Generating 2048 bit RSA keys, keys will be non-exportable...
[OK] (elapsed time was 15 seconds)

# Step 4: Création d'un utilisateur local avec les accès admin
Router1(config)# username admin privilege 15 secret StrongPass2024!

# Step 5: Configuration des lignes d'accès virtuelle
Router1(config)# line vty 0 4
Router1(config-line)# transport input ssh
Router1(config-line)# login local
Router1(config-line)# exec-timeout 5 0
Router1(config-line)# exit

# Step 6: Configuration des paramètres SSH
Router1(config)# ip ssh version 2
Router1(config)# ip ssh time-out 60
Router1(config)# ip ssh authentication-retries 3

# Step 7: Sauvegarde de la configuration
Router1(config)# end
Router1# write memory

```

## 13. Commandes de vérification

```bash
show dot11 bssid
show bridge verbose
clear dot11 client <adresse_mac>

show ip interface brief
show ip route
show ip protocols
show ip dhcp binding
show ip dhcp snooping
show access-lists
show ip nat translations
show port-security
show running-config
```

## 13. Commandes de débogage

```bash
debug ip rip
debug ip dhcp server events
debug ip packet
```
