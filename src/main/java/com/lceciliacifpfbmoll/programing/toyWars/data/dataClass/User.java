package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import com.lceciliacifpfbmoll.programing.toyWars.data.abstractClass.Person;
import com.lceciliacifpfbmoll.programing.toyWars.data.enumClass.Gender;
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
    public static AtomicLong getCount() {
        return count;
    }

    public String getKeyUser() {
        return keyUser;
    }

    public void setKeyUser(String keyUser) {
        this.keyUser = keyUser;
    }

    public Toy getToy() {
        return toy;
    }

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    //-----------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //-----------------------------------------------------------------------------------------------------------------
    //Methods insertData
    public User(String firstNamePersona, String lastNamePersona, String agePersona,
                String mobilePhoneNumberPersona, String emailPersona,
                String generoPersona, String keyUser, String nameToy,
                String genderToy, String toysType) {
        //count.incrementAndGet() ---> incrementa uno al Long
        this.setIdentificationPersona(count.incrementAndGet());

        //String firstNamePersona
        this.setFirstNamePersona(firstNamePersona.toLowerCase().trim());

        //String lastNamePersona
        this.setLastNamePersona(lastNamePersona.toLowerCase().trim());

        //String agePersona
        this.setAgePersona(Integer.parseInt(agePersona.toLowerCase().trim()));

        //String mobilePhoneNumberPersona
        this.setMobilePhoneNumberPersona(mobilePhoneNumberPersona.toLowerCase().trim());

        //String emailPersona
        this.setEmailPersona(emailPersona.toLowerCase().trim());

        //String generoPersona
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

        this.setKeyUser(keyUser.trim());
        this.setToy(new Toy(nameToy, genderToy, toysType));
    }

    //Methods printData
    @Override
    public void printConsolePerson() {
        System.out.println("");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("Impresión del User " + this.getIdentificationPersona() + ".");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("");
        System.out.println("Su nombre es: " + this.getFirstNamePersona() + ", " +
                this.getLastNamePersona() + ".");
        System.out.println("Su edad es: " + this.getAgePersona() + " años.");
        System.out.println("Su número de teléfono móvil es: " +
                this.getMobilePhoneNumberPersona() + ".");
        System.out.println("El correo electrónico es: " + this.getEmailPersona() + ".");
        System.out.println("El género es: " + this.getGeneroPersona() + ".");
        System.out.println("Su contrseña es: " + this.getKeyUser() + ".");
        System.out.println("");
        System.out.println("");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("");
        System.out.println("");
    }
}