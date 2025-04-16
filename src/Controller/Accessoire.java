package Controller;

import java.util.ArrayList;

public class Accessoire extends Produit {
    private String type;

    public Accessoire(String nom, float prix, int stock, String type) {
        super(nom, prix, stock);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String afficherDetails() {
        return super.afficherDetails() + "\nType : " + type;
    }

    public void CompatibleAvec(ArrayList<String> produitsCompatibles) {
        System.out.println("Accessoire compatible avec :");
        for (String produit : produitsCompatibles) {
            System.out.println("- " + produit);
        }
    }
}
