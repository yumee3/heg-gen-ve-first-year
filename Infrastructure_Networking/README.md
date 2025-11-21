# Network Folder – Cisco Commands & Packet Tracer Exercises

This folder contains all the practical knowledge required to configure a Cisco network.
It includes a complete reference of essential commands, as well as multiple hands-on exercises created with Cisco Packet Tracer.

---

## Complete Command Reference File

The text file provides all necessary commands for:

### Basic Device Configuration

* Device name (`hostname`)
* Console, VTY, and enable passwords
* Banners (`banner motd`)
* Disable DNS lookup
* Save configuration (`wr`, `copy run start`)

### IP Addressing & Interfaces

* Interface configuration (`ip address`, `no shutdown`)
* Default gateway configuration (`ip default-gateway`)
* Display IP information (`show ip interface brief`)

### Access Control Lists (ACLs)

* Standard ACLs (`access-list 1 permit...`)
* Extended ACLs (IP/port filtering)
* Applying ACLs to interfaces using `ip access-group`

### Dynamic Routing – RIP

* RIP configuration
* Advertising networks
* Verification commands (`show ip protocols`, `show ip route`)

### DHCP – Dynamic IP Assignment

* Creating DHCP pools
* Excluding addresses
* Setting gateway, DNS, and IP ranges
* `ip dhcp excluded-address`

### NAT & PAT – Address Translation

* Static NAT (`ip nat inside source static`)
* Dynamic NAT with pools
* PAT (overload on interface)
* Configuring `ip nat inside` / `ip nat outside`

### Port Forwarding

* Example: forwarding HTTP traffic to a local web server
* Typical use cases for home automation

### Wi-Fi Configuration

* SSID creation
* WPA2 security configuration
* Manual or DHCP-based IP assignment

---

## Included Packet Tracer Exercises

### 1. Full Network Practical Lab

A complete topology covering all concepts listed above.
**Objective:** fully configure an operational network with routing, DHCP, ACLs, NAT, PAT, and Wi-Fi services.

### 2. Garage Door Automation Simulation

A home-automation scenario simulating the opening and closing of a garage door in Packet Tracer.
**Objective:** apply connectivity, routing, and automated logic in an IoT environment.

---

## Educational Purpose

This folder serves as a comprehensive review tool to master:

* Router and switch configuration on Cisco devices
* Network security using ACLs
* Deployment of core network services (DHCP, NAT, etc.)
* Understanding and experimenting with protocols in real topologies

> *.pkt files should be opened with Cisco Packet Tracer (version 8.0 or higher recommended).*