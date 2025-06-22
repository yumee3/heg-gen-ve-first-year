// AIDEMEMOIRE JAVA COMPLET POUR RÉVISION

// ⚠️ Toutes les sections sont identifiées par des commentaires // 🔍 [numero] TITRE
// Utilise Ctrl+F pour naviguer rapidement !

/*
==========================================================
INDEX DU FICHIER AIDE-MEMOIRE JAVA POUR L'EPREUVE
==========================================================

[1] COMMENTAIRES
[2] MOTS-CLÉS RÉSERVÉS EN JAVA
[3] TYPES DE VARIABLES EN JAVA
[4] CONSTANTES AVEC LE MOT-CLÉ FINAL
[5] OPÉRATEURS EN JAVA
[6] CARACTÈRES SPÉCIAUX EN JAVA
[7] PORTÉE DES VARIABLES EN JAVA
[8] SYSTEM.OUT.PRINTLN
[9] DÉCLARATION ET INSTANTIATION D’OBJETS
[10] MODIFICATEURS EN JAVA
[11] CONDITIONS
[12] BOUCLES EN JAVA
[13] MÉTHODES & PARAMÈTRES
[14] PASSAGE PAR VALEUR VS PAR RÉFÉRENCE
[15] MÉTHODE MAIN
[16] GETTERS & SETTERS
[17] CONSTRUCTEURS EN JAVA
[18] MÉTHODES GÉNÉRALES UTILES
[19] MÉTHODES UTILISÉES FRÉQUEMMENT (complément)
[20] JAVADOC
[21] TABLEAUX (1 dimension)
[22] MATRICES (tableaux à 2 dimensions)
[23] LISTES DYNAMIQUES : ARRAYLIST, LINKEDLIST, VECTOR
[24] DICTIONNAIRE : HASHMAP
[25] ITERATOR
[26] ENSEMBLES (SET) : HASHSET, TREESET
[27] OBJETS & APPELS
[28] ABSTRACTION & MODULARISATION
[29] HÉRITAGE, INTERFACES & POLYMORPHISME
    - 29.1 extends, superclasse, sous-classes
    - 29.2 constructeurs avec super()
    - 29.3 droits d’accès : private, protected, public
    - 29.4 classes abstraites & méthodes concrètes
    - 29.5 Interface ICallable : constante, getNom(), setNom()
    - 29.6 Type statique vs type dynamique
    - 29.7 override vs overloading
    - 29.8 Comparable, Comparator, equals & hashCode

[30] CARTES CRC
[31] STRUCTURATION D’UN PROJET JAVA
[32] UTILISATION DES BIBLIOTHÈQUES
[33] CLASSES UTILES : STRING, INTEGER, MATH, RANDOM
[34] COLLECTIONS : MÉTHODES UTILES

[35] GESTION DES EXCEPTIONS EN JAVA
    - 35.1 try/catch/finally
    - 35.2 throws et throw
    - 35.3 Exceptions personnalisées
    - 35.4 Exception vs Error
    - 35.5 Cas pratiques d’examen

[36] COMPARAISONS EN JAVA
    - 36.1 == vs .equals()
    - 36.2 equals() et hashCode()
    - 36.3 instanceof
    - 36.4 compareTo() et Comparable
    - 36.5 Comparator

[37] CAS SPÉCIAUX VUS EN EXAMENS
    - 37.1 Examen blanc 2023 – Gestion des examens
    - 37.2 Examen cinéma – HashSet / HashMap / equals
    - 37.3 Examen votation – Validations & Exceptions personnalisées
    - 37.4 Examen gestion des alarmes – Null, out of bounds, type
    - 37.5 Cast foireux (ClassCastException)
    - 37.6 Mauvais .equals() sur null

[38] LECTURE & CHARGEMENT DE DONNÉES
    - 38.1 Lecture ligne par ligne (BufferedReader)
    - 38.2 Chargement CSV dans int[]
    - 38.3 Chargement CSV dans int[][]
    - 38.4 Chargement CSV dans ArrayList<String[]>
    - 38.5 Chargement CSV dans String[][]
    - 38.6 Méthode lireCsv (style HEG, retourne String[])
    - 38.7 Exemple complet avec double tableau + objets (Livre)
    - 38.8 Exercice Forum Admin, modo
    - 38.9 Chargement via SPLIT ou non (FileToStr)


[39] LISTES & MOT-CLÉ `new` : BONNES PRATIQUES
    - 39.1 Quand utiliser `new` pour créer une liste
    - 39.2 Cas où `new` est inutile (paramètres, transferts, etc.)
    - 39.3 Résumé & comparaison de cas concrets

[40] LIAISON ENTRE OBJETS SANS HASHMAP (EXAMEN 2023)


==========================================================
Astuce : utilisez Ctrl+F + le numero pour retrouver un point precis rapidement.
==========================================================
*/


// =======================================
// 🔍 [1] COMMENTAIRES
// =======================================
// Ceci est un commentaire mono-ligne
/* Ceci est
   un commentaire multi-ligne */

// =======================================
// 🔍 [2] MOTS-CLES RESERVES EN JAVA
// =======================================

import ExaQ2_ForumEnLigne.*;
import ExaQ3_DrugManagement.*;

import java.io.IOException;
import java.util.*;

/**
     * public : accessible depuis partout
     */
    public class MaClassePublic {}

    /**
     * private : accessible uniquement dans la classe
     */
    private int compteur;

    /**
     * class : définit une classe
     */
    class Utilisateur {}

    /**
     * static : appartient à la classe plutôt qu’à l’instance
     */
    public static int totalUtilisateurs;

    /**
     * void : méthode qui ne retourne rien
     */
    public void afficher() {
        System.out.println("Salut !");
    }

    /**
     * new : crée une nouvelle instance
     */
    Utilisateur u = new Utilisateur();

    /**
     * return : renvoie une valeur depuis une méthode
     */
    public int addition(int a, int b) {
        return a + b;
    }

    /**
     * if : exécute une instruction si la condition est vraie
     * else : exécute une autre instruction sinon
     */
    if (a > b) {
            System.out.println("a est plus grand");
        } else {
            System.out.println("b est plus grand ou égal");
        }

    /**
     * for : boucle avec compteur
     */
    for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    /**
     * while : boucle tant que la condition est vraie
     */
    while (a < 5) {
            a++;
        }

    /**
     * break : sort immédiatement de la boucle
     * continue : passe à l’itération suivante
     */
    for (int i = 0; i < 10; i++) {
            if (i == 5) break;
            if (i % 2 == 0) continue;
            System.out.println(i);
        }

    /**
     * switch / case / default : sélectionne parmi plusieurs blocs de code
     */
    switch (jour) {
            case "lundi": System.out.println("Début"); break;
            case "vendredi": System.out.println("Fin"); break;
            default: System.out.println("Milieu");
        }

    /**
     * import : inclut une classe externe
     */
    import java.util.ArrayList;

    /**
     * package : définit l’emplacement logique d’une classe
     */
    package monprogramme.utilitaires;

    /**
     * implements : indique qu’une classe implémente une interface
     */
    class Chien implements IAnimal {
        public void parler() {
            System.out.println("Wouf");
        }
    }

    /**
     * extends : indique qu’une classe hérite d’une autre
     */
    class Chien extends Animal {}

    /**
     * try / catch / finally : gestion des exceptions
     */
    try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Erreur");
        } finally {
            System.out.println("Bloc toujours exécuté");
        }

        /**
         * this : fait référence à l’instance courante
         */
        public void setNom(String nom) {
            this.nom = nom;
        }

        /**
         * super : fait référence à la superclasse
         */
        class Chien extends Animal {
            public Chien(String nom) {
                super(nom);
            }
        }

    /**
     * instanceof : teste si un objet est d’un type donné
     */
    if (animal instanceof Chien) {
            System.out.println("C’est un chien");
        }

    /**
     * abstract : classe ou méthode non implémentée
     */
    abstract class Forme {
        public abstract double aire();
    }

    /**
     * final : empêche la modification (classe, méthode ou variable)
     */
    final int MAX = 100;

    /**
     * synchronized : empêche l’accès simultané à une méthode en multithread
     */
    public synchronized void incrementer() {
        compteur++;
    }

    /**
     * volatile : garantit la lecture directe de la variable en mémoire (thread-safe)
     */
    private volatile boolean actif = true;

    /**
     * transient : empêche la sérialisation d’un attribut
     */
    private transient String motDePasse;

    // Ajouter un sout en plus a un abstarct dja defini

    @Override
    public void messageDeconnexion() {
        super.messageDeconnexion();
        System.out.println("Il à régler " + nbBugs + " aujourd'hui. Bravo");
}

// =======================================
// 🔍 [3] TYPES DE VARIABLES EN JAVA
// =======================================

/**
 * 🔹 Les types primitifs stockent une valeur brute directement en mémoire.
 * 🔹 Les types objets stockent une référence vers une zone mémoire.
 * 🔹 Les types primitifs ne peuvent pas être null, contrairement aux objets.
 * 🔹 Les types primitifs sont plus rapides et plus légers.
 */

    /**
     * 🔸 Type primitif : int (entier de 32 bits)
     */
    int age = 25;

    /**
     * 🔸 Type primitif : double (nombre à virgule flottante 64 bits)
     */
    double temperature = 36.6;

    /**
     * 🔸 Type primitif : boolean (vrai ou faux)
     */
    boolean estConnecte = true;

    /**
     * 🔸 Type primitif : char (caractère Unicode)
     */
    char initiale = 'A';

    /**
     * 🔸 Type primitif : byte (entier 8 bits)
     */
    byte niveau = 127;

    /**
     * 🔸 Type primitif : short (entier 16 bits)
     */
    short hauteur = 150;

    /**
     * 🔸 Type primitif : long (entier 64 bits)
     */
    long population = 7800000000L;

    /**
     * 🔸 Type primitif : float (nombre à virgule 32 bits)
     */
    float poids = 72.5f;

    /**
     * 🔸 Type objet : String (chaîne de caractères, immutable)
     */
    String nom = "Alice";

    /**
     * 🔸 Type objet : ArrayList (liste dynamique)
     */
    ArrayList<String> noms = new ArrayList<>();

    /**
     * 🔸 Type objet : Object (classe mère de tous les objets)
     */
    Object o = new Object();

    /**
     * 🔹 Exemple de différence : passage par valeur vs référence
     */
    public void incrementerInt(int n) {
        n++;
        // ne modifie pas la variable originale
    }

    public void ajouterNom(ArrayList<String> liste) {
        liste.add("Paul");
        // modifie la liste originale car c’est une référence
    }


// =======================================
// 🔍 [4] CONSTANTES AVEC LE MOT-CLE FINAL
// =======================================

/**
 * 🔹 Le mot-clé final signifie « ne peut plus changer » une fois défini :
 * - Sur une variable → empêche la réaffectation
 * - Sur une méthode → empêche la redéfinition (override)
 * - Sur une classe → empêche l’héritage
 */

// --------------------------
// 🔸 FINAL sur une VARIABLE
// --------------------------

    /**
     * Constante entière : ne peut être modifiée après l’initialisation.
     */
    final int NB_MAX = 100;

    /**
     * Constante avec calcul (possible si affectée dès la déclaration)
     */
    final double TAUX_TVA = 0.077;

    /**
     * Une final non initialisée doit l’être dans le constructeur
     */
    final String prenom;

    public MaClasse() {
        this.prenom = "Alice";
        // this.prenom = "Autre"; // ❌ Erreur : déjà affecté
    }

// --------------------------
// 🔸 FINAL sur une MÉTHODE
// --------------------------

    class Animal {

        /**
         * Méthode finale : ne peut pas être redéfinie par les sous-classes.
         */
        public final void respirer() {
            System.out.println("Je respire !");
        }
    }

    class Chien extends Animal {
        // public void respirer() {} // ❌ Erreur : méthode finale
    }

// --------------------------
// 🔸 FINAL sur une CLASSE
// --------------------------

    /**
     * Classe finale : ne peut pas être héritée.
     */
    final class Utilitaire {
        public static void afficher(String message) {
            System.out.println(message);
        }
    }

// class SousClasse extends Utilitaire {} // ❌ Erreur : classe final



// =======================================
// 🔍 [5] OPERATEURS EN JAVA
// =======================================

/**
 * 🔹 Les opérateurs permettent d'effectuer des opérations sur des variables et des valeurs.
 * Ils sont divisés en plusieurs catégories :
 */

// -----------------------------
// 🔸 Opérateurs arithmétiques
// -----------------------------

    /**
     * Effectue une addition entre deux entiers.
     * @return la somme de a et b
     */
    public int addition(int a, int b) {
        return a + b; // + addition
    }

    /**
     * Effectue une soustraction entre deux entiers.
     */
    int soustraction = 10 - 3; // - soustraction

    /**
     * Effectue une multiplication.
     */
    int produit = 4 * 2; // * multiplication

    /**
     * Effectue une division entière (perd les décimales).
     */
    int division = 10 / 3; // / division

    /**
     * Retourne le reste de la division (modulo).
     */
    int reste = 10 % 3; // % modulo

// -----------------------------
// 🔸 Opérateurs d'affectation
// -----------------------------

    /**
     * Affecte une valeur à une variable.
     */
    int x = 5; // = affectation simple

    /**
     * Incrémente la valeur de x de 3.
     */
        x += 3; // équivalent à x = x + 3

    /**
     * Décrémente la valeur de x de 2.
     */
        x -= 2; // équivalent à x = x - 2

        x *= 4; // x = x * 4
        x /= 2; // x = x / 2
        x %= 3; // x = x % 3

// -----------------------------
// 🔸 Opérateurs de comparaison
// -----------------------------

    /**
     * Renvoie true si les deux valeurs sont égales.
     */
    boolean estEgal = (a == b);

    /**
     * Renvoie true si les deux valeurs sont différentes.
     */
    boolean estDiff = (a != b);

    /**
     * Tests d’ordre
     */
    boolean plusGrand = (a > b);
    boolean plusPetit = (a < b);
    boolean auMoins = (a >= b);
    boolean auPlus = (a <= b);

