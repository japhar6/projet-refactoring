package iut.bad;

public class Homme extends Humain {

    // Constructeur par défaut
    public Homme() {
        super();
    }

    // Constructeur avec paramètres
    public Homme(String nom, String prenom, int age) {
        super(nom, prenom, age); // utilise le constructeur de Humain
    }
}
