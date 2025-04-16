package Controller;

public class Ordinateur extends Produit {
    private String marque;
    private String modele;

    public Ordinateur(String nom, float prix, int stock, String marque, String modele) {
        super(nom, prix, stock);
        this.marque = marque;
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }
    @Override
    public String afficherDetails() {
        return super.afficherDetails() + "\nModele : " + modele + "\nMarque :  " + marque;
    }
}