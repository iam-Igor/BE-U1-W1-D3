package es1;

import entities.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        perimetro
        System.out.println("Inserisci i dati del primo rettangolo");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Inserisci base del rettangolo");
        int base = Integer.parseInt(userInput.nextLine());
        System.out.println("Inserisci lato del rettangolo");
        int side = Integer.parseInt(userInput.nextLine());

        Rectangle rect1 = new Rectangle(base, side);
        rect1.calcPerim();
        rect1.calcArea();


//        area

        System.out.println("Inserisci i dati del secondo rettangolo");
        System.out.println("Inserisci base del rettangolo");
        int base2 = Integer.parseInt(userInput.nextLine());

        System.out.println("Inserisci lato del rettangolo");
        int side2 = Integer.parseInt(userInput.nextLine());


        Rectangle rect2 = new Rectangle(base2, side2);
        rect2.calcPerim();
        rect2.calcArea();


//        stampa 2 rettangoli

        int perim1 = rect1.perim;
        int area1 = rect1.area;

        int perim2 = rect2.perim;
        int area2 = rect2.area;
        calcAllDatas(perim1, perim2, area1, area2);

    }


    public static void calcAllDatas(int perim1, int perim2, int area1, int area2) {
        int areaSum = area1 + area2;
        int perimSum = perim1 + perim2;
        System.out.println("la somma dei perimetri dei rettangoli è:" + perimSum);
        System.out.println("la somma delle aree dei rettangoli è:" + areaSum);

    }


}