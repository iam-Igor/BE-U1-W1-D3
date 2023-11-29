package entities;

public class Articles {

    private double artId = Math.random();
    private String description;
    private double price;

    private int itemsLeft;


    public Articles(String description, double price, int itemsLeft) {
        this.artId = artId;
        this.description = description;
        this.price = price;
        this.itemsLeft = itemsLeft;
    }

    public double getCodiceArticolo() {
        return artId;
    }

    public void setCodiceArticolo(int codiceArticolo) {
        this.artId = codiceArticolo;
    }

    public String getDescrizione() {
        return description;
    }

    public void setDescrizione(String descrizione) {
        this.description = descrizione;
    }


    public double getPrezzo() {
        return price;
    }

    public void setPrezzo(double prezzo) {
        this.price = prezzo;


    }


    public int getPezziDisponibili() {
        return itemsLeft;
    }

    public void setPezziDisponibili(int pezziDisponibili) {
        this.itemsLeft = pezziDisponibili;
    }

}
