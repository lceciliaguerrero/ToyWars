package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import com.lceciliacifpfbmoll.programing.toyWars.data.abstractClass.LifeBeing;
import com.lceciliacifpfbmoll.programing.toyWars.data.abstractClass.Person;
import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.atomic.AtomicLong;

public class User extends Person {
    //Atributos privados estaticos final:
    private static final AtomicLong count = new AtomicLong(0);
    
    //Atributos privados estaticos:
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
    public User(String firstNamePersona, String lastNamePersona, String agePersona, String mobilePhoneNumberPersona, String emailPersona, String generoPersona, String password) {
        this.setIdentificationPersona(count.incrementAndGet());
        this.setFirstNamePersona(firstNamePersona.toLowerCase().trim());
        this.setLastNamePersona(lastNamePersona.toLowerCase().trim());
        this.setAgePersona(Integer.parseInt(agePersona.toLowerCase().trim()));
        this.setMobilePhoneNumberPersona(mobilePhoneNumberPersona.toLowerCase().trim());
        this.setEmailPersona(emailPersona.toLowerCase().trim());
        String optionGeneroPersona = generoPersona.toLowerCase().trim();
        try {
            if (StringUtils.equals(optionGeneroPersona, "femenino") ||
                    StringUtils.equals(optionGeneroPersona, "mujer") ||
                    StringUtils.equals(optionGeneroPersona, "niña")) {
                this.setGeneroPersona(Gender.FEMENINO);
            } else if (StringUtils.equals(optionGeneroPersona, "masculino") ||
                    StringUtils.equals(optionGeneroPersona, "hombre") ||
                    StringUtils.equals(optionGeneroPersona, "niño")) {
                this.setGeneroPersona(Gender.MASCULINO);
            } else if (StringUtils.equals(optionGeneroPersona, "ninguno")) {
                this.setGeneroPersona(Gender.NINGUNO);
            }
        } catch (Exception firstExceptionInsertDataUser) {
            System.out.println(firstExceptionInsertDataUser.getMessage());
        }
        this.setPassword(password.trim());

        this.toy = new Toy();
    }

    //Methods printData
    public void printUserConsole() {
        System.out.println("");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("Impresión del User.");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("");
        System.out.println("Su contrseña es: " + this.getPassword() + ".");
        System.out.println("");
        System.out.println("");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("");
        System.out.println("");
    }
}