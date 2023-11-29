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


    public int getCodiceCliente() {
        return userCode;
    }

    public void setCodiceCliente(int codiceCliente) {
        this.userCode = codiceCliente;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getCognome() {
        return surname;
    }

    public void setCognome(String cognome) {
        this.surname = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataIscrizione() {
        return date;
    }

    public void setDataIscrizione(Date dataIscrizione) {
        this.date = dataIscrizione;
    }
}
