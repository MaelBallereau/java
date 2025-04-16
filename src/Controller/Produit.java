package Controller;

public class Produit  implements Affichable {
    private String nom;
    private float prix;
    private int stock;

    public Produit(String nom, float prix, int stock) {
        this.nom = nom;
        this.prix = prix;
        this.stock = stock;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String afficherDetails() {
        return "Nom : " + nom + "\nPrix : " + prix + " €\nStock : " + stock;
    }
}
