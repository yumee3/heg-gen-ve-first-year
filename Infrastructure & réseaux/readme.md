# 📡 Dossier Réseau – Commandes & Exercices Packet Tracer

Ce dossier regroupe l’ensemble des connaissances pratiques nécessaires à la configuration d’un réseau Cisco, avec une synthèse complète des commandes essentielles et plusieurs exercices réalisés sur Cisco Packet Tracer.

---

## 📘 Fichier de commandes – Référentiel complet

Le fichier texte contient toutes les commandes utiles pour :

### 🔧 Configuration de base d’un équipement
- Nom du périphérique (`hostname`)
- Mot de passe console, VTY et enable
- Bannières (`banner motd`)
- Désactivation DNS lookup
- Sauvegarde de la config (`wr`, `copy run start`)

### 🌐 Adressage IP & Interfaces
- Configuration d’une interface (`ip address`, `no shutdown`)
- Configuration d’une passerelle (`ip default-gateway`)
- Affichage des IPs (`show ip interface brief`)

### 🛂 ACL – Listes de contrôle d’accès
- Standard (`access-list 1 permit...`)
- Étendue (extended ACLs avec filtrage IP/port)
- Application sur interface avec `ip access-group`

### 🧠 Routage dynamique – RIP
- Configuration du protocole RIP
- Annonce des réseaux
- Commandes de vérification (`show ip protocols`, `show ip route`)

### 📨 DHCP – Attribution dynamique d’IP
- Création de pools DHCP
- Exclusion d’adresses
- Configuration de passerelle, DNS, plage d’adresses
- `ip dhcp excluded-address`

### 🌍 NAT & PAT – Traduction d’adresses
- NAT statique (`ip nat inside source static`)
- NAT dynamique avec pool
- PAT (surcharge avec interface)
- Configuration `ip nat inside` / `ip nat outside`

### 🔁 Redirection de ports
- Exemple : redirection HTTP vers serveur web local
- Cas d’usage type maison intelligente

### 📶 Wi-Fi – Configuration sans fil
- Création d’un réseau SSID
- Paramètres de sécurité (clé WPA2)
- Attribution d’IP manuelle ou via DHCP

---

## 🧪 Exercices Packet Tracer inclus

1. **TP global – Réseau complet**
   > Une topologie complète reprenant toutes les notions listées ci-dessus.  
   **Objectif** : configurer entièrement un réseau opérationnel avec routage, DHCP, ACL, NAT, PAT et Wi-Fi.

2. **Simulation – Domotique porte de garage**
   > Projet de simulation d’ouverture/fermeture d’une porte de garage dans Packet Tracer.  
   **Objectif** : appliquer les notions de connectivité, routage, et scénarios automatisés dans une maison connectée.

---

## 🎯 Objectif pédagogique

Ce dossier sert de base de révision complète pour maîtriser :
- La configuration de routeurs et switches Cisco
- La sécurisation d’un réseau avec des ACL
- La mise en place de services réseau courants (DHCP, NAT, etc.)
- La compréhension et l’expérimentation des protocoles sur des topologies concrètes

> 📎 *Les fichiers `.pkt` sont à ouvrir avec Cisco Packet Tracer (v8.0 minimum recommandé).*
