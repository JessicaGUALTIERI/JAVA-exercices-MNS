public class Article {
    private String nom;
    private double prix;
    private int quantite;
    private double tva;

    // CONSTRUCTEUR
    public Article(String nom, double prix, int quantite) {
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
        this.tva = 20;
    }

    public Article(String nom, double prix, int quantite, double tva) {
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
        this.tva = tva;
    }


    // METHODES



    // GETTER ET SETTER
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getTva() {
        return tva;
    }

    public void setTva(double tva) {
        this.tva = tva;
    }
}
