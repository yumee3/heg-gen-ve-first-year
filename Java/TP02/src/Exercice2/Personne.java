package Exercice2;

public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private Ecole ecole;

    Personne(String nom, String prenom, int age, Ecole ecole) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.ecole = ecole;
    }

    @Override
    public String toString() {
        if (ecole.getDegre().equals("Tertiaire")) {
            return nom + " " + prenom + " " + age + " ans" + "\n"
                    + "Étudiant universitaire - Degré tertiaire" + "\n" + ecole;
        } else if (ecole.getType().equals("Publique")) {
            return nom + " " + prenom + " " + age + " ans" + "\n" + ecole;
        } else if (ecole.getType().equals("Privé")) {
            return nom + " " + prenom + " " + age + " ans" + "\n" + ecole.getNom();
        }
        return nom + " " + prenom + " " + age + " ans" + "\n" + "École non définie";
    }
}
