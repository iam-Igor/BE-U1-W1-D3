package entities;

import java.util.ArrayList;

public class Sim {

    private ArrayList<CallsList> lastCalled;
    private String phoneNumber;
    private double creditLeft;


    public Sim(String phoneNumber, double creditLeft) {
        this.phoneNumber = phoneNumber;
        this.creditLeft = creditLeft;
        this.lastCalled = new ArrayList<>();

    }


    public void getSImData() {
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Credit left: " + creditLeft);

        System.out.println("Last calls:" + lastCalled);
    }


}