// -----------------------------
// 🔸 Opérateurs logiques (booléens)
// -----------------------------

    /**
     * ET logique : true si les deux conditions sont vraies.
     */
    if (a > 5 && b > 5) {}

    /**
     * OU logique : true si au moins une condition est vraie.
     */
    if (a > 5 || b > 5) {}

    /**
     * NON logique : inverse la condition.
     */
    boolean actif = false;
    if (!actif) {
        System.out.println("Inactif");
    }

// -----------------------------
// 🔸 Opérateurs d'incrémentation / décrémentation
// -----------------------------

    int compteur = 0;
    compteur++; // incrémente de 1 (post-incrémentation)
    ++compteur; // incrémente avant d’évaluer

    compteur--; // décrémente de 1
    --compteur;

// -----------------------------
// 🔸 Opérateur ternaire
// -----------------------------

    /**
     * Renvoie "majeur" si l'âge est >= 18, sinon "mineur"
     */
    String statut = (age >= 18) ? "majeur" : "mineur";


// =======================================
// 🔍 [6] CARACTERES SPECIAUX EN JAVA
// =======================================

    /**
     * 🔹 En Java, certains caractères ont une signification spéciale lorsqu’ils sont précédés par une barre oblique inverse (\\).
     * Ces caractères sont appelés **caractères d’échappement**.
     */

    // -----------------------------
    // 🔸 \n : Saut de ligne
    // -----------------------------

    /**
     * Affiche deux lignes grâce à \\n.
     */
    System.out.println("Bonjour\nà tous");

    /*
      Sortie :
      Bonjour
      à tous
    */

    // -----------------------------
    // 🔸 \t : Tabulation horizontale
    // -----------------------------

    /**
     * Affiche une tabulation entre deux mots.
     */
    System.out.println("Nom\tPrénom");

    /*
      Sortie :
      Nom     Prénom
    */

    // -----------------------------
    // 🔸 \\ : Antislash littéral
    // -----------------------------

    /**
     * Affiche un anti-slash (\\).
     */
    System.out.println("C:\\Users\\Nom");

    /*
      Sortie :
      C:\Users\Nom
    */

    // -----------------------------
    // 🔸 \' : Apostrophe
    // -----------------------------

        /**
         * Affiche une apostrophe dans un caractère ou une chaîne.
         */
        char apostrophe = '\'';
    System.out.println("C'est l'été !");

    /*
      Sortie :
      C'est l'été !
    */

    // -----------------------------
    // 🔸 \" : Guillemet double
    // -----------------------------

    /**
     * Affiche des guillemets dans une chaîne.
     */
    System.out.println("Elle a dit : \"Bonjour\"");

    /*
      Sortie :
      Elle a dit : "Bonjour"
    */

    // -----------------------------
    // 🔸 \b : Backspace (efface le caractère précédent dans certains contextes console)
    // -----------------------------

    /**
     * Backspace : effet visuel dépend du terminal.
     */
    System.out.println("Hello\bWorld"); // Peut afficher "HellWorld" ou "HelWorld"

    /*
      ⚠️ Pas toujours visible selon les IDE/console.
    */


// =======================================
// 🔍 [7] PORTEE DES VARIABLES EN JAVA
// =======================================

/**
 * 🔹 La portée (ou « scope ») détermine où une variable est accessible dans le code.
 * Il existe 3 types de portée :
 * - Locale
 * - D’instance
 * - De classe (statique)
 */

// ---------------------------------
// 🔸 1. Portée locale (variable locale)
// ---------------------------------

    /**
     * Variable locale : déclarée à l’intérieur d’une méthode, accessible uniquement dans le bloc.
     */
    public void afficherNom() {
        String nom = "Alice"; // variable locale
        System.out.println(nom);
        // nom existe uniquement ici
    }

// nom = "Bob"; // ❌ Erreur : nom n’existe pas en dehors du bloc

// ---------------------------------
// 🔸 2. Portée d’instance (variable d’objet)
// ---------------------------------

    public class Personne {

        /**
         * Variable d’instance : propre à chaque objet.
         */
        private String prenom;

        public Personne(String prenom) {
            this.prenom = prenom; // utilisation via this
        }

        public void afficherPrenom() {
            System.out.println(this.prenom); // accessible dans toute la classe
        }
    }

// ---------------------------------
// 🔸 3. Portée de classe (variable statique)
// ---------------------------------

    public class Compteur {

        /**
         * Variable de classe : partagée par toutes les instances.
         * Accessible sans créer d’objet.
         */
        public static int nbInstances = 0;

        public Compteur() {
            nbInstances++; // on incrémente le compteur global
        }

        public static void afficherNbInstances() {
            System.out.println("Total : " + nbInstances);
        }
    }


// =======================================
// 🔍 [8] SYSTEM.OUT.PRINTLN
// =======================================
    System.out.println("Bonjour");


// =======================================
// 🔍 [9] DECLARATION ET INSTANTIATION D’OBJETS
// =======================================

/**
 * 🔹 Déclarer un objet = créer une référence vers un type
 * 🔹 Instancier un objet = réserver de la mémoire avec le mot-clé `new`
 * 🔹 Une fois instancié, on peut accéder aux méthodes/attributs via `.`
 */

// ---------------------------------------
// 🔸 Exemple 1 : déclaration + instanciation
// ---------------------------------------

    /**
     * On crée une instance de la classe Personne.
     */
    Personne p = new Personne("Alice");

    /**
     * On appelle une méthode sur l’instance.
     */
    p.afficherNom();

    /**
     * On peut aussi séparer déclaration et instanciation.
     */
    Personne p2;             // déclaration
    p2 = new Personne("Bob"); // instanciation

// ---------------------------------------
// 🔸 Exemple 2 : tableau ou liste d’objets
// ---------------------------------------

    /**
     * Tableau de 3 objets Personne.
     */
    Personne[] tab = new Personne[3];
    tab[0] = new Personne("Claire");
    tab[1] = new Personne("David");
    tab[2] = new Personne("Emma");

    /**
     * Liste dynamique d’objets Personne (ArrayList).
     */
    ArrayList<Personne> personnes = new ArrayList<>();
    personnes.add(new Personne("Léo"));
    personnes.add(new Personne("Nina"));

    /**
     * Parcours avec une boucle foreach.
     */
    for (Personne pers : personnes) {
            pers.afficherNom();
        }

// ---------------------------------------
// 🔸 Exemple 3 : objet avec plusieurs attributs
// ---------------------------------------

    /**
     * Instanciation avec plusieurs paramètres dans le constructeur.
     */
    Voiture v = new Voiture("Renault", "Clio", 2020);
    v.afficherInfos();

    /**
     * Utilisation d’un objet instancié comme paramètre d’une méthode.
     */
    Garage garage = new Garage();
    garage.entreeVehicule(v);


// =======================================
// 🔍 [10] MODIFICATEURS EN JAVA
// =======================================

/**
 * 🔹 Les modificateurs permettent de définir :
 * - La **visibilité** d’un membre (classe, attribut, méthode)
 * - Son **comportement** (immuable, partagé, abstrait, etc.)
 */

// -------------------------------------------------
// 🔸 1. Modificateurs d'accès : private, public, protected
// -------------------------------------------------

    /**
     * Attribut privé → accessible uniquement dans la classe.
     */
    private int age;

    /**
     * Méthode publique → accessible depuis partout.
     */
    public void saluer() {
        System.out.println("Bonjour !");
    }

    /**
     * Attribut protégé → accessible dans la classe et ses sous-classes.
     */
    protected String nom;

    /**
     * Accès par niveau :
     * - private : classe uniquement
     * - default (aucun mot-clé) : package
     * - protected : package + héritage
     * - public : accessible partout
     */

// -------------------------------------------------
// 🔸 2. static : Appartient à la classe
// -------------------------------------------------

    /**
     * Attribut static : partagé entre toutes les instances.
     */
    public static int compteur = 0;

    /**
     * Méthode statique : peut être appelée sans objet.
     */
    public static void afficherCompteur() {
        System.out.println("Compteur = " + compteur);
    }

    /**
     * Utilisation :
     * Classe.methodeStatique();
     * Exemple :
     */
    Math.sqrt(16); // appel statique

// -------------------------------------------------
// 🔸 3. final : Interdiction de modification
// -------------------------------------------------

    /**
     * Variable finale : constante.
     */
    final double TAUX_TVA = 0.077;

    /**
     * Méthode finale : ne peut pas être redéfinie dans une sous-classe.
     */
    public final void respirer() {
        System.out.println("Je respire");
    }

    /**
     * Classe finale : ne peut pas être héritée.
     */
    final class Utilitaire {
        // code ici
    }

// -------------------------------------------------
// 🔸 4. abstract : Obligation d’implémenter
// -------------------------------------------------

    /**
     * Classe abstraite : ne peut pas être instanciée.
     */
    abstract class Animal {
        /**
         * Méthode abstraite : sans corps, à implémenter dans les sous-classes.
         */
        public abstract void crier();

        /**
         * Méthode concrète : peut être utilisée telle quelle.
         */
        public void manger() {
            System.out.println("L’animal mange");
        }
    }

    /**
     * Classe concrète qui hérite et implémente la méthode.
     */
    class Chat extends Animal {
        @Override
        public void crier() {
            System.out.println("Miaou");
        }
    }

// -------------------------------------------------
// 🔸 5. void : Méthode ne retournant rien
// -------------------------------------------------

    /**
     * Méthode void : exécute une action sans retourner de résultat.
     */
    public void afficherBonjour() {
        System.out.println("Bonjour !");
    }

    /**
     * Méthode non-void (avec return)
     */
    public int doubler(int n) {
        return n * 2;
    }


// =======================================
// 🔍 [11] CONDITIONS
// =======================================

/**
 * if : exécute un bloc si la condition est vraie
 * else if : ajoute une condition intermédiaire
 * else : exécute si aucune condition n’est remplie
 */

    if (age >= 65) {
        System.out.println("Senior");
    } else if (age >= 18) {
        System.out.println("Majeur");
    } else {
        System.out.println("Mineur");
    }


// =======================================
// 🔍 [12] BOUCLES EN JAVA
// =======================================

/**
 * 🔹 Les boucles permettent d'exécuter un bloc d'instructions plusieurs fois.
 * Java en propose trois types principaux :
 * - for : boucle avec compteur
 * - while : tant que la condition est vraie
 * - do...while : au moins une exécution
 */

// ------------------------------------
// 🔸 1. Boucle for
// ------------------------------------

    /**
     * Boucle for classique : de 0 à 4
     */
    for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

    /**
     * Boucle for à rebours
     */
    for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

// ------------------------------------
// 🔸 2. Boucle while
// ------------------------------------

    /**
     * Boucle while : s’exécute tant que la condition est vraie
     */
    int compteur = 0;
    while (compteur < 3) {
            System.out.println("compteur = " + compteur);
            compteur++;
        }

    /**
     * Exemple de boucle while infinie (à éviter sans condition d’arrêt)
     */
    // while (true) {
    //     System.out.println("Boucle infinie");
    // }

// ------------------------------------
// 🔸 3. Boucle do...while
// ------------------------------------

    /**
     * Boucle do...while : s’exécute au moins une fois
     */
    int choix;
    do {
        choix = scanner.nextInt(); // nécessite un Scanner
        System.out.println("Tu as choisi : " + choix);
    } while (choix != 0);


// =======================================
// 🔍 [13] METHODES & PARAMETRES
// =======================================

/**
 * 🔹 Une méthode est un bloc de code nommé qui peut :
 * - Recevoir des paramètres
 * - Retourner une valeur (ou pas, avec void)
 * - Être appelée plusieurs fois
 */

// -------------------------------------------
// 🔸 Méthode SANS paramètre, SANS retour
// -------------------------------------------

    /**
     * Affiche un message de bienvenue.
     */
    public void afficherBienvenue() {
        System.out.println("Bienvenue !");
    }

// -------------------------------------------
// 🔸 Méthode AVEC paramètre, SANS retour
// -------------------------------------------

    /**
     * Affiche le prénom donné en paramètre.
     * @param prenom Le prénom à afficher
     */
    public void afficherPrenom(String prenom) {
        System.out.println("Bonjour " + prenom);
    }

// -------------------------------------------
// 🔸 Méthode AVEC paramètre, AVEC retour
// -------------------------------------------

    /**
     * Additionne deux entiers.
     * @param a premier entier
     * @param b deuxième entier
     * @return la somme des deux entiers
     */
    public int addition(int a, int b) {
        return a + b;
    }

// -------------------------------------------
// 🔸 Méthode SANS paramètre, AVEC retour
// -------------------------------------------

    /**
     * Retourne un nombre aléatoire entre 0 et 9.
     * @return entier aléatoire
     */
    public int genererAleatoire() {
        Random r = new Random();
        return r.nextInt(10);
    }

// -------------------------------------------
// 🔸 Appel de méthode (dans main ou ailleurs)
// -------------------------------------------

    /**
     * Exemple d'appel dans le main :
     */
    public static void main(String[] args) {
        afficherBienvenue();            // sans paramètre
        afficherPrenom("Alice");        // avec paramètre
        int res = addition(5, 3);       // récupération de retour
        System.out.println(res);
    }


// =======================================
// 🔍 [14] PASSAGE PAR VALEUR VS PAR REFERENCE
// =======================================

/**
 * 🔹 En Java, tout est passé par **valeur**.
 * Mais :
 * - Pour les **types primitifs**, la valeur elle-même est copiée.
 * - Pour les **objets**, c’est la **référence** qui est copiée → l’objet pointé peut être modifié.
 */

// ---------------------------------------------------
// 🔸 Exemple 1 : Passage d’un type primitif (int)
// ---------------------------------------------------

    /**
     * Cette méthode tente d’incrémenter un entier.
     * @param x une copie de la valeur d’origine
     */
    public void incrementer(int x) {
        x++;
        System.out.println("Dans la méthode : x = " + x);
    }

    int a = 5;
    incrementer(a);
    System.out.println("Après méthode : a = " + a);  // reste 5

    // Résultat : l’original n’est PAS modifié

// ---------------------------------------------------
// 🔸 Exemple 2 : Passage d’un objet (ArrayList)
// ---------------------------------------------------

    /**
     * Cette méthode modifie une liste d’entiers.
     * @param liste une copie de la référence vers la liste
     */
    public void ajouterValeur(ArrayList<Integer> liste) {
        liste.add(42);
    }

    ArrayList<Integer> maListe = new ArrayList<>();
    ajouterValeur(maListe);
    System.out.println(maListe);  // contient [42]

    // Résultat : l’objet original EST modifié

