package Exercice1;

public class Personne {
    private String nom;
    private String prenom;
    private String adresse;
    private int age;
    private Voiture voiture;
    private Maison maison;

    // Constructeur sans voiture ni maison
    public Personne(String nom, String prenom, String adresse, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.age = age;
        this.voiture = null;
        this.maison = null;
    }

    // Constructeur avec voiture uniquement
    public Personne(String nom, String prenom, String adresse, int age, Voiture voiture) {
        this(nom, prenom, adresse, age); // Réutilisation du constructeur principal
        this.voiture = voiture;
    }

    // Constructeur avec maison uniquement
    public Personne(String nom, String prenom, String adresse, int age, Maison maison) {
        this(nom, prenom, adresse, age);
        this.maison = maison;
    }

    // Constructeur avec voiture et maison
    public Personne(String nom, String prenom, String adresse, int age, Voiture voiture, Maison maison) {
        this(nom, prenom, adresse, age);
        this.voiture = voiture;
        this.maison = maison;
    }

    // Setters pour modifier la voiture et la maison
    public void setMaison(Maison maison) {
        this.maison = maison;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    // Getter pour récupérer le prénom
    public String getPrenom() {
        return prenom;
    }

    // Méthode d'affichage avec ton format d'origine
    public void afficher() {
        System.out.println(nom + " " + prenom + " (" + age + " ans), " + adresse);

        if (voiture == null && maison == null) {
            System.out.println("Possession(s) : aucunes");
        } else {
            if (voiture != null) {
                System.out.println("Possession(s) : " + voiture);
            }
            if (maison != null) {
                System.out.println("Possession(s) : " + maison);
            }
        }
    }
}
