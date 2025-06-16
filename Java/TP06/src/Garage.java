import java.util.ArrayList;
import java.util.HashMap;

public class Garage {

    // les variables de Garage permettant de gérer les vehicules à l'intérieur de celui-ci
    private ArrayList<Vehicule> vehiculesList = new ArrayList<>();
    HashMap<Integer, ArrayList<Vehicule>> vehicules = new HashMap<>();
    ArrayList<Vehicule> veh = new ArrayList<>();

    public void main() {
        Moto m1 = new Moto("kawasaki", "z900", 2017, "BE0202022", 2019, 948);
        Moto m2 = new Moto("Suzuki", "SV650", 2014, "VS0203045", 2017, 650);
        Voiture v1 = new Voiture("Renault", "Clio", 2010, "GE1234567", 2012, 98);
        Voiture v2 = new Voiture("Porsche", "911", 2016, "GE0987654", 2017, 368);
        entreeVehicule(m1);
        entreeVehicule(m2);
        entreeVehicule(v1);
        entreeVehicule(v2);
        System.out.println();
        System.out.println("Affichage liste des vehicules : ");
        afficherVehicules();
        System.out.println();

        System.out.println("Affichage carnet : ");
        afficherCarnetVehicule();
        System.out.println();

        System.out.println("Vérification de véhicule : ");
        vehiculePresent("GE0987654");
        System.out.println();
//
        System.out.println("Email : ");
        envoiPromotion();
        System.out.println();
//
        System.out.println("Revision de tous les vehicules puis affichage !");
        reviserToutesLesVehicules();
        afficherVehicules();
        System.out.println();

        System.out.println("Affichage carnet (après révision): ");
        afficherCarnetVehicule();
        System.out.println();

        System.out.println("Email : ");
        envoiPromotion();
        System.out.println();

        System.out.println("Sortie de la suzuki, puis affichage");
        sortieVehicule(m2);
        afficherVehicules();
        System.out.println();

        System.out.println("Affichage carnet final: ");
        afficherCarnetVehicule();


    }

    public void entreeVehicule(Vehicule v) {
        vehiculesList.add(v);
    }

    public void sortieVehicule(Vehicule v) {
        vehiculesList.remove(v);
    }

    public void reviserToutesLesVehicules() {
        for (Vehicule v : vehiculesList) {
            v.setAnneeRevision(2024);
        }

    }

    public void afficherVehicules() {
        for (Vehicule v : vehiculesList) {
            System.out.println(v);
        }
    }

    public void vehiculePresent(String plaqueI) {
        boolean trouve = false;

        for (Vehicule v : vehiculesList) {
            if (v.getPlaqueImmatriculation().equals(plaqueI)) {
                System.out.println("Le véhicule avec la plaque mentionnée : " + v);
                trouve = true;
                break;
            }
        }

        if (!trouve) {
            System.out.println("Aucun véhicule avec cette plaque n’est présent dans le garage.");
        }
    }


    public void afficherCarnetVehicule() {
        vehicules.clear();

        for (Vehicule v : vehiculesList) {
            int annee = v.getAnneeRevision();
            ArrayList<Vehicule> liste;

            if (vehicules.containsKey(annee)) {
                liste = vehicules.get(annee);
            } else {
                liste = new ArrayList<>();
            }

            liste.add(v);
            vehicules.put(annee, liste);
        }

        for (Integer annee : vehicules.keySet()) {
            System.out.println("------ " + annee + " ------");
            for (Vehicule v : vehicules.get(annee)) {
                if (v instanceof Moto) {
                    System.out.println("Moto : " + v);
                } else if (v instanceof Voiture) {
                    System.out.println("Voiture : " + v);
                } else {
                    System.out.println("Véhicule inconnu : " + v);
                }
            }
        }
    }


    public void envoiPromotion() {
        boolean promoEnvoyee = false;

        for (Vehicule v : vehiculesList) {
            if (v.getAnnee() <= 2018) {
                if (!promoEnvoyee) {
                    System.out.println("Un email de promotion sur la révision a été envoyé aux propriétaires de :");
                    promoEnvoyee = true;
                }

                if (v instanceof Moto) {
                    System.out.println("Moto : " + v);
                } else if (v instanceof Voiture) {
                    System.out.println("Voiture : " + v);
                } else {
                    System.out.println("Véhicule inconnu : " + v);
                }
            }
        }

        if (!promoEnvoyee) {
            System.out.println("Aucun client ne répond au critère.");
        }
    }
}