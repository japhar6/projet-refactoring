package iut.bad;

public class Femme extends Humain {

    public Femme() {
        super();
    }

    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }
    public static void main(String[] args) {
        // Création d'un Homme et d'une Femme
        Homme homme = new Homme("John", "Doe", 25);
        Femme femme = new Femme("Alice", "Smith", 23);

        // Afficher les détails
        homme.details();
        femme.details();

        // Déclarer l'amitié
        homme.ami(femme);

        // Tester manger et boire
        homme.manger();
        femme.boire();
    }
}
