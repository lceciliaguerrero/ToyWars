package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

public class User {

    //Atributos privados estaticos:
    private String emailUser;
    private String password;

    //Constructores: (alt+insertar)
    public User() {
    }

    //Geters y Seters (alt+insertar)
    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //Methods insertData
    public User(String emailUser, String password) {
        this.setEmailUser(emailUser.toLowerCase().trim());
        this.setPassword(password.trim());
    }

    public void printUserConsole() {
        System.out.println("");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("Impresión del User.");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("");
        System.out.println("Su usuario es: " + this.getEmailUser() + ".");
        System.out.println("Su contrseña es: " + this.getPassword() + ".");
        System.out.println("");
        System.out.println("");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("");
        System.out.println("");
    }
}