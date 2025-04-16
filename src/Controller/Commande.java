package Controller;

import java.util.ArrayList;

public class Commande {
    private float totalcommande;
    private ArrayList<Produit> produits;


    public Commande() {
        produits = new ArrayList<Produit>();
        totalcommande = 0;
    }

    public float getTotalcommande() {
        return totalcommande;
    }

    public void ajouterProduit(Produit unProduit) {
        produits.add(unProduit);
        totalcommande += unProduit.getPrix();
    }

    public void afficherToutLesProduits() {
        if (produits == null || produits.isEmpty()) {
            System.out.println("Aucun produit dans cette commande.");
            return;
        }

        System.out.println("Liste des produits de la commande :");
        for (Produit p : produits) {
            System.out.println("------------------------");
            System.out.println(p.afficherDetails());
        }
    }


    public void setTotalcommande(float totalcommande) {
        this.totalcommande = totalcommande;
    }
}