// ---------------------------------------------------
// 🔸 Exemple 3 : Réassignation d’une référence
// ---------------------------------------------------

    /**
     * Cette méthode réaffecte une nouvelle liste à la référence.
     */
    public void remplacerListe(ArrayList<String> liste) {
        liste = new ArrayList<>(); // ⚠️ redirection, ne modifie pas l’original
        liste.add("Hello");
    }

    ArrayList<String> noms = new ArrayList<>();
    noms.add("Jean");
    remplacerListe(noms);
    System.out.println


// =======================================
// 🔍 [15] METHODE MAIN
// =======================================
    public static void main(String[] args) {}

// =======================================
// 🔍 [16] GETTERS & SETTERS
// =======================================
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

// =======================================
// 🔍 [17] CONSTRUCTEURS EN JAVA
// =======================================

    /**
     * 🔹 Un constructeur est une méthode spéciale appelée lors de l’instanciation d’un objet.
     * - Il porte le **même nom** que la classe.
     * - Il n’a **pas de type de retour**.
     * - On peut en définir **plusieurs** → c’est la **surcharge de constructeur**.
     */

    public class Personne {
        private String nom;
        private int age;

        /**
         * 🔸 Constructeur 1 : avec nom + âge
         * @param nom le nom de la personne
         * @param age l'âge de la personne
         */
        public Personne(String nom, int age) {
            this.nom = nom;
            this.age = age;
        }

        /**
         * 🔸 Constructeur 2 : avec seulement le nom
         * L'âge sera défini par défaut à 0.
         */
        public Personne(String nom) {
            this(nom, 0); // appel de l’autre constructeur
        }

        /**
         * 🔸 Constructeur 3 : sans paramètre
         * Affecte des valeurs par défaut.
         */
        public Personne() {
            this("Inconnu", 0);
        }

        /**
         * Affiche les infos de la personne.
         */
        public void afficher() {
            System.out.println("Nom : " + nom + " | Âge : " + age);
        }
    }


// =======================================
// 🔍 [18] METHODES GENERALES UTILES
// =======================================

    /**
     * Vérifie si un nombre est pair.
     * @param n entier à tester
     * @return true si pair, false sinon
     */
    public boolean estPair(int n) {
        return n % 2 == 0;
    }

    /**
     * Vérifie si un nombre est premier.
     * @param n entier à tester
     * @return true si nombre premier
     */
    public boolean estPremier(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /**
     * Retourne le maximum entre deux entiers.
     * @param a premier entier
     * @param b second entier
     * @return le plus grand des deux
     */
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    /**
     * Retourne la moyenne d’un tableau d’entiers.
     * @param tab tableau d'entiers
     * @return moyenne (double)
     */
    public double moyenne(int[] tab) {
        if (tab.length == 0) return 0;
        int somme = 0;
        for (int n : tab) somme += n;
        return (double) somme / tab.length;
    }

    /**
     * Inverse une chaîne de caractères.
     * @param texte chaîne d'entrée
     * @return chaîne inversée
     */
    public String inverser(String texte) {
        return new StringBuilder(texte).reverse().toString();
    }

    /**
     * Calcule la somme des éléments d'une liste d'entiers.
     * @param liste liste d'entiers
     * @return somme totale
     */
    public int sommeListe(ArrayList<Integer> liste) {
        int somme = 0;
        for (int n : liste) somme += n;
        return somme;
    }

    /**
     * Compte le nombre d'occurrences d'un caractère dans une chaîne.
     * @param phrase la phrase à analyser
     * @param c caractère à compter
     * @return nombre d’occurrences
     */
    public int compterOccurrences(String phrase, char c) {
        int compteur = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == c) compteur++;
        }
        return compteur;
    }

    /**
     * Vérifie si une liste contient un élément donné.
     * @param liste liste à parcourir
     * @param valeur élément à chercher
     * @return true si présent, false sinon
     */
    public boolean contient(ArrayList<String> liste, String valeur) {
        return liste.contains(valeur);
    }


// =======================================
// 🔍 [19] METHODES UTILISEES FREQUEMMENT (complement)
// =======================================

/**
 * 🔹 Méthodes classiques et souvent utilisées dans les TP/examens
 * qui ne figurent pas déjà dans la section [18].
 */

// ----------------------------------------------------
// afficherListe : affiche chaque élément d'une liste
// ----------------------------------------------------

    /**
     * Affiche tous les éléments d’une liste de chaînes.
     * @param liste la liste à parcourir
     */
    public void afficherListe(ArrayList<String> liste) {
        for (String e : liste) {
            System.out.println(e);
        }
    }

// ----------------------------------------------------
// max : retourne le maximum entre deux doubles
// ----------------------------------------------------

    /**
     * Renvoie le maximum entre deux doubles.
     * @param x première valeur
     * @param y deuxième valeur
     * @return la plus grande des deux
     */
    public double max(double x, double y) {
        return (x > y) ? x : y;
    }

// ----------------------------------------------------
// min : retourne le plus petit entier d’un tableau
// ----------------------------------------------------

    /**
     * Renvoie le plus petit entier dans un tableau.
     * @param tab tableau d’entiers
     * @return minimum du tableau
     */
    public int min(int[] tab) {
        int min = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] < min) min = tab[i];
        }
        return min;
    }

// ----------------------------------------------------
// copierListe : crée une copie d’une liste
// ----------------------------------------------------

    /**
     * Copie les éléments d’une liste dans une nouvelle liste.
     * @param origine liste source
     * @return nouvelle liste contenant les mêmes éléments
     */
    public ArrayList<String> copierListe(ArrayList<String> origine) {
        return new ArrayList<>(origine);
    }


// =======================================
// 🔍 [20] JAVADOC
// =======================================
/**
 * 🔹 COMMENTAIRE JAVADOC
 * Utilisé pour documenter des classes, attributs ou méthodes.
 * Génère automatiquement de la documentation HTML avec javadoc.
 * Commence par /** et se termine par *\/
 * Exemple : voir les méthodes ci-dessous.
 */

    /**
     * Cette méthode retourne l'âge d'un utilisateur.
     * @return int : âge
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Cette méthode définit le prénom d’un utilisateur.
     * @param prenom Le prénom à attribuer à l’utilisateur
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Cette méthode affiche un message de bienvenue dans la console.
     */
    public void afficherBienvenue() {
        System.out.println("Bienvenue !");
    }

    /**
     * Calcule la somme de deux entiers.
     * @param a premier entier
     * @param b deuxième entier
     * @return int : la somme des deux entiers
     */
    public int somme(int a, int b) {
        return a + b;
    }

// =======================================
// 🔍 [21] TABLEAUX (1 dimension)
// =======================================

/**
 * 🔹 Un tableau est une structure fixe qui contient des éléments de même type.
 * 🔹 On y accède via des indices commençant à 0.
 */

    /**
     * Déclaration + initialisation directe
     */
    int[] t = {1, 2, 3};

    /**
     * Déclaration + allocation
     */
    int[] notes = new int[5]; // 5 cases initialisées à 0

    /**
     * Affectation d’une valeur
     */
        notes[0] = 15;

    /**
     * Parcours avec boucle for
     */
    for (int i = 0; i < notes.length; i++) {
        System.out.println("notes[" + i + "] = " + notes[i]);
    }

    /**
     * Parcours avec foreach
     */
    for (int n : notes) {
        System.out.println(n);
    }

    /**
     * Longueur d’un tableau
     */
    int taille = notes.length;

    /**
     * Copier un tableau (manuel)
     */
    int[] copie = new int[notes.length];
    for (int i = 0; i < notes.length; i++) {
        copie[i] = notes[i];
    }


// =======================================
// 🔍 [22] MATRICES (tableaux à 2 dimensions)
// =======================================

/**
 * 🔹 Une matrice est un tableau de tableaux (2 dimensions)
 * 🔹 Utilisé pour représenter des grilles, tableaux numériques, etc.
 */

    /**
     * Déclaration + allocation 3x3
     */
    int[][] m = new int[3][3]; // matrice de 3 lignes, 3 colonnes

    /**
     * Initialisation manuelle
     */
    m[0][0] = 1;
    m[1][2] = 5;

    /**
     * Parcours avec deux boucles for
     */
    for (int i = 0; i < m.length; i++) {
        for (int j = 0; j < m[i].length; j++) {
            System.out.print(m[i][j] + " ");
        }
        System.out.println();
    }

    /**
     * Initialisation directe
     */
    int[][] matrice = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    /**
     * Affichage avec foreach
     */
    for (int[] ligne : matrice) {
        for (int valeur : ligne) {
            System.out.print(valeur + " ");
        }
        System.out.println();
    }


// =======================================
// 🔍 [23] LISTES DYNAMIQUES : ARRAYLIST, LINKEDLIST, VECTOR
// =======================================

/**
 * 🔹 Les listes dynamiques permettent :
 * - d’ajouter ou retirer des éléments à la volée
 * - d’adapter leur taille automatiquement
 * - d’accéder aux éléments via un index (comme un tableau)
 *
 * Java propose 3 principales implémentations :
 * - ArrayList : rapide pour l'accès par index
 * - LinkedList : rapide pour les ajouts/suppressions en milieu de liste
 * - Vector : version synchronisée (thread-safe) d'ArrayList
 */

// ----------------------------------------------------
// 🔸 ArrayList
// ----------------------------------------------------

    /**
     * Liste de chaînes initialisée vide
     */
    ArrayList<String> noms = new ArrayList<>();

    noms.add("Alice");
    noms.add("Bob");
    noms.get(1);            // "Bob"
    noms.remove("Alice");   // supprime "Alice"
    noms.size();            // retourne 1

// ----------------------------------------------------
// 🔸 LinkedList
// ----------------------------------------------------

    /**
     * Liste doublement chaînée, optimisée pour ajouts/suppressions
     */
    LinkedList<String> file = new LinkedList<>();

    file.add("Tâche1");
    file.addFirst("Urgent");
    file.addLast("Optionnel");
    file.removeLast();      // supprime le dernier élément

// ----------------------------------------------------
// 🔸 Vector
// ----------------------------------------------------

    /**
     * Liste synchronisée, peu utilisée sauf en multithreading
     */
    Vector<Integer> scores = new Vector<>();

    scores.add(10);
    scores.add(20);
    scores.set(0, 15);       // remplace la valeur à l’index 0

// ----------------------------------------------------
// 🔸 Méthodes communes utiles
// ----------------------------------------------------

    /**
     * Méthodes partagées par ArrayList, LinkedList, Vector :
     * - add(element)              → ajoute à la fin
     * - add(index, element)       → insère à l’index donné
     * - get(index)                → récupère un élément
     * - remove(index/element)     → supprime un élément
     * - contains(element)         → vérifie la présence
     * - size()                    → retourne le nombre d’éléments
     * - isEmpty()                 → true si vide
     * - clear()                   → vide la liste
     */


// =======================================
// 🔍 [24] DICTIONNAIRE : HASHMAP
// =======================================

/**
 * 🔹 Une HashMap permet d’associer des clés à des valeurs (structure clé → valeur).
 * - Les clés doivent être uniques
 * - Les valeurs peuvent être dupliquées
 * - Accès rapide par clé
 *
 * Syntaxe : HashMap<Clé, Valeur> map = new HashMap<>();
 */

    import java.util.HashMap;

    HashMap<String, Integer> notes = new HashMap<>();

    /**
     * put(K, V) : ajoute ou remplace une paire clé/valeur
     */
    notes.put("Alice", 15);
    notes.put("Bob", 12);
    notes.put("Alice", 18); // Remplace 15 par 18

    /**
     * get(K) : retourne la valeur associée à la clé
     */
    int noteAlice = notes.get("Alice"); // 18

    /**
     * containsKey(K) : retourne true si la clé existe
     */
    boolean aBob = notes.containsKey("Bob"); // true

    /**
     * remove(K) : supprime la paire pour la clé donnée
     */
    notes.remove("Bob");

    /**
     * keySet() : retourne un Set contenant toutes les clés
     */
    for (String nom : notes.keySet()) {
        System.out.println(nom + " → " + notes.get(nom));
    }

//Exemple de parcours avec for
    Map myMap = new HashMap();
    for (String cle : myMap.keySet()){
        Object valeur = myMap.get(cle);
    }

    /**
     * values() : retourne une Collection contenant toutes les valeurs
     */
    for (int valeur : notes.values()) {
        System.out.println(valeur);
    }

    /**
     * size() : nombre de paires dans la map
     */
    int nbElements = notes.size();

    /**
     * isEmpty() : true si la map est vide
     */
    boolean estVide = notes.isEmpty();


// =======================================
// 🔍 [25] ITERATOR
// =======================================

/**
 * 🔹 Un Iterator permet de parcourir une collection de manière uniforme
 * sans dépendre de la structure utilisée (ArrayList, HashSet, etc.).
 *
 * 🔸 Méthodes principales :
 * - hasNext() : y a-t-il un élément suivant ?
 * - next() : retourne l’élément suivant
 * - remove() : supprime l’élément courant (optionnel)
 *
 * ⚠️ Ne jamais modifier une collection avec add/remove pendant l'itération sauf via l'iterator lui-même.
 */

    import java.util.Iterator;
    import java.util.ArrayList;
    import java.util.HashSet;

// ------------------------------------------------------------
// 🔸 Exemple avec ArrayList
// ------------------------------------------------------------

    ArrayList<String> noms = new ArrayList<>();
    noms.add("Alice");
    noms.add("Bob");
    noms.add("Claire");

    Iterator<String> it = noms.iterator();

    /**
     * Parcours avec iterator
     */
    while (it.hasNext()) {
        String nom = it.next();
        System.out.println(nom);

        // Supprimer un nom précis (correct)
        if (nom.equals("Bob")) {
            it.remove(); // autorisé ici
        }
    }

// ------------------------------------------------------------
// 🔸 Exemple avec HashSet
// ------------------------------------------------------------

    HashSet<Integer> valeurs = new HashSet<>();
    valeurs.add(10);
    valeurs.add(20);
    valeurs.add(30);

    Iterator<Integer> iter = valeurs.iterator();

    /**
     * Parcours et suppression sécurisée d’éléments < 25
     */
    while (iter.hasNext()) {
        int val = iter.next();
        if (val < 25) {
            iter.remove();
        }
    }


