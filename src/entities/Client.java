package entities;

import java.util.Date;

public class Client {

    private int userCode;
    private String name;
    private String surname;
    private String email;

    private Date date = new Date();


    public Client(int userCode, String name, String surname, String email) {
        this.userCode = userCode;
        this.name = name;
        this.surname = surname;
        this.email = email;

    }


    public void getUserData() {
        System.out.println("Code: " + userCode);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Email: " + email);
        System.out.println("Date of subscrption: " + date);
    }
}
