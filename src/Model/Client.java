package Model;

import Controller.Commande;
import Controller.Produit;

public class Client {
    private String nom;
    private String email;
    private Commande commande;

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Client(String nom, String email , Commande commande) {
        this.nom = nom;
        this.email = email;
        this.commande = new Commande();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void commanderProduit(Produit produit) {
        commande.ajouterProduit(produit);
        System.out.println("Produit ajouté à la commande : " + produit.getNom() + "/n" + produit.getPrix());
    }

    public void afficherCommande(Commande commande) {
        System.out.println("Affichage de la commande de " + nom);
        System.out.println("Total de la commande : " + commande.getTotalcommande() + " €");
        commande.afficherToutLesProduits();
    }
}
