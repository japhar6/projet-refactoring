package iut.bad;

public class Humain {

    protected String nom;
    protected String prenom;
    protected int age;

    // Constructeur par défaut
    public Humain() {
    }

    // Constructeur avec paramètres
    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Méthode pour afficher les détails
    public void details() {
        System.out.println(toString());
    }

	public String toString() {
		return "Nom : " + nom + ", Prénom : " + prenom + ", Âge : " + age;
	}
    public void manger() {
        System.out.println(nom + " est en train de manger.");
    }

    public void boire() {
        System.out.println(nom + " est en train de boire.");
    }

}
