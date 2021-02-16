package com.lceciliacifpfbmoll.programing.toyWars;


public class PruebasToyWars {
    private String emailUser;
    private String password;

    public String getEmailUser() {
        return emailUser;
    }

    public PruebasToyWars(String emailUser, String password) {
        this.emailUser = emailUser;
        this.password = password;
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

    public void LogIn (String emailUser, String password) {
        /*if (emailUser == null){
            return "please enter an email address";
        }*/
        this.setEmailUser(emailUser); //= this.emailUser=emailUser
        this.setPassword(password);
        /*return  "vas a iniciar sesion";*/
    }
}
