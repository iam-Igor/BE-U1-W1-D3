package es3;

import entities.Articles;
import entities.Cart;
import entities.Client;

public class Main3 {
    public static void main(String[] args) {

        Articles prodotto1 = new Articles("Prodotto 1", 22, 19);

        Client cliente1 = new Client(1, "Mario", "Rossi", "mario@email.com");


        Cart carrelloCliente1 = new Cart(cliente1);


        carrelloCliente1.aggiungiArticolo(prodotto1);


        double totaleCarrello = carrelloCliente1.calcolaTotale();
        System.out.println("Totale nel carrello del cliente 1: " + totaleCarrello);
    }
}