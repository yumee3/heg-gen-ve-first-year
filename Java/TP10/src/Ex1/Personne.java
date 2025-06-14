package Ex1;

public class Personne implements Comparable<Personne> {
    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return nom + " (" + age + ")";
    }

    @Override
    public int compareTo(Personne o) {
        Personne a = this;
        Personne b = o;

        // On utilise compareTo des Stromg sur les noms
        return a.nom.compareTo(b.nom);
        // En une ligne : return nom.compareTo(o.nom)

    }
}
