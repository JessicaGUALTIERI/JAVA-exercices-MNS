public class main {

    public static void main(String[] args) {

        GestionnaireContacts gestionnaire = new GestionnaireContacts();
// Ajout de contacts
        gestionnaire.ajouterContact(new Contact("Dupont", "Jean", "0123456789", "jean.dupont@example.com"));
        gestionnaire.ajouterContact(new Contact("Martin", "Alice", "9876543210", "alice.martin@example.com"));
// Affichage des contacts
        System.out.println("Contacts après ajout :");
        gestionnaire.afficherContact();
        System.out.println(" ");
// Mise à jour d'un contact
        gestionnaire.mettreAJourContact("Dupont", "Jean", "nouveau@mail.com");
        System.out.println("Contacts après modification :");
        gestionnaire.afficherContact();
        System.out.println(" ");
// Recherche d'un contact
        Contact recherche = gestionnaire.chercherContact("Martin", "Alice");
        System.out.println("Contact recherché : ");
        System.out.println(recherche.afficherContact());
        System.out.println(" ");
// Suppression d'un contact
        gestionnaire.supprimerContact("Martin", "Alice");
// Affichage final des contacts
        System.out.println("Contacts après suppression :");
        gestionnaire.afficherContact();
    }
}
