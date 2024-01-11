import java.util.ArrayList;

public class ListeDeCourses {

    ArrayList<Article> listeArticles = new ArrayList<>();
    double somme = 0;
    public void ajouterArticle(Article article) {
        listeArticles.add(article);
    }

    public void retirerArticle(String nom) {
        ArrayList<Article> supprArticle = new ArrayList<>();
        for (Article article : listeArticles) {
            if (article.getNom() == nom) {
                supprArticle.add(article);
            }
        }
        for (Article article : supprArticle) {
            listeArticles.remove(article);
        }
    }

    public void afficherListe() {
        for (Article article : listeArticles) {
            System.out.println(article.getNom()+" "+article.getPrix()+" "+article.getQuantite()+" "+article.getTva());
        }
    }

    public double calculerTotal() {
        for (Article article : listeArticles) {
            somme += (article.getPrix()*(1 + (article.getTva() / 100)))* article.getQuantite();
        }
        return somme;
    }
}