// =======================================
// 🔍 [26] ENSEMBLES (SET) : HASHSET, TREESET
// =======================================

    import java.util.HashSet;
    import java.util.TreeSet;

    /**
     * 🔹 Un Set est une collection sans doublons.
     * 🔸 Deux types principaux :
     * - HashSet : rapide, ordre non garanti
     * - TreeSet : trié automatiquement (ordre naturel ou avec Comparator)
     */

// ----------------------------------------
// 🔸 HashSet : ensemble non trié
// ----------------------------------------

    HashSet<String> couleurs = new HashSet<>();
    couleurs.add("Rouge");
    couleurs.add("Vert");
    couleurs.add("Bleu");
    couleurs.add("Rouge"); // ignoré (déjà présent)

    /**
     * Affiche toutes les couleurs (ordre non garanti)
     */
    for (String c : couleurs) {
        System.out.println(c);
    }

// ----------------------------------------
// 🔸 TreeSet : ensemble trié automatiquement
// ----------------------------------------

    TreeSet<Integer> nombres = new TreeSet<>();
    nombres.add(50);
    nombres.add(20);
    nombres.add(80);

    /**
     * Affiche les valeurs dans l’ordre : 20, 50, 80
     */
    for (int n : nombres) {
        System.out.println(n);
    }

// ----------------------------------------
// 🔸 Méthodes utiles communes à tous les Set
// ----------------------------------------

    /**
     * - add(obj)        → ajoute un élément (si absent)
     * - remove(obj)     → supprime un élément
     * - contains(obj)   → teste la présence d’un élément
     * - size()          → retourne le nombre d’éléments
     * - isEmpty()       → true si le Set est vide
     * - clear()         → vide complètement le Set
     * - iterator()      → permet un parcours personnalisé (voir point [25])
     */


// =======================================
// 🔍 [27] OBJETS & APPELS
// =======================================

    /**
     * 🔹 Création d’un objet
     */
    Personne p = new Personne("Alice");

    /**
     * 🔹 Appel de méthode de l’objet
     */
    p.afficher();

    /**
     * 🔹 Appel d’un getter pour accéder à une valeur
     */
    String nom = p.getNom();

    /**
     * 🔹 Passage d’un objet en paramètre
     */
    public void saluer(Personne pers) {
        System.out.println("Bonjour " + pers.getNom());
    }


// =======================================
// 🔍 [28] ABSTRACTION & MODULARISATION
// =======================================

/**
 * 🔹 ABSTRACTION
 * L’abstraction consiste à cacher les détails d’implémentation et à ne montrer que l’essentiel.
 * On se concentre sur "ce que fait" un objet, et non sur "comment il le fait".
 *
 * En Java, cela se fait via :
 * - Classes abstraites (`abstract class`)
 * - Interfaces
 * - Encapsulation (utilisation des getters/setters au lieu d’un accès direct)
 */

// ------------------------------------------------------------
// 🔸 Exemple : classe abstraite
// ------------------------------------------------------------

    /**
     * Classe abstraite : on ne peut pas l’instancier directement.
     */
    public abstract class Animal {

        /**
         * Méthode abstraite : doit être implémentée par les sous-classes
         */
        public abstract void crier();

        /**
         * Méthode concrète : déjà définie
         */
        public void manger() {
            System.out.println("Je mange");
        }
    }

    public class Chien extends Animal {
        @Override
        public void crier() {
            System.out.println("Wouf !");
        }
    }

// ------------------------------------------------------------
// 🔹 MODULARISATION
// ------------------------------------------------------------

    /**
     * 🔹 La modularisation consiste à :
     * - Découper un programme en **unités logiques réutilisables**
     * - Favoriser la **lisibilité, maintenance, et réutilisabilité**
     *
     * Chaque classe, chaque méthode devrait avoir **une responsabilité claire**.
     */

    // Exemple de bonne modularisation :
    // Classe Chien → données et comportements liés à un chien
    // Classe Veterinaire → actions de soins sur un animal
    // Classe Application → contient juste le `main`

// ------------------------------------------------------------
// 🔸 Illustration : séparation logique des responsabilités
// ------------------------------------------------------------

    /**
     * Gère les données d’un animal
     */
    public class Animal {
        private String nom;

        public Animal(String nom) {
            this.nom = nom;
        }

        public String getNom() {
            return nom;
        }
    }

    /**
     * Gère les traitements sur l’animal (soins, nourriture, etc.)
     */
    public class Veterinaire {
        public void nourrir(Animal a) {
            System.out.println(a.getNom() + " est nourri.");
        }
    }

    /**
     * Gère l’exécution principale du programme
     */
    public class Application {
        public static void main(String[] args) {
            Animal chat = new Animal("Miaou");
            Veterinaire vet = new Veterinaire();
            vet.nourrir(chat);
        }
    }


// =======================================
// 🔍 [29] HERITAGE, INTERFACES & POLYMORPHISME
// =======================================

/**
 * Cette section couvre les fondements de l’orienté objet en Java :
 * - L’héritage (extends)
 * - L’appel de super()
 * - Les niveaux de visibilité
 * - L’abstraction et les interfaces
 * - Le polymorphisme (type statique vs dynamique)
 * - override / overloading
 */

// --------------------------------------
// 🔸 29.1 extends, superclasse, sous-classes
// --------------------------------------

    /**
     * Une sous-classe hérite d’une superclasse avec `extends`
     */
    class Vehicule {
        public void demarrer() {
            System.out.println("Démarrage générique");
        }
    }

    class Voiture extends Vehicule {
        public void klaxonner() {
            System.out.println("Bip bip !");
        }
    }

// --------------------------------------
// 🔸 29.2 constructeurs avec super()
// --------------------------------------

    /**
     * La première ligne du constructeur d’une sous-classe peut appeler le constructeur parent.
     */
    class Animal {
        public Animal(String nom) {
            System.out.println("Animal créé : " + nom);
        }
    }

    class Chat extends Animal {
        public Chat() {
            super("Chat"); // appel au constructeur parent
        }
    }

// --------------------------------------
// 🔸 29.3 droits d’accès : private, protected, public
// --------------------------------------

    /**
     * private     → uniquement dans la classe
     * protected   → dans le package + les sous-classes
     * public      → accessible partout
     */

    class Exemple {
        private int a;        // visible dans Exemple seulement
        protected int b;      // visible dans les sous-classes
        public int c;         // visible partout
    }

// --------------------------------------
// 🔸 29.4 classes abstraites & méthodes concrètes
// --------------------------------------

    abstract class Canin {
        /**
         * Méthode concrète
         */
        public void bouger() {
            System.out.println("Je me déplace");
        }

        /**
         * Méthode abstraite à implémenter
         */
        public abstract void crier();
    }

    class Loup extends Canin {
        @Override
        public void crier() {
            System.out.println("Ahouuu !");
        }
    }

// --------------------------------------
// 🔸 29.5 Interface ICallable : constante, getNom(), setNom()
// --------------------------------------

    interface ICallable {
        String NOM_PAR_DEFAUT = ""; // constante publique statique implicite

        String getNom();    // méthode abstraite
        void setNom(String nom);
    }

    class Chien implements ICallable {
        private String nom;

        public String getNom() {
            return ICallable.NOM_PAR_DEFAUT + this.nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }
    }

// --------------------------------------
// 🔸 29.6 Type statique vs type dynamique
// --------------------------------------

    /**
     * Type statique : connu à la compilation (déclaration)
     * Type dynamique : le type réel de l'objet à l'exécution
     */
    Canin c1 = new Loup();   // statique = Canin, dynamique = Loup
    c1.crier();              // Appelle la méthode de Loup (runtime)

// --------------------------------------
// 🔸 29.7 override vs overloading
// --------------------------------------

    /**
     * Override : redéfinir une méthode héritée
     */
    class Animal {
        public void parler() {
            System.out.println("...");
        }
    }

    class Oiseau extends Animal {
        @Override
        public void parler() {
            System.out.println("Cui cui !");
        }
    }

    /**
     * Overloading : plusieurs méthodes avec le même nom mais des paramètres différents
     */
    class Calculatrice {
        public int addition(int a, int b) {
            return a + b;
        }

        public double addition(double a, double b) {
            return a + b;
        }
    }

// --------------------------------------
// 🔸 29.8 Comparable, Comparator, equals & hashCode
// --------------------------------------

    /**
     * 🔹 Comparable : définit un ordre naturel d'une classe.
     * - Implémente la méthode compareTo()
     * - Utilisé par Collections.sort(liste)
     */

    class Personne implements Comparable<Personne> {
        private String nom;

        public Personne(String nom) {
            this.nom = nom;
        }

        public String getNom() {
            return nom;
        }

        @Override
        public int compareTo(Personne autre) {
            return this.nom.compareTo(autre.nom); // ordre alphabétique
        }
    }

    /**
     * 🔹 Comparator : permet de trier autrement que par l’ordre naturel
     * - Implémente la méthode compare()
     * - S'utilise avec Collections.sort(liste, comparator)
     */

    import java.util.Comparator;

    class ComparateurParLongueur implements Comparator<Personne> {
        @Override
        public int compare(Personne p1, Personne p2) {
            return Integer.compare(p1.getNom().length(), p2.getNom().length());
        }
    }

    /**
     * 🔹 equals() : comparaison de contenu logique entre objets
     * 🔹 hashCode() : utilisé pour placer/trouver les objets dans les collections de type Hash (HashMap, HashSet…)
     *
     * ⚠️ Si deux objets sont égaux selon equals(), ils doivent avoir le même hashCode().
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personne)) return false;
        Personne personne = (Personne) o;
        return nom.equals(personne.nom);
    }

    @Override
    public int hashCode() {
        return nom.hashCode(); // ou Objects.hash(nom);
    }


// =======================================
// 🔍 [30] CARTES CRC
// =======================================

    /**
     * 🔹 Les cartes CRC (Classe - Responsabilité - Collaboration) servent à modéliser :
     * - Quelle est la responsabilité d'une classe ?
     * - Avec quelles autres classes elle interagit ?
     *
     * 🔸 Ce sont des outils de conception orientée objet utilisés avant l’écriture du code.
     */

    // 🧩 Exemple : modèle Client - Commande

    // -----------------------------------------------------
    // Classe : Client
    // Responsabilité : gérer les commandes
    // Collaboration : Commande
    // -----------------------------------------------------

    public class Client {
        private String nom;
        private ArrayList<Commande> commandes = new ArrayList<>();

        /**
         * Ajoute une commande au client.
         * @param commande commande à ajouter
         */
        public void ajouterCommande(Commande commande) {
            commandes.add(commande);
        }

        /**
         * Affiche toutes les commandes du client.
         */
        public void afficherCommandes() {
            for (Commande c : commandes) {
                System.out.println(c.getResume());
            }
        }
    }

    // -----------------------------------------------------
    // Classe : Commande
    // Responsabilité : représenter une commande client
    // Collaboration : Produit
    // -----------------------------------------------------

    public class Commande {
        private int numero;
        private ArrayList<String> produits = new ArrayList<>();

        public Commande(int numero) {
            this.numero = numero;
        }

        public void ajouterProduit(String produit) {
            produits.add(produit);
        }

        public String getResume() {
            return "Commande #" + numero + " → " + produits.toString();
        }
    }


// =======================================
// 🔍 [31] STRUCTURATION D’UN PROJET JAVA
// =======================================
// packages, nommage, séparation logique

// =======================================
// 🔍 [32] UTILISATION DES BIBLIOTHEQUES
// =======================================

/**
 * 🔹 Java propose des bibliothèques (packages) contenant des classes prêtes à l’emploi.
 * 🔸 Pour les utiliser, on les importe avec `import nom.de.la.classe;`
 */

    // 📦 java.util : structures de données, outils généraux
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.HashSet;
    import java.util.TreeSet;
    import java.util.Collections;
    import java.util.Random;
    import java.util.Scanner;

    // 📦 java.io : gestion de fichiers
    import java.io.File;
    import java.io.FileNotFoundException;
    import java.io.PrintWriter;

    // 📦 java.time : manipulation de dates et heures
    import java.time.LocalDate;
    import java.time.LocalDateTime;

    // 📦 java.math : calculs mathématiques avancés
    import java.math.BigDecimal;
    import java.math.RoundingMode;

// ---------------------------------------------------------
// 🔸 Exemple 1 : Scanner pour lire au clavier (java.util)
// ---------------------------------------------------------

    Scanner sc = new Scanner(System.in);
    System.out.print("Entrez votre nom : ");
    String nom = sc.nextLine();

// ---------------------------------------------------------
// 🔸 Exemple 2 : Écriture dans un fichier (java.io)
// ---------------------------------------------------------

    try {
        PrintWriter writer = new PrintWriter("sortie.txt");
        writer.println("Ceci est un fichier.");
        writer.close();
    } catch (FileNotFoundException e) {
                System.out.println("Erreur d’écriture dans le fichier.");
    }


// =======================================
// 🔍 [33] CLASSES UTILES : STRING, INTEGER, MATH, RANDOM
// =======================================

/**
 * 🔹 Ce point regroupe les classes standard les plus utilisées en Java.
 * 🔸 Elles contiennent des méthodes utilitaires incontournables.
 */

// ----------------------------------------------------
// 🔸 String : manipulation de chaînes de caractères
// ----------------------------------------------------

    /**
     * Les chaînes sont immuables.
     * Toutes les méthodes renvoient une **nouvelle** chaîne.
     */

    String texte = "Bonjour";
    texte.length();               // → 7
    texte.charAt(1);              // → 'o'
    texte.toUpperCase();          // → "BONJOUR"
    texte.substring(1, 4);        // → "onj"
    texte.equals("Bonjour");      // comparaison
    texte.contains("jou");        // → true
    texte.replace("jour", "soir");// → "Bonsoir"

// ----------------------------------------------------
// 🔸 Integer : wrapper pour les entiers
// ----------------------------------------------------

    /**
     * Permet de convertir des chaînes en entiers et vice versa
     */

    int a = Integer.parseInt("123");     // String → int
    String s = Integer.toString(456);    // int → String
    Integer i = Integer.valueOf(789);    // int → Integer objet
    int b = i.intValue();                // Integer → int

