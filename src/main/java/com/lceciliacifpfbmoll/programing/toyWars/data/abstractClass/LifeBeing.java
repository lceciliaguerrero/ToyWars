package com.lceciliacifpfbmoll.programing.toyWars.data.abstractClass;

import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.DoActions;
import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.Gender;

public abstract class LifeBeing implements DoActions {
    //Atributos privados no estaticos:
    private Long identification;
    private String name;
    private Gender gender;
    /*private Integer points;*/

    //Constructores (alt+insertar)
    public LifeBeing(Long identification, String name, Gender gender) {
        this.identification = identification;
        this.name = name;
        this.gender = gender;
    }

    public LifeBeing(LifeBeing copyLifeBeing) {
        this.identification = copyLifeBeing.identification;
        this.identification = copyLifeBeing.identification;
        this.name = copyLifeBeing.name;
    }

    public LifeBeing() {
    }



    //Geters y Seters (alt+insertar)
    public Long getIdentification() {
        return identification;
    }

    public void setIdentification(Long identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    //-------------------------------------------------->> Methods <<--------------------------------------------------

}
