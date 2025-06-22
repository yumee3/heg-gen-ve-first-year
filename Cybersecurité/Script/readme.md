# 🛠️ Script ARP Spoofing (à but pédagogique)

Ce script Python réalise une attaque de type **ARP Spoofing** dans un réseau local.  
Il permet d'usurper l'identité de la passerelle (routeur) afin d'intercepter le trafic entre une victime et le routeur — c’est une attaque **Man-In-The-Middle (MITM)**.

---

## ⚠️ Avertissement

Ce script est fourni **uniquement à des fins pédagogiques**.  
❌ **L’usage malveillant, non autorisé ou illégal est strictement interdit.**

---

## ⚙️ Environnement de test

- Réseau local établi via **partage de connexion iPhone**
- Les **adresses IP et MAC** présentes dans le script correspondent à ce contexte
- ⚠️ Pensez à **modifier les adresses IP et MAC** si vous utilisez ce script dans un autre environnement réseau

---

## 📦 Dépendances

- Langage : **Python 3**
- Librairie requise : **Scapy**
- Aucune configuration `.venv` fournie
- Pour installer la dépendance :

```bash
pip install scapy
