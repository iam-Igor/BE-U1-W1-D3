package entities;

public class Articles {

    public double artId = Math.random();
    public String description;
    public double price;

    public int itemsLeft;


    public Articles(String description, double price, int itemsLeft) {
        this.artId = artId;
        this.description = description;
        this.price = price;
        this.itemsLeft = itemsLeft;
    }

    public void getArticlesData() {
        System.out.println("Article: " + description);
        System.out.println("Prezzo: " + price);
        System.out.println("Items Left:" + itemsLeft);
        System.out.println("ID: " + artId);

    }

}
