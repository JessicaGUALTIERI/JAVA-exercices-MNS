import java.util.ArrayList;

public class GestionnaireContacts {
    ArrayList<Contact> listeContact = new ArrayList<>();

    public void ajouterContact(Contact contact) {
        listeContact.add(contact);
    }

    public void afficherContact() {
        for (Contact contacts : listeContact) {
            System.out.println(contacts.afficherContact());
        }
    }

    public void supprimerContact(String nom, String prenom) {
        ArrayList<Contact> contactSuppr = new ArrayList<>();
        for (Contact contacts : listeContact) {
            if (contacts.getNom() == nom && contacts.getPrenom() == prenom) {
                contactSuppr.add(contacts);
            }
        }
        for (Contact contact : contactSuppr) {
            listeContact.remove(contact);
        }
    }

    public void mettreAJourContact(String nom, String prenom, String modif) {
        for (Contact contacts : listeContact) {
            if (contacts.getNom() == nom && contacts.getPrenom() == prenom) {
                contacts.setMail(modif);
            }
        }
    }

    public Contact chercherContact(String nom, String prenom) {
        for (Contact contacts : listeContact) {
            if (contacts.getNom() == nom && contacts.getPrenom() == prenom) {
                return contacts;
            }
        }
        return null;
    }

}
