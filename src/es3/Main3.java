package es3;

import entities.Articles;
import entities.Cart;
import entities.Client;

public class Main3 {
    public static void main(String[] args) {
        // Esempio di utilizzo delle classi

        // Creazione di un articolo
        Articles prodotto1 = new Articles("Prodotto 1", 22, 19);

        // Creazione di un cliente
        Client cliente1 = new Client(1, "Mario", "Rossi", "mario@email.com");

        // Creazione di un carrello associato al cliente
        Cart carrelloCliente1 = new Cart(cliente1);

        // Aggiunta di un articolo al carrello
        carrelloCliente1.aggiungiArticolo(prodotto1);

        // Calcolo del totale nel carrello
        double totaleCarrello = carrelloCliente1.calcolaTotale();
        System.out.println("Totale nel carrello del cliente 1: " + totaleCarrello);
    }
}