// ----------------------------------------------------
// 🔸 Math : fonctions mathématiques
// ----------------------------------------------------

    Math.max(10, 20);             // → 20
    Math.min(5, 2);               // → 2
    Math.abs(-4);                 // → 4
    Math.sqrt(9);                 // → 3.0
    Math.pow(2, 3);               // → 8.0
    Math.round(3.6);              // → 4
    Math.floor(3.9);              // → 3.0
    Math.ceil(3.1);               // → 4.0
    Math.random();                // → double entre 0.0 et 1.0

// ----------------------------------------------------
// 🔸 Random : génération de nombres aléatoires
// ----------------------------------------------------

    import java.util.Random;

    Random r = new Random();

    int nb = r.nextInt(10);       // → entier entre 0 et 9
    boolean tirage = r.nextBoolean(); // → true ou false
    double reel = r.nextDouble();     // → [0.0, 1.0[


// =======================================
// 🔍 [34] COLLECTIONS : METHODES UTILES
// =======================================

    import java.util.ArrayList;
    import java.util.Collections;

    /**
     * 🔹 La classe `Collections` contient des méthodes statiques pour manipuler les collections (List, Set, etc.)
     * 🔸 Très utilisées avec les listes : tri, mélange, inversion, recherche, remplacement, etc.
     */

    ArrayList<Integer> liste = new ArrayList<>();
    Collections.addAll(liste, 5, 2, 9, 1, 4);

// ----------------------------------------------------
// 🔸 sort : trie la liste dans l'ordre naturel croissant
// ----------------------------------------------------

    Collections.sort(liste); // [1, 2, 4, 5, 9]

    /**
     * Trie les éléments d'une liste selon leur ordre naturel
     */

// ----------------------------------------------------
// 🔸 reverse : inverse l’ordre des éléments
// ----------------------------------------------------

    Collections.reverse(liste); // [9, 5, 4, 2, 1]

    /**
     * Inverse les éléments de la liste en place
     */

// ----------------------------------------------------
// 🔸 shuffle : mélange aléatoirement les éléments
// ----------------------------------------------------

    Collections.shuffle(liste);

    /**
     * Mélange les éléments de manière aléatoire
     */

// ----------------------------------------------------
// 🔸 min / max : plus petit et plus grand élément
// ----------------------------------------------------

    int minimum = Collections.min(liste);
    int maximum = Collections.max(liste);

    /**
     * Renvoie l’élément minimum/maximum selon l’ordre naturel
     */

// ----------------------------------------------------
// 🔸 binarySearch : recherche binaire (liste triée)
// ----------------------------------------------------

    Collections.sort(liste); // Nécessaire avant
    int index = Collections.binarySearch(liste, 4);

    /**
     * Recherche d’un élément (renvoie son index ou < 0 si non trouvé)
     */

// ----------------------------------------------------
// 🔸 Tri d’objets avec Comparable
// ----------------------------------------------------

    ArrayList<Personne> personnes = new ArrayList<>();
    personnes.add(new Personne("Alice"));
    personnes.add(new Personne("Zoé"));
    personnes.add(new Personne("Bob"));

    Collections.sort(personnes); // utilise compareTo → tri alphabétique

// ----------------------------------------------------
// 🔸 Tri d’objets avec Comparator personnalisé
// ----------------------------------------------------

    Collections.sort(personnes, new ComparateurParLongueur()); // tri par longueur du nom

// ----------------------------------------------------
// 🔸 fill : remplace tous les éléments d’une liste
// ----------------------------------------------------

    Collections.fill(liste, 0); // [0, 0, 0, 0, 0]

    /**
     * Remplit toute la liste avec la même valeur
     */

// ----------------------------------------------------
// 🔸 copy : copie le contenu d’une liste dans une autre
// ----------------------------------------------------

    ArrayList<Integer> dest = new ArrayList<>(Collections.nCopies(liste.size(), 0));
    Collections.copy(dest, liste);

    /**
     * Copie la liste source dans une liste de destination
     * La destination doit avoir la même taille ou plus
     */



// ----------------------------------------------------
// [35] EXCEPTION
// ----------------------------------------------------

// ------------------------------
    // 35.1 Structure try-catch-finally
    // ------------------------------
        System.out.println("== 35.1 try-catch-finally ==");
        try {
    int res = 10 / 0; // Provoque une ArithmeticException (division par zéro)
        } catch (ArithmeticException e) {
            System.out.println("Division par zéro interdite !");
        } finally {
                // Ce bloc s'exécute toujours, qu'il y ait une exception ou non
                System.out.println("Ce bloc s'exécute toujours !");
        }

                // ------------------------------
                // 35.2 throws et throw
                // ------------------------------
                System.out.println("\n== 35.2 throw et throws ==");
        try {
    testException(); // Cette méthode signale qu'elle peut lancer une IOException
        } catch (IOException e) {
            System.out.println("Erreur simulée : " + e.getMessage());
            }

            // ------------------------------
            // 35.3 Exception personnalisée
            // ------------------------------
            System.out.println("\n== 35.3 Exception personnalisée ==");
        try {
    validerNom("Al"); // Nom trop court → déclenche MauvaisNomException
        } catch (MauvaisNomException e) {
            System.out.println("Erreur sur le nom : " + e.getMessage());
            }

            // ------------------------------
            // 35.4 Exception vérifiée vs non vérifiée
            // ------------------------------
            System.out.println("\n== 35.4 Exception vérifiée vs non vérifiée ==");

    // Exception vérifiée (checked) : doit être gérée par try-catch ou throws
    Exception e1 = new IOException();
        System.out.println("Exception vérifiée instanciée : " + e1);

    // Exception non vérifiée (unchecked) : pas obligatoire de la gérer
    RuntimeException e2 = new NullPointerException();
        System.out.println("Exception non vérifiée instanciée : " + e2);
    }

    // 35.2 : Méthode qui lance une exception vérifiée via "throws"
    public static void testException() throws IOException {
        throw new IOException("Fichier introuvable !");
    }

    // 35.3 : Méthode qui lance une exception personnalisée si le nom est trop court
    public static void validerNom(String nom) throws MauvaisNomException {
        if (nom.length() < 3) {
            throw new MauvaisNomException("Nom trop court !");
        } else {
            System.out.println("Nom accepté : " + nom);
        }
    }
}

    // 35.3 : Classe pour l'exception personnalisée
    class MauvaisNomException extends Exception {
        public MauvaisNomException(String message) {
            super(message);
        }
    }


