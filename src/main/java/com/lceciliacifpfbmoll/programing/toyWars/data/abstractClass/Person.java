package com.lceciliacifpfbmoll.programing.toyWars.data.abstractClass;

import com.lceciliacifpfbmoll.programing.toyWars.data.enumClass.Gender;

public abstract class Person {
    //Atributos privados no estaticos:
    private Long identificationPersona;
    private String firstNamePersona;
    private String lastNamePersona;
    private Integer agePersona;
    private String mobilePhoneNumberPersona;
    private String emailPersona;
    private Gender generoPersona;

    //Constructores (alt+insertar)
    public Person(Long identificationPersona, String firstNamePersona, String lastNamePersona, Integer agePersona, String mobilePhoneNumberPersona, String emailPersona, Gender generoPersona) {
        this.identificationPersona = identificationPersona;
        this.firstNamePersona = firstNamePersona;
        this.lastNamePersona = lastNamePersona;
        this.agePersona = agePersona;
        this.mobilePhoneNumberPersona = mobilePhoneNumberPersona;
        this.emailPersona = emailPersona;
        this.generoPersona = generoPersona;
    }

    public Person(Person copyPerson) {
        this.identificationPersona = copyPerson.identificationPersona;
        this.firstNamePersona = copyPerson.firstNamePersona;
        this.lastNamePersona = copyPerson.lastNamePersona;
        this.agePersona = copyPerson.agePersona;
        this.mobilePhoneNumberPersona = copyPerson.mobilePhoneNumberPersona;
        this.emailPersona = copyPerson.emailPersona;
        this.generoPersona = copyPerson.generoPersona;
    }

    public Person() {
    }


    //Geters y Seters (alt+insertar)
    public Long getIdentificationPersona() {
        return identificationPersona;
    }

    public void setIdentificationPersona(Long identificationPersona) {
        this.identificationPersona = identificationPersona;
    }

    public String getFirstNamePersona() {
        return firstNamePersona;
    }

    public void setFirstNamePersona(String firstNamePersona) {
        this.firstNamePersona = firstNamePersona;
    }

    public String getLastNamePersona() {
        return lastNamePersona;
    }

    public void setLastNamePersona(String lastNamePersona) {
        this.lastNamePersona = lastNamePersona;
    }

    public Integer getAgePersona() {
        return agePersona;
    }

    public void setAgePersona(Integer agePersona) {
        this.agePersona = agePersona;
    }

    public String getMobilePhoneNumberPersona() {
        return mobilePhoneNumberPersona;
    }

    public void setMobilePhoneNumberPersona(String mobilePhoneNumberPersona) {
        this.mobilePhoneNumberPersona = mobilePhoneNumberPersona;
    }

    public String getEmailPersona() {
        return emailPersona;
    }

    public void setEmailPersona(String emailPersona) {
        this.emailPersona = emailPersona;
    }

    public Gender getGeneroPersona() {
        return generoPersona;
    }

    public void setGeneroPersona(Gender generoPersona) {
        this.generoPersona = generoPersona;
    }

    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //Methods insertData
    public abstract void printConsolePerson();
}
