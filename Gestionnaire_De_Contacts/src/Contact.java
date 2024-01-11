public class Contact {
    private String nom;
    private String prenom;
    private String telephone;
    private String mail;


    // CONSTRUCTEUR :
    public Contact(String nom, String prenom, String telephone, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.mail = mail;
    }


    // METHODES
    public String afficherContact() {
        return getNom() + " " + getPrenom() + " " + getTelephone() + " " + getMail();
    }




    // GETTER ET SETTER :

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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