//Test d’une exception personnalisée / ex: problème de saisie
        public class TestProblemeDeSaisieException Exception {
            public static void main(java.lang.String[] args){
                try{
                    operation(args); }
                catch (ProblemeDeSaisieException e) {
                    System.err.println(“Veuillez entrer un parameter s’il vous plait); }

       private void operation(String[] args) throws ProblemeDeSaisieException{
           if (args.length == 0){
               throw new ProblemeDeSaisieException(“Erreur: pas de paramètre rentré! "); }
           }
       }

import java.util.ArrayList;

                public class Main {
                    public static void main(String[] args) {

                        String[] lignes = {
                                "Chocolat;2.5;30",
                                "Biscuit;abc;20",        // Prix invalide
                                "Pain;1.2;xyz",          // Stock invalide
                                "Fromage;12.0;2000",     // Stock trop grand
                                "Lait;1.5;50",
                                ";;",                    // Mauvais format
                                "Eau;0.9;25"
                        };

                        ArrayList<Produit> produits = parseProduits(lignes);

                        System.out.println("\nProduits valides :");
                        for (Produit p : produits) {
                            System.out.println(p);
                        }
                    }

                    public static ArrayList<Produit> parseProduits(String[] lignes) {
                        ArrayList<Produit> pdc = new ArrayList<>();

                        int compteur = 0;
                        for (String ligne : lignes) {
                            compteur++;
                            if (compteur > 50) break;

                            try {
                                String[] produits = ligne.split(";");
                                if (produits.length != 3) {
                                    throw new Exception("Ligne " + compteur + " ignorée : format incorrect");
                                }

                                String nom = produits[0];
                                double prix = Double.parseDouble(produits[1]);
                                int stock = Integer.parseInt(produits[2]);

                                if (prix < 0.5) {
                                    throw new Exception("Ligne " + compteur + " ignorée : prix trop bas");
                                }

                                if (stock < 0 || stock > 1000) {
                                    throw new Exception("Ligne " + compteur + " ignorée : stock invalide");
                                }

                                pdc.add(new Produit(nom, prix, stock));

                            } catch (NumberFormatException e) {
                                System.out.println("Ligne " + compteur + " ignorée : type de valeur incorrect");
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        return pdc;
                    }
                }


/*
==================
 Récapitulatif Théorique
==================

1. Qu'est-ce qu'une exception ?
Une exception est une erreur qui se produit à l'exécution du programme. Elle doit être gérée sinon le programme plante.

2. Trois manières de gérer une exception :
- try-catch : gérer sur place
- throws : propager vers l'appelant
- throw new : créer et lancer une exception à la main

3. Exceptions vérifiées vs non vérifiées :
- Vérifiée : IOException, SQLException (doivent être gérées ou remontées)
- Non vérifiée : NullPointerException, ArithmeticException (facultatif)

4. finally :
Bloc exécuté à tous les coups, même en cas d'erreur. Utilisé pour fermer fichiers, nettoyer mémoire, etc.

5. Mots-clés :
- try : code qui peut planter
- catch : capture une exception
- throw : créer une exception
- throws : annonce que la méthode peut lancer une exception
- finally : bloc toujours exécuté

6. Exemple de classe personnalisée : TropPetitException extends Exception

7. A retenir :
- throw new = je crée une exception
- throws = je préviens qu'il y a un risque d'erreur
- try-catch = je réagis à une erreur
- finally = toujours exécuté
*/



// ==========================================================
// [36] COMPARAISONS EN JAVA
// ==========================================================

    /*----------------------------------------------------------
     * 36.1 == vs .equals()
     *----------------------------------------------------------
     * == compare les références (adresse en mémoire)
     * .equals() compare le contenu (si redéfini dans la classe)
     */

    String a = new String("test");
    String b = new String("test");
System.out.println(a == b);        // false → pas même objet
System.out.println(a.equals(b));   // true → contenu égal

    /*----------------------------------------------------------
     * 36.2 equalsIgnoreCase() pour les chaînes
     *----------------------------------------------------------
     * Compare deux chaînes sans tenir compte des majuscules
     */

    String nom1 = "Alice";
    String nom2 = "alice";
System.out.println(nom1.equalsIgnoreCase(nom2)); // true

    /*----------------------------------------------------------
     * 36.3 Comparaison de nombres
     *----------------------------------------------------------
     */

    int x = 5;
    int y = 10;

System.out.println(x == y);  // false
System.out.println(x < y);   // true
System.out.println(x >= y);  // false

    /*----------------------------------------------------------
     * 36.4 compareTo() sur String (ordre alphabétique)
     *----------------------------------------------------------
     * Renvoie :
     *   - négatif si this < autre
     *   - 0 si égal
     *   - positif si this > autre
     */

    String s1 = "apple";
    String s2 = "banana";

    int res = s1.compareTo(s2);
System.out.println(res); // < 0 car "apple" vient avant "banana"

    /*----------------------------------------------------------
     * 36.5 compareTo() avec Comparable sur une classe
     *----------------------------------------------------------
     */

    public class Personne implements Comparable<Personne> {
        String nom;

        public int compareTo(Personne autre) {
            return this.nom.compareTo(autre.nom);
        }
    }

    /*----------------------------------------------------------
     * 36.6 Comparator (externe à la classe)
     *----------------------------------------------------------
     * Utile pour comparer sur un autre critère, par ex. la longueur du nom
     */

    Comparator<Personne> compParLongueur = (p1, p2) -> p1.nom.length() - p2.nom.length();

    /*----------------------------------------------------------
     * 36.7 instanceof (vérification de type)
     *----------------------------------------------------------
     */

    Object obj = "Hello";
if (obj instanceof String) {
            System.out.println("C'est une String !");
}

    /*----------------------------------------------------------
     * 36.8 equals() + hashCode() pour objets personnalisés
     *----------------------------------------------------------
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Personne other = (Personne) obj;
        return this.nom.equals(other.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }


                public class SimpleCompare {

                    // 1) Comparer deux String pour tester une égalité (contenu)
                    public static boolean compareString(String s1, String s2) {
                        // Utilise equals pour comparer le contenu textuel des chaînes
                        return s1.equals(s2);
                    }

                    // 2) Comparer deux int pour tester une égalité (valeur brute)
                    public static boolean compareInt(int i1, int i2) {
                        // Utilise == pour comparer les valeurs numériques des primitifs
                        return i1 == i2;
                    }

                    // 3) Comparer deux Integer avec compareTo (valeurs triables)
                    public static void compareIntAlphabetically(Integer i1, Integer i2) {
                        // Utilise compareTo pour trier ou comparer les valeurs
                        int res = i1.compareTo(i2);
                        if (res < 0) {
                            System.out.println(i1 + " est avant " + i2);
                        } else if (res > 0) {
                            System.out.println(i1 + " est après " + i2);
                        } else {
                            System.out.println(i1 + " est égal à " + i2);
                        }
                    }

                    // 4) Comparer deux String alphabétiquement
                    public static void compareStringAlphabetically(String s1, String s2) {
                        // compareTo sur String compare selon l’ordre alphabétique
                        int res = s1.compareTo(s2);
                        if (res < 0) {
                            System.out.println(s1 + " est avant " + s2);
                        } else if (res > 0) {
                            System.out.println(s1 + " est après " + s2);
                        } else {
                            System.out.println(s1 + " est égal à " + s2);
                        }
                    }

                    // 5) Trier une liste de String par ordre alphabétique (A → Z)
                    public static void sortStringList(List<String> list) {
                        System.out.println("Avant tri : " + list);
                        Collections.sort(list); // sort() trie via compareTo() naturel des String
                        System.out.println("Après tri : " + list);
                    }

                    // 6) Inverser une liste de String
                    public static void reverseStringList(List<String> list) {
                        System.out.println("Avant inversion : " + list);
                        Collections.reverse(list); // inverse les éléments (dernier → premier)
                        System.out.println("Après inversion : " + list);
                    }

                    // 7) Comparer deux objets Personne par leur nom (utilise leur getNom)
                    public static void compareAndSortPersonne(Personne a, Personne b) {
                        // compareTo sur les noms des deux objets Personne
                        compareStringAlphabetically(a.getNom(), b.getNom());
                    }

                    // 8) Trier une liste de Personne selon leur nom (via Comparable)
                    public static void sortPersonneList(List<Personne> list) {
                        System.out.println("Avant tri : " + list);
                        // Nécessite que Personne implémente Comparable<Personne>
                        Collections.sort(list);
                        System.out.println("Après tri : " + list);
                    }

                    // 9) Trier une liste de Personne selon l’âge (via Comparator externe)
                    public static void sortPersonneByAge(List<Personne> list) {
                        System.out.println("Avant tri : " + list);
                        // Trie selon l’âge en utilisant une classe externe PersonneAgeComparator
                        Collections.sort(list, new PersonneAgeComparator());
                        System.out.println("Après tri : " + list);
                    }

                    // 10) Trier une liste de Personne par nom dans l’ordre décroissant (Z → A)
                    public static void sortPersonneByNameDesc(List<Personne> list) {
                        System.out.println("Avant tri : " + list);
                        // Utilise un Comparator personnalisé pour inverser l’ordre alphabétique
                        Collections.sort(list, new ComparatorPersonneNomDesc());
                        System.out.println("Après tri : " + list);
                    }
                }
// ==========================================================
// [37] CAS SPÉCIAUX VUS EN EXAMENS
// ==========================================================

    // 37.1 Examen a blanc 2023
    public class GestionDesExamens {
        // Ces 4 instructions (chargement des données) seront automatiquement exécutées à chaque test :
        private static ArrayList<Filiere> filieres = chargerFilieres();
        private static ArrayList<Examen> examens = chargerExamens();
        private static ArrayList<Etudiant> etudiants = chargerEtudiants();

        static {
            chargerInscriptions();
        }

        /**
         * Charge le fichier "LstFilieres.csv" dans l'ArrayList filieres.
         */
        private static ArrayList<Filiere> chargerFilieres() {
            filieres = new ArrayList<>();
            for (String[] ligne : FileToStr.lireCsv("src/TP11_Correction_Exa_2020/ExaQ1_GestionExamens/LstFilieres.csv")) {
                filieres.add(new Filiere(ligne[0], ligne[1], ligne[2]));
            }
            return filieres;
        }

        /**
         * Charge le fichier "LstExamens.csv" dans l'ArrayList examens.
         * La méthode FileToStr.lireCsv() retourne un tableau à 2 dimensions : lignes & colonnes.
         */
        private static ArrayList<Examen> chargerExamens() {
            examens = new ArrayList<>();
            for (String[] ligne : FileToStr.lireCsv("src/TP11_Correction_Exa_2020/ExaQ1_GestionExamens/LstExamens.csv")) {
                // ===== À COMPLÉTER =====
                //creer les bons attributs, creer l'objet examen, ajouter dans la liste
                //41;IG;632-2 Réseau;8;8;FR13
                int no = Integer.parseInt(ligne[0]);
                String codeFiliere = ligne[1];
                String module = ligne[2];
                int jour = Integer.parseInt(ligne[3]);
                int heure = Integer.parseInt(ligne[4]);
                String lieu = ligne[5];
                Filiere filiere = trouverFiliere(codeFiliere);
                Examen exa = new Examen(no, module, jour, heure, lieu, filiere);
                examens.add(exa);

            }
            return examens;
        }

        private static Filiere trouverFiliere(String codeFiliere) {
            for (Filiere filiere : filieres) {
                if(codeFiliere.equals(filiere.getCode())){
                    return filiere;
                }
            }
            return null;
        }

        /**
         * Charge le fichier "LstEtudiants.csv" dans l'ArrayList etudiants.
         * La méthode FileToStr.lireCsv() retourne un tableau à 2 dimensions : lignes & colonnes.
         */
        private static ArrayList<Etudiant> chargerEtudiants() {
            etudiants = new ArrayList<>();
            for (String[] ligne : FileToStr.lireCsv("src/TP11_Correction_Exa_2020/ExaQ1_GestionExamens/LstEtudiants.csv")) {
                // ===== À COMPLÉTER =====
                //401;Gaston;Lagaffe;IG
                int no = Integer.parseInt(ligne[0]);
                String nom = ligne[2];
                String prenom = ligne[1];
                String codeFiliere = ligne[3];
                Filiere filiere = trouverFiliere(codeFiliere);
                Etudiant etu = new Etudiant(no, nom, prenom, filiere);
                etudiants.add(etu);
            }
            return etudiants;
        }

        /**
         * Enregistre quel étudiant est inscrit à quel examen.
         * C'est à vous de choisir où et comment conserver ces informations.
         * Le fichier "LstInscriptions.csv" contient la liste des étudiants, avec la liste des examens auquels ils sont inscrits.
         * La méthode FileToStr.lireCsv() retourne un tableau à 2 dimensions : lignes & colonnes.
         */
        private static void chargerInscriptions() {
            for (String[] ligne : FileToStr.lireCsv("src/TP11_Correction_Exa_2020/ExaQ1_GestionExamens/LstInscriptions.csv")) {
                // ===== À COMPLÉTER =====
                //101;11;12;13;16
                int noEtu = Integer.parseInt(ligne[0]);
                Etudiant etu = trouverEtudiant(noEtu);
                for(int i = 1; i < ligne.length; i++){
                    int noExa = Integer.parseInt(ligne[i]);
                    Examen exa = trouverExamen(noExa);
                    if(exa != null && etu != null){
                        exa.addEtudiant(etu);
                        etu.addExamen(exa);
                    }
                }
            }
        }

        private static Examen trouverExamen(int noExa) {
            for(Examen exa : examens){
                if(exa.getNo() == noExa){
                    return exa;
                }
            }
            return null;
        }

        private static Etudiant trouverEtudiant(int noEtu) {
            for (Etudiant etu : etudiants) {
                if(noEtu == etu.getNo()){
                    return etu;
                }
            }
            return null;
        }

        /**
         * Affiche le contenu des 3 ArrayList globales : filieres, examens et etudiants.
         */
        public static void afficherTout() {
            System.out.println("\nFilieres :  ");
            for (Filiere fil : filieres) {
                System.out.println(fil);
            }
            System.out.println("\nExamens :   ");
            for (Examen exa : examens) {
                System.out.println(exa);
            }
            System.out.println("\nEtudiants : ");
            for (Etudiant etu : etudiants) {
                System.out.println(etu);
            }
        }

        /**
         * Affiche l'examen qui a eu lieu tel jour, telle heure dans ce lieu, ainsi que la liste des étudiants inscrits.
         */
        public static void afficherQuiEtaitLa(int jour, int heure, String lieu) {
            // ===== À COMPLÉTER =====
            boolean trouveExam = false;
            for(Examen exa : examens){
                if(exa.presenceExamen(jour, heure, lieu)){
                    trouveExam = true;
                    exa.afficherEtudiantsInscrits();
                }
            }
            if(!trouveExam){
                //Aucun examen le 10 à 9h, lieu: B4.11
                System.out.println("\nAucun examen le " + jour + " à " + heure + "h, lieu: " + lieu);
            }
        }

        /**
         * Affiche la liste des examens auxquels est inscrit nom-prenom.
         */
        public static void afficherMesExamens(String nom, String prenom) {
            // ===== À COMPLÉTER =====
            boolean trouveEtudiant = false;
            for(Etudiant etu : etudiants){
                if(etu.getPrenom().equals(prenom) && etu.getNom().equals(nom)){
                    trouveEtudiant = true;
                    etu.afficherExamens();
                }
            }
            if(!trouveEtudiant){
                //Aucun étudiant trouvé avec le nom et prénom donnés
                System.out.println("\nEtudiant " + nom + " " + prenom + " inconnu !");
            }
        }
    }
// 37.2 Examen Cinema
public class Cinema {
    private static ArrayList<Film> catalogueFilms = new ArrayList<>();
    private static HashSet<Seance> seances = new HashSet<>();
    private static HashMap<Seance, ArrayList<Integer>> reservations = new HashMap<>();

    //Donné
    public static void chargerDonneesFilms(String[] donnees){
        for (String ligne : donnees){
            String[] element = ligne.split(";");
            catalogueFilms.add(new Film(element[0], Integer.parseInt(element[1]), element[2]));
        }
    }

    public static void chargerDonneesSeances(String[] donnees){
        int cptLigne = 1;
        for (String ligne : donnees){

            String[] element = ligne.split(";");
            Film f = new Film(element[1]);
            f = rechercheFilm(f);
            try{
                Seance s = new Seance(Integer.parseInt(element[0]), f, element[2], element[3]);
                seances.add(s);
            }catch (FilmIntrouvableException e) {
                System.out.println("Ligne " + cptLigne + " ("+ element[1] +") - " + e.getMessage());
            }
            cptLigne++;
        }
    }


    public static Film rechercheFilm(Film f){
        for(Film fi : catalogueFilms) {
            if (fi.equals(f)) {
                return fi;
            }
        }
        return null;
    }

    public static Seance rechercheSeance(Seance s){
        for(Seance se : seances) {
            if (se.equals(s)) {
                return se;
            }
        }
        return null;
    }

    public static void chargerDonneesReservations(String[] donnees){
        int cptLigne = 1;
        for (String ligne : donnees){

            String[] element = ligne.split(";");
            Seance s = new Seance(Integer.parseInt(element[0]));
            int[] sieges = new int[element.length-1];
            for (int i = 0; i < element.length -1; i ++){
                sieges[i] = Integer.parseInt(element[i+1]);
            }
            s = rechercheSeance(s);
            try{
                insertionHashMap(s,sieges);
            }catch (SiegeOccupeException e) {
                System.out.println("Ligne " + cptLigne + " - " + e.getMessage());
            }
            cptLigne++;
        }
    }

    public static void insertionHashMap(Seance s, int[] sieges) throws SiegeOccupeException{
        if(reservations.containsKey(s)){
            for (int si : sieges) {
                if (reservations.get(s).contains(si)) {
                    throw new SiegeOccupeException("Le siege " + si + " de la seance " + s +" est deja reserve ! La reservation n'est donc pas prise en compte.");
                }
            }
        }
        else{
            reservations.put(s,new ArrayList<>());
        }
        for(int si : sieges){
            reservations.get(s).add(si);
        }
    }

    public static void afficherCatalogue(String tri){
        if(tri.equals("naturel")){
            catalogueFilms.sort(null);
        }else if(tri.equals("titre")){
            catalogueFilms.sort(new CompareParTitre());
        }else if(tri.equals("duree")){
            catalogueFilms.sort(new CompareParDuree());
        }
        for(Film f : catalogueFilms){
            System.out.println(f);
        }
    }

//37.3 Examen 2024 votation

    public class StatVotations {
        private static final String FILENAME_DATA = "results.csv";
        private static final String FILENAME_STAT = "stats.txt";
        private static final String FILENAME_ERROR = "errors.log";
        private static final int NB_CHAMPS = 5;
        private static final int MAX_LENGTH = 50;
        private static String erreurs ="";

        private static HashSet<Result> results = new HashSet<>();

        public static void main(String[] args) {
            chargerResultats();
            calculerStat();
        }

        /**
         * TODO: Créer un résultat
         * col 0 = nom Commune - String
         * col 1 = nbElecteurs - int
         * col 2 = nbOui - int
         * col 3 = nbNon - int
         * col 4 = nbBlanc - int
         * length!=5 = ERREUR A propager et traiter!
         * TODO: l'ajouter dans l'ensemble des résultats
         * TODO: Faire attention à:
         * TODO: vérifier qu le nb d'éléments <=5
         * ....
         * TODO: signaler erreur xy
         * TODO: sauver erreur dans error.logs
         * etc.....
         */
        private static void chargerResultats() {
            // TODO: lire le fichier FILENAME_DATA
            // TODO: stocker les résultats corrects dans le HashSet results
            // TODO: appeler erreur() pour enregistrer les erreurs dans FILENAME_ERROR
            try {
                ArrayList<String[]> fichierResultats = FileToStr.lireFichier(FILENAME_DATA);
                for (int i = 1; i < fichierResultats.size() ; i++) {
                    if(i>MAX_LENGTH-1)return;
                    String[] ligne = fichierResultats.get(i);
                    try {
                        if(ligne.length!=NB_CHAMPS){
                            throw new ColumnLengthException("Erreur ligne "+(i+1)+" "+ Arrays.toString(ligne)+": IL y a "+ligne.length+" valeurs au lieu de "+NB_CHAMPS);
                        }
                        String nomCommune = ligne[0].trim();
                        String nbElecteurs = ligne[1].trim();
                        String nbOui = ligne[2].trim();
                        String nbNon = ligne[3].trim();
                        String nbBlanc = ligne[4].trim();
                        Result resultat = new Result(nomCommune,nbElecteurs,nbOui,nbNon,nbBlanc);
                        if(results.contains(resultat)){
                            throw new ExistingCommuneException("La commune "+resultat.getCommune()+" a déjà été enregistrée");
                        }
                        results.add(resultat);
                    }
                    catch (BadCommuneNameExceptions badCommuneNameExceptions) {
                        System.err.println(erreur("Erreur ligne "+(i+1)+" "+ formattedLigne(ligne)+": "+badCommuneNameExceptions.getMessage()+" !")); }
                    catch (NotNumericNumberException numberFormatException){
                        System.err.println(erreur("Erreur ligne "+(i+1)+" "+ formattedLigne(ligne)+": "+numberFormatException.getMessage()+" !"));
                    } catch (ColumnLengthException columnLengthException) {
                        System.err.println(erreur("Erreur ligne "+(i+1)+" "+ formattedLigne(ligne)+": "+columnLengthException.getMessage()+" !"));
                    } catch (InvalidNumberExceptions invalidNumberExceptions) {
                        System.err.println(erreur("Erreur ligne "+(i+1)+" "+ formattedLigne(ligne)+": "+invalidNumberExceptions.getMessage()+" !"));
                    } catch (ExistingCommuneException existingCommuneException) {
                        System.err.println(erreur("Erreur ligne "+(i+1)+" "+ formattedLigne(ligne)+": "+existingCommuneException.getMessage()+" !"));
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static String formattedLigne(String[] ligne) {
            return Arrays.toString(ligne).replace('[','(').replace(']',')');
        }

        //37.4 Examen gestion des alarmes (out of bounds)

        public class GestionAlarme {

            private static ArrayList<Personne> personnes = new ArrayList<>();
            private static ArrayList<Alarmable> entite = new ArrayList<>();

            public static ArrayList<Personne> chargerPersonnes(String fichier) {
                String[] lignes = FileToStr.lireCsv(fichier);

                for (int i = 0; i < lignes.length; i++) {
                    String[] data = lignes[i].split(";");

                    // On crée les variables une par une
                    int id = Integer.parseInt(data[0]);
                    String nom = data[1];

                    String telPrive = "";
                    if (data.length > 2 && !data[2].equals("")) {
                        telPrive = data[2];
                    } else {
                        telPrive = null;
                    }

                    String telPro = "";
                    if (data.length > 3 && !data[3].equals("")) {
                        telPro = data[3];
                    } else {
                        telPro = null;
                    }

                    String email = "";
                    if (data.length > 4 && !data[4].equals("")) {
                        email = data[4];
                    } else {
                        email = null;
                    }

                    // Création de l'objet
                    Personne p = new Personne(id, nom, telPrive, telPro, email);
                    personnes.add(p);
                }

                return personnes;
            }

            public static ArrayList<Alarmable> chargerAlarmables(String fichier) {
                String[] lignes = FileToStr.lireCsv(fichier);
                for (int i = 0; i < lignes.length; i++) {
                    String[] data = lignes[i].split(";");
                    String type = data[0];
                    Alarmable alarme = null;
                    int id = Integer.parseInt(data[1]);
                    Personne p = getPersonne(id);
                    if (type.equals("D")) {
                        String address = data[2];
                        alarme = new DomicilePrive(address, p);
                    } else if (type.equals("E")) {
                        String nomEntreprise = data[2];
                        String address = data[3];
                        int nbEmploye = Integer.parseInt(data[4]);
                        alarme = new Entreprise(nomEntreprise, address, nbEmploye, p);
                    } else {
                        String nomEntreprise = data[2];
                        String address = data[3];
                        alarme = new InstitutionPublique(nomEntreprise, address, p);

                    }
                    entite.add(alarme);
                }
                return entite;
            }

            public static Personne getPersonne(int id) {
                Personne recherche = new Personne(id);

                for (Personne p : personnes) {
                    if (p.equals(recherche)) {
                        return p;
                    }
                }
                return null;
            }





// ==========================================================
// [38] Chargement de données, charge data et FileReader et Writer
// =========================================================

   // Avec SPLIT

   public void loadData(){
       String[] dataFile = FileToStr.lireCsv("file.csv");
       for(String line : dataFile){
           String[] columns = line.split(";");
           String column0 = column[0];
           int column1 =Integer.parseInt(column[1]);
       }
   }

   // Sans SPLIT

    public void loadData(){
        ArrayList<String[]> dataFile = FileToStr.lireCsv("file.csv");
        for(String[] line : dataFile){
        String column0 = line[0];
        int column1 =Integer.parseInt(line[1]);
        }
    }

        /*----------------------------------------------------------
         * 38.1 Lecture ligne par ligne depuis un fichier texte
         *----------------------------------------------------------
         */

        public static void lireFichierLignes(String chemin) {
            try (BufferedReader br = new BufferedReader(new FileReader(chemin))) {
                String ligne;
                while ((ligne = br.readLine()) != null) {
                    System.out.println(ligne);
                }
            } catch (IOException e) {
                System.out.println("Erreur de lecture : " + e.getMessage());
            }
        }

        /*----------------------------------------------------------
         * 38.2 Chargement d’un CSV dans un tableau simple
         *----------------------------------------------------------
         * Exemple de fichier : données.csv
         * Contenu :
         * 10
         * 20
         * 30
         */

        public static int[] chargerCSVdansTableau(String chemin) throws IOException {
            ArrayList<Integer> liste = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(chemin))) {
                String ligne;
                while ((ligne = br.readLine()) != null) {
                    liste.add(Integer.parseInt(ligne.trim()));
                }
            }
            // Conversion ArrayList → tableau
            int[] resultat = new int[liste.size()];
            for (int i = 0; i < liste.size(); i++) {
                resultat[i] = liste.get(i);
            }
            return resultat;
        }

            public class Bdd {
                public static List<Table> getListeTables() {
                    List<Table> data = new ArrayList<>();
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader("src/TP10_Correction/Ex2/LstTables.csv"));
                        String ligne;
                        while ((ligne = reader.readLine()) != null) {
                            String[] champs = ligne.split(";");
                            if (champs[0].startsWith("R")) {
                                data.add(new TableRect(champs[0], Integer.parseInt(champs[1]), Matiere.valueOf(champs[2]), Integer.parseInt(champs[3]), Integer.parseInt(champs[4])));
                            } else {
                                data.add(new TableRonde(champs[0], Integer.parseInt(champs[1]), Matiere.valueOf(champs[2]), Integer.parseInt(champs[3])));
                            }
                        }
                        reader.close();
                    } catch (IOException e) {
                        System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
                    }
                    return data;
                }
            }

        /*----------------------------------------------------------
         * 38.3 Chargement d’un CSV dans un tableau 2D (matrice)
         *----------------------------------------------------------
         * Exemple de fichier : matrice.csv
         * Contenu :
         * 1;2;3
         * 4;5;6
         */

        public static int[][] chargerMatriceDepuisCSV(String chemin) throws IOException {
            ArrayList<int[]> lignes = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(chemin))) {
                String ligne;
                while ((ligne = br.readLine()) != null) {
                    String[] valeurs = ligne.split(";");
                    int[] ligneInt = new int[valeurs.length];
                    for (int i = 0; i < valeurs.length; i++) {
                        ligneInt[i] = Integer.parseInt(valeurs[i].trim());
                    }
                    lignes.add(ligneInt);
                }
            }
            // Conversion en tableau 2D
            int[][] matrice = new int[lignes.size()][];
            for (int i = 0; i < lignes.size(); i++) {
                matrice[i] = lignes.get(i);
            }
            return matrice;
        }

        /*----------------------------------------------------------
         * 38.4 Chargement d’un CSV dans une ArrayList<String[]>
         *----------------------------------------------------------
         * Exemple de fichier : personnes.csv
         * Contenu :
         * Alice;25
         * Bob;30
         */

        public static ArrayList<String[]> chargerLignesCSV(String chemin) {
            ArrayList<String[]> donnees = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(chemin))) {
                String ligne;
                while ((ligne = br.readLine()) != null) {
                    String[] champs = ligne.split(";");
                    donnees.add(champs);
                }
            } catch (IOException e) {
                System.out.println("Erreur de lecture : " + e.getMessage());
            }
            return donnees;
        }

// ==========================================================
// [38.5] CHARGEMENT D’UN CSV DANS UN TABLEAU DE String[][]
// ==========================================================

            /*
             * Exemple de fichier CSV (fichier : "eleves.csv")
             * Alice;18;Math
             * Bob;20;Info
             * Clara;17;Histoire
             */

            public static String[][] chargerCSVString2D(String chemin) {
                ArrayList<String[]> lignes = new ArrayList<>();

                try (BufferedReader br = new BufferedReader(new FileReader(chemin))) {
                    String ligne;
                    while ((ligne = br.readLine()) != null) {
                        // Découpe chaque ligne sur le point-virgule
                        String[] champs = ligne.split(";");
                        lignes.add(champs); // Ajoute le tableau de champs à la liste
                    }
                } catch (IOException e) {
                    System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
                }

                // Conversion ArrayList → tableau 2D
                String[][] resultat = new String[lignes.size()][];
                for (int i = 0; i < lignes.size(); i++) {
                    resultat[i] = lignes.get(i);
                }

                return resultat;
            }

// ==========================================================
// [38.7] Charger data double tableau
// ==========================================================

            public static void chargerLivres(String[][] fichier) {
                for (int i = 0; i < fichier.length; i++) {
                    int id = Integer.parseInt(fichier[i][0]);
                    String titre = fichier[i][1];
                    String auteur = fichier[i][2];
                    int annee = Integer.parseInt(fichier[i][3]);

                    Livre livre = new Livre(id, titre, auteur, annee);

                    livres.add(livre);
                    livresMap.put(id, livre);
                }
            }

            public static void afficherTousLesLivres() {
                for (Livre livre : livres) {
                    System.out.println(livre);
                }
            }

            public static void afficherLivreParId(int idRecherche) {
                Livre livre = livresMap.get(idRecherche);
                if (livre != null) {
                    System.out.println("Le livre est : " + livre);
                } else {
                    System.out.println("Aucun livre trouvé avec cet ID.");
                }
            }

// ==========================================================
// [38.8] Exercice Forum Admin, modo
// ==========================================================

       public class Forum
       {
           private static ArrayList<ExaQ2_ForumEnLigne.Utilisateur> utilisateurs = new ArrayList<>();
           private static HashMap<String, ArrayList<Message>> sujets = new HashMap<>();
           private static HashSet<String> utilisateursConnectes = new HashSet<>();

           /**
            * Constructeur d'objets de classe Forum
            */
           public Forum(){}

           public void chargerUsers(String path){
               String [] ligne = FileToStr.lireCsv(path);
               for(String str : ligne){
                   String[] element = str.split(";");
                   String typeUser = element[0];
                   String pseudo = element[1];
                   String nom = element[2];
                   String prenom = element[3];
                   if(typeUser.equals("Administrateur")){
                       String typeAccess = element[4];
                       int nbBugs = Integer.parseInt(element[5]);
                       Administrateur a = new Administrateur(pseudo, nom, prenom, typeAccess, nbBugs);
                       utilisateurs.add(a);
                   } else if(typeUser.equals("Moderateur")){
                       int tel = Integer.parseInt(element[4]);
                       int nbBanni = Integer.parseInt(element[5]);
                       Moderateur m = new Moderateur(pseudo, nom, prenom, tel, nbBanni);
                       utilisateurs.add(m);
                   } else {
                       int tel = Integer.parseInt(element[4]);
                       Membre membre = new Membre(pseudo, nom, prenom, tel);
                       utilisateurs.add(membre);
                   }

               }
           }

           public void chargerSujets(String path){
               String [] ligne = FileToStr.lireCsv(path);
               for(String str : ligne){
                   ArrayList<Message> messages = new ArrayList<>();
                   String[] element = str.split(";");
                   String sujet = element[0];
                   String pseudo = element[1];
                   ExaQ2_ForumEnLigne.Utilisateur auteur = chercherUser(pseudo);
                   String contenu = element[2];
                   Message mess = new Message(auteur, contenu);
                   messages.add(mess);
                   sujets.putIfAbsent(sujet, new ArrayList<>());
                   sujets.get(sujet).add(mess);
               }

           }

           public ExaQ2_ForumEnLigne.Utilisateur chercherUser(String pseudo) {
               for (ExaQ2_ForumEnLigne.Utilisateur u : utilisateurs) {
                   if (u.getPseudo().equals(pseudo)) {
                       return u;
                   }
               }
               return null;
           }

           public void connexion(ExaQ2_ForumEnLigne.Utilisateur user){
               // Ne pas modifier
               utilisateursConnectes.add(user.getPseudo());
               user.messageConnexion();
           }

           public void deconnexion(ExaQ2_ForumEnLigne.Utilisateur user){
               utilisateursConnectes.remove(user.getPseudo());
               user.messageDeconnexion();
           }

           public void afficherUtilisateurs(){
               for (ExaQ2_ForumEnLigne.Utilisateur u : utilisateurs){
                   System.out.println(u.getPseudo() + " (" + u.getPrenom() + " " + u.getNom() + ")");
               }
           }


           public void afficherUtilisateursEnLigne(){
               for (String s : utilisateursConnectes) {
                   System.out.println(s);
               }
           }

           public static void afficherSujets(){
               for (String sujet : sujets.keySet()) {
                   System.out.println("[" + sujet + "] ");
                   ArrayList<Message> listeMessages = sujets.get(sujet);
                   for (Message msg : listeMessages) {
                       System.out.println("\t" + msg);
                   }
               }
           }


           public static void main(String[] args){
               ExaQ2_ForumEnLigne.Forum f = new ExaQ2_ForumEnLigne.Forum();
               f.chargerUsers("utilisateurs.csv");
               f.chargerSujets("messages.csv");
               f.afficherUtilisateurs();

               System.out.println("Connexions :\n ----------------");
               f.connexion(utilisateurs.get(0));
               f.connexion(utilisateurs.get(4));
               f.connexion(utilisateurs.get(7));
               f.connexion(utilisateurs.get(10));
               System.out.println();
               System.out.println("Utilsateur connecté :\n ----------------");
               f.afficherUtilisateursEnLigne();
               System.out.println();
               System.out.println("Déconnexions :\n ----------------");
               f.deconnexion(utilisateurs.get(0));
               f.deconnexion(utilisateurs.get(4));
               f.deconnexion(utilisateurs.get(10));
               System.out.println();
               f.afficherSujets();
           }
       }

// ==========================================================
// [38.9] Exercice DRUG
// ==========================================================

package ExaQ3_DrugManagement;

import java.util.ArrayList;
import java.util.Collections;

            /**
             * Décrivez votre classe DrugEvaluator ici.
             *
             * @author (votre nom)
             */
            public class DrugEvaluator {

                private static ArrayList<Substance> drugs = new ArrayList<>();

                private static void loadSubstances() {
                    boolean isFirstRow = true;
                    String[] csv = FileToStr.lireCsv("substances.csv");
                    for (String row : csv) {
                        if (isFirstRow){
                            isFirstRow = false;
                        }else {
                            String[] columns = row.split(";");
                            //name;socialHarm;isLegal;physicalHarm;strength;type
                            String name = columns[0];
                            int socialHarm = Integer.parseInt(columns[1]);
                            boolean isLegal = Boolean.parseBoolean(columns[2]);
                            int physicalHarm = Integer.parseInt(columns[3]);
                            int strength = Integer.parseInt(columns[4]);
                            String type = columns[5];

                            if (type.equals("depressant")) {
                                Depressant dep = new Depressant(name, socialHarm, isLegal, physicalHarm, strength);
                                drugs.add(dep);
                            }
                            else if (type.equals("dissociative")) {
                                Dissociative diss = new Dissociative(name, socialHarm, isLegal, physicalHarm, strength);
                                drugs.add(diss);
                            } else if (type.equals("enctatogen")) {
                                Enctatogen enc = new Enctatogen(name, socialHarm, isLegal, physicalHarm, strength);
                                drugs.add(enc);
                            } else if (type.equals("psychedelic")) {
                                Psychedelic psy = new Psychedelic(name, socialHarm, isLegal, physicalHarm, strength);
                                drugs.add(psy);
                            } else {
                                Stimulant sti = new Stimulant(name, socialHarm, isLegal, physicalHarm, strength);
                                drugs.add(sti);
                            }
                        }
                    }
                }

                /**
                 * remplacez ce commentaire par le vôtre
                 *
                 * @param  args   le paramètre de la méthode
                 */
                public static void main (String[]args){
                    loadSubstances();
                    displaySubstances();
                    System.out.println("----------Tri par défaut----------");
                    sortBy("d");
                    displaySubstances();
                    System.out.println("----------Tri par danger----------");
                    sortBy("danger");
                    displaySubstances();
                }

                /**
                 * remplacez ce commentaire par le vôtre
                 *
                 * @param  criteria   le paramètre de la méthode
                 */
                private static void sortBy(String criteria) {
                    switch (criteria) {
                        case "d":
                            Collections.sort(drugs);
                            break;
                        case "danger":
                            Collections.sort(drugs, new CompareByDanger());
                            break;
                        case "name":
                            Collections.sort(drugs, new CompareByName());
                            break;
                        default:
                            System.out.println("Critère inconnu. Tri par nom par défaut.");
                            Collections.sort(drugs, new CompareByName());
                    }
                }


                /**
                 * remplacez ce commentaire par le vôtre
                 *
                 */
                private static void displaySubstances() {
                    for (Substance substance : drugs) {
                        System.out.println(substance);
                    }
                }

            }


            package ExaQ3_DrugManagement;

            /**
             * Décrivez votre classe Substance ici.
             *
             * @author (votre nom)
             */
// A compléter
            public abstract class Substance implements IScorable, Comparable<ExaQ3_DrugManagement.Substance>
            {

                private String name;
                private int socialHarm;
                private boolean isLegal;
                private int physicalHarm;
                private int strength;

                /**
                 * Constructeur d'objets de classe Substance
                 */
                protected Substance(String name, int socialHarm, boolean isLegal, int physicalHarm, int strength)
                {
                    // initialisation des variables d'instance
                    this.name = name;
                    this.socialHarm = socialHarm;
                    this.isLegal = isLegal;
                    this.physicalHarm = physicalHarm;
                    this.strength = strength;
                }

                protected int getStrength() {
                    return strength;
                }

                protected String getName() {
                    return name;
                }

                protected void setName(String name) {
                    this.name = name;
                }

                protected int getSocialHarm() {
                    return socialHarm;
                }

                protected void setSocialHarm(int socialHarm) {
                    this.socialHarm = socialHarm;
                }

                protected Boolean isLegal() {
                    return isLegal;
                }

                protected void setLegal(boolean legal) {
                    isLegal = legal;
                }

                protected int getPhysicalHarm() {
                    return physicalHarm;
                }

                protected void setPhysicalHarm(int physicalHarm) {
                    this.physicalHarm = physicalHarm;
                }

                protected abstract String harms();

                protected abstract String heals();

                @Override
                public int getDangerScore() {
                    return strength * (socialHarm + physicalHarm);
                }

                @Override
                public int compareTo(ExaQ3_DrugManagement.Substance sub) {
                    int compareType = this.getClass().getSimpleName().compareTo(sub.getClass().getSimpleName());
                    if (compareType != 0) {
                        return compareType;
                    }

                    int compareName = this.name.compareTo(sub.name);
                    if (compareName != 0) {
                        return compareName;
                    }

                    return Integer.compare(this.strength, sub.strength);
                }



                public interface ILethal {
                    String DISCLAIMER = "est potentiellement dangereux";

                    String disclaimer();
                }

                public class CompareByDanger implements Comparator<ExaQ3_DrugManagement.Substance> {

                    @Override
                    public int compare(ExaQ3_DrugManagement.Substance o1, ExaQ3_DrugManagement.Substance o2) {
                        return o1.getDangerScore() - o2.getDangerScore();
                    }
                }


                @Override
                public String toString() {
                    // A compléter
                    return name  + " ("+ (isLegal() ? "légal" : "illégal") +")"+
                            " -  Catégorie "+'"' + this.getClass().getSimpleName()+ '"'+
                            "\n ¦ méfaits: "+ harms() +
                            "\n ¦ bienfaits: "+ heals() +
                            "\n ¦ nuisance sociale: " + getSocialHarm() + "/50" +
                            "\n ¦ nuisance physique: " + getPhysicalHarm() + "/50" +
                            "\n ¦ force: " + getStrength()+"/10"+
                            "\n ¦ dangerosité de " + getDangerScore() + "/1000" +
                            "\n ¦ ATTENTION ";
                }

            }

            public class Depressant
                    extends ExaQ3_DrugManagement.Substance implements ILethal {


                /**
                 * Constructeur d'objets de classe Substance
                 *
                 * @param name
                 * @param socialHarm
                 * @param isLegal
                 * @param physicalHarm
                 * @param strength
                 */

                public Depressant(String name, int socialHarm, boolean isLegal, int physicalHarm, int strength) {
                    super(name, socialHarm, isLegal, physicalHarm, strength);
                }

                protected String harms() {
                    return "ralentit l'activité du système nerveux central et sédate";
                }

                protected String heals() {

                    return "procure une senstation de bien être";
                }


                public String disclaimer() {
                    // A compléter
                    return DISCLAIMER   ;
                }

                @Override
                public String toString() {
                    return super.toString() + disclaimer();
                }
            }

// ==========================================================
// [38.10] Exo Votations
// ==========================================================

import java.io.*;
import java.util.*;

            public class StatVotations {
                private static final String FILENAME = "results.csv";
                private static final String ERROR_FILE = "errors.log";
                private static final String STAT_FILE = "stats.txt";
                private static Set<Result> results = new HashSet<>();
                private static Set<String> communesVues = new HashSet<>();
                private static boolean erreurGrave = false;

                public static void main(String[] args) {
                    try {
                        chargerResultats();
                        if (!erreurGrave) calculerStat();
                        for (Result r : results) {
                            System.out.println(r.toStringLong());
                        }
                    } catch (Exception e) {
                        System.out.println("Erreur grave lors de la lecture: " + e.getMessage());
                        erreurGrave = true;
                    }
                }

                private static void chargerResultats() {
                    try (BufferedReader br = new BufferedReader(new FileReader(FILENAME));
                         BufferedWriter log = new BufferedWriter(new FileWriter(ERROR_FILE))) {

                        String ligne;
                        int nbLigne = 0;

                        // Ignore l'en-tête
                        br.readLine();

                        while ((ligne = br.readLine()) != null && nbLigne < 50) {
                            nbLigne++;
                            String[] parts = ligne.split(";");

                            if (parts.length != 5) {
                                erreur(log, nbLigne + 1, ligne, "il y a " + parts.length + " valeurs au lieu de 5 !");
                                continue;
                            }

                            String nomCommune = parts[0].trim();

                            try {
                                int electeurs = Integer.parseInt(parts[1]);
                                int oui = Integer.parseInt(parts[2]);
                                int non = Integer.parseInt(parts[3]);
                                int blanc = Integer.parseInt(parts[4]);

                                if (electeurs < 0 || oui < 0 || non < 0 || blanc < 0) {
                                    erreur(log, nbLigne + 1, ligne, "nombre erroné !");
                                    continue;
                                }
                                if (oui + non + blanc > electeurs) {
                                    erreur(log, nbLigne + 1, ligne, "trop de votes par rapport aux électeurs !");
                                    continue;
                                }
                                if (nomCommune.length() < 2) {
                                    erreur(log, nbLigne + 1, ligne, "nom de commune '" + nomCommune + "' erroné !");
                                    continue;
                                }
                                if (communesVues.contains(nomCommune)) {
                                    erreur(log, nbLigne + 1, ligne, "la commune " + nomCommune + " a déjà été enregistrée !");
                                    continue;
                                }

                                Result r = new Result(nomCommune, electeurs, oui, non, blanc);
                                results.add(r);
                                communesVues.add(nomCommune);

                            } catch (NumberFormatException e) {
                                erreur(log, nbLigne + 1, ligne, "nombre non numérique !");
                            }
                        }
                    } catch (IOException e) {
                        System.out.println("Erreur de lecture: " + e.getMessage());
                        erreurGrave = true;
                    }
                }

                private static void erreur(BufferedWriter log, int ligne, String contenu, String message) throws IOException {
                    String msg = "Erreur ligne " + ligne + " (" + contenu + ") : " + message;
                    log.write(msg);
                    log.newLine();
                    System.out.println("[LOG] " + msg); // Pour debug
                }

                private static void calculerStat() {
                    try (BufferedWriter out = new BufferedWriter(new FileWriter(STAT_FILE))) {
                        int totalOui = 0, totalNon = 0;
                        Result plusParticipation = null;
                        List<Result> petitsEcarts = new ArrayList<>();

                        for (Result r : results) {
                            totalOui += r.getOui();
                            totalNon += r.getNon();

                            if (plusParticipation == null || r.getTauxParticipation() > plusParticipation.getTauxParticipation()) {
                                plusParticipation = r;
                            }
                            if (Math.abs(r.getOui() - r.getNon()) < 10) {
                                petitsEcarts.add(r);
                            }
                        }

                        out.write("Résultats sur " + results.size() + " communes :");
                        out.newLine();
                        boolean accepte = totalOui > totalNon;
                        out.write(String.format("%s à %.1f%%",
                                accepte ? "Accepté" : "Refusé",
                                (totalOui * 100.0) / (totalOui + totalNon)));
                        out.newLine();
                        out.newLine();

                        out.write("Plus grande participation :");
                        out.newLine();
                        out.write(plusParticipation.toStringLong());
                        out.newLine();
                        out.newLine();

                        out.write("Petits écarts (moins de 10 voix d'écart) :");
                        out.newLine();
                        for (Result r : petitsEcarts) {
                            out.write(r.toStringLong());
                            out.newLine();
                        }

                    } catch (IOException e) {
                        System.out.println("Erreur à l'écriture du fichier stats : " + e.getMessage());
                    }
                }
            }


// ==========================================================
// [39] LISTES & MOT-CLE `new` : QUAND L’UTILISER
// ==========================================================

            /*
             * ✅ 1. Création d'une nouvelle liste → on met `new`
             */
            ArrayList<String> noms = new ArrayList<>(); // nouvelle liste vide

            /*
             * ✅ 2. Initialisation dans un constructeur → on met `new`
             */
            public class Bibliotheque {
                private ArrayList<Livre> livres;

                public Bibliotheque() {
                    livres = new ArrayList<>(); // création d'une liste vide au départ
                }
            }

            /*
             * ❌ 3. Quand une liste est reçue en paramètre → PAS de `new`
             */
            public class Bibliotheque {
                private ArrayList<Livre> livres;

                public Bibliotheque(ArrayList<Livre> livres) {
                    this.livres = livres; // on reçoit une liste déjà existante → pas besoin de la créer
                }
            }

            /*
             * ❌ 4. Quand une méthode utilise une liste donnée → PAS de `new`
             */
            public static void afficherNoms(ArrayList<String> noms) {
                for (String nom : noms) {
                    System.out.println(nom);
                }
            }

            /*
             * ✅ 5. Si on veut réinitialiser une liste → on met `new`
             */
            noms = new ArrayList<>(); // vide la liste et recrée une nouvelle instance

// ==========================================================
// [40] LIAISON ENTRE OBJETS SANS HASHMAP (INSCRIPTIONS)
// ==========================================================

/*
 * ✅ IDÉE CLÉ :
 * On peut **lier deux objets entre eux directement**, sans passer par une HashMap.
 * Exemple : un Examen contient une liste d’Étudiants,
 * et chaque Étudiant contient une liste d’Examens.

 * 🔁 Cette méthode fonctionne grâce à des **listes locales** dans chaque classe,
 * et des **méthodes d’ajout** comme `addEtudiant()` et `addExamen()`.

------------------------------------------------------------
 * 📘 Examen.java
 * → contient : List<Etudiant> etudiants;
 * → méthode : void addEtudiant(Etudiant etu)
------------------------------------------------------------

 * 📘 Etudiant.java
 * → contient : List<Examen> examens;
 * → méthode : void addExamen(Examen exa)
------------------------------------------------------------

 * ✅ Exemple d’utilisation :
 * Quand on charge le fichier d’inscriptions :
 * → pour chaque ligne d’inscription, on fait :
 *     exa.addEtudiant(etu);
 *     etu.addExamen(exa);

 * 🔁 Le lien est donc **créé des deux côtés**, automatiquement.

------------------------------------------------------------
 * ✅ POURQUOI C’EST UTILE ?
------------------------------------------------------------

 * ➕ Avantages :
 * - Pas besoin de HashMap compliquée
 * - Plus simple à lire et manipuler
 * - Suffisant si on n’a pas des millions de données

 * ➖ Inconvénients :
 * - Moins rapide qu’une Map pour retrouver un élément
 * - Attention aux doublons si on ne vérifie pas avec `.contains()`

------------------------------------------------------------
 * ✅ QUAND L’UTILISER ?
------------------------------------------------------------

 * → Cas typiques : relations bidirectionnelles
   - Étudiants / Examens
   - Clients / Commandes
   - Joueurs / Équipes
   - Cours / Professeurs

------------------------------------------------------------
 * 🧠 À RETENIR
------------------------------------------------------------

 * 👉 Si tu veux lier deux classes sans HashMap :
 *   1. Ajoute une liste de l’autre objet dans chaque classe
 *   2. Crée une méthode d’ajout (addXXX) dans chaque classe
 *   3. Lors du chargement, appelle les deux méthodes

 * Exemple dans le code :
      exa.addEtudiant(etu);
      etu.addExamen(exa);
 */


// =======================================
// FIN DU FICHIER DE REVISION JAVA
// =======================================