package Controller;

import java.util.ArrayList;

public class Configuration extends Produit {
    private Ordinateur ordinateur;
    private ArrayList<Accessoire> accessoires;

    public Configuration(String nom, float prix, int stock, Ordinateur ordinateur, ArrayList<Accessoire> accessoires) {
        super(nom, prix, stock);
        this.ordinateur = ordinateur;
        this.accessoires = accessoires;
    }


    public Ordinateur getOrdinateur() {
        return ordinateur;
    }

    public void setOrdinateur(Ordinateur ordinateur) {
        this.ordinateur = ordinateur;
    }

    public ArrayList<Accessoire> getAccessoire() {
        return accessoires;
    }

    public void ajouterAccessoire(Accessoire accessoire) {
        accessoires.add(accessoire);
    }

    public void setAccessoire(ArrayList<Accessoire> accessoire) {
        this.accessoires = accessoire;
    }

    @Override
    public String afficherDetails() {
        String details = "Configuration : " + getNom() + "\n";
        details += "Ordinateur : \n" + ordinateur.afficherDetails() + "\n";
        details += "Accessoires : \n";
        for (Accessoire acc : accessoires) {
            details += acc.afficherDetails() + "\n";
        }
        return details;
    }

}
