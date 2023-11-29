package entities;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private Client clienteAssociato;
    private List<Articles> elencoArticoli;
    private double totaleCostoArticoli;

    public Cart(Client clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = new ArrayList<>();
        this.totaleCostoArticoli = 0.0;
    }

    public void aggiungiArticolo(Articles articolo) {
        elencoArticoli.add(articolo);
        totaleCostoArticoli += articolo.getPrezzo();
    }

    public void rimuoviArticolo(Articles articolo) {
        elencoArticoli.remove(articolo);
        totaleCostoArticoli -= articolo.getPrezzo();
    }

    public double calcolaTotale() {
        return totaleCostoArticoli;
    }
}
