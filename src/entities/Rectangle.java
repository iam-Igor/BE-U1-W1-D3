package entities;

public class Rectangle {

    public int base;
    public int side;

    public int area;

    public int perim;


    //constructors

    public Rectangle(int base, int side) {
        this.base = base;
        this.side = side;

    }


    //methods

    public void calcPerim() {
        this.perim = ((this.base * 2) + (this.side * 2));
        System.out.println("Perimetro:" + this.perim);
    }

    public void calcArea() {
        this.area = this.base * this.side;
        System.out.println("Area:" + this.area);
    }


}
