package es3;

import entities.Articles;
import entities.Client;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);


        System.out.println("Enter your user code");
        int userCode = Integer.parseInt(userInput.nextLine());
        System.out.println("Enter your name");
        String name = userInput.nextLine();
        System.out.println("Enter your surname");
        String surname = userInput.nextLine();
        System.out.println("Enter your email");
        String email = userInput.nextLine();

        Client admin = new Client(userCode, name, surname, email);
        admin.getUserData();


        System.out.println("Enter the description about the Article");
        String description = userInput.nextLine();
        System.out.println("Enter the price");
        double price = Double.parseDouble(userInput.nextLine());
        System.out.println("How many items are left?");
        int itemsleft = Integer.parseInt(userInput.nextLine());

        Articles toy = new Articles(description, price, itemsleft);
        toy.getArticlesData();


    }
}
