package Vue;

import java.util.ArrayList;

import Controller.*;
import Model.Client;

public class Main {
    public static void main(String[] args) {
        Ordinateur ordi = new Ordinateur("PC Gamer", 999.99f, 1, "Asus", "ROG");
        Accessoire souris = new Accessoire("Souris Gaming", 49.99f, 2, "Souris");
        Accessoire clavier = new Accessoire("clavier Gaming", 49.99f, 2, "Clavier");


        Client client = new Client("Jean Dupont","mael@e",new Commande());

        client.commanderProduit(ordi);
        client.commanderProduit(souris);
        client.commanderProduit(clavier);


        client.afficherCommande(client.getCommande());

    }
}