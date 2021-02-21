package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import com.lceciliacifpfbmoll.programing.toyWars.ToyWars;
import com.lceciliacifpfbmoll.programing.toyWars.data.abstractClass.Person;
import com.lceciliacifpfbmoll.programing.toyWars.data.enumClass.Gender;
import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.atomic.AtomicLong;

public class User extends Person {
    //Atributos privados estaticos final:
    private static final AtomicLong count = new AtomicLong(0);

    //Atributos privados estaticos:
    private String keyUser;
    private Toy toy;

    //Constructores: (alt+insertar)
    public User(Long identificationPersona, String firstNamePersona, String lastNamePersona,
                Integer agePersona, String mobilePhoneNumberPersona, String emailPersona,
                Gender generoPersona, String keyUser, Toy toy) {
        super(identificationPersona, firstNamePersona, lastNamePersona,
                agePersona, mobilePhoneNumberPersona, emailPersona, generoPersona);
        this.keyUser = keyUser;
        this.toy = toy;
    }

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
                String generoPersona, String keyUser, String nameToy, String genderToy, String toysType) {
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

   /*public User(String nameToy, String genderToy, String toysType) {
        this.setToy(new Toy(nameToy, genderToy, toysType));
    } */

    //Methods printData
    @Override
    public void printConsolePerson() {
        String printUser =
                "\n" +
                        "<<---------------------------------------------------------->>\n" +
                        "Impresión del User " + this.getIdentificationPersona() + ".\n" +
                        "<<---------------------------------------------------------->>\n" +
                        "\n" +
                        "Su nombre es: " + this.getFirstNamePersona() + ", " + this.getLastNamePersona() + ".\n" +
                        "Su edad es: " + this.getAgePersona() + " años." + "\n" +
                        "Su número de teléfono móvil es: " + this.getMobilePhoneNumberPersona() + ".\n" +
                        "El correo electrónico es: " + this.getEmailPersona() + ".\n" +
                        "El género es: " + this.getGeneroPersona() + ".\n" +
                        "Su contrseña es: " + this.getKeyUser() + ".\n" +
                        "\n" +
                        "\n" +
                        "<<---------------------------------------------------------->>\n" +
                        "\n" +
                        "\n";
        System.out.println(printUser);
        ToyWars.loggerUtils.logerFactoryInfoToString(printUser);
    }
}