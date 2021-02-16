package com.lceciliacifpfbmoll.programing.toyWars.data.abstractClass;

import com.lceciliacifpfbmoll.programing.toyWars.data.interfaceClass.DoActions;
import com.lceciliacifpfbmoll.programing.toyWars.data.dataClass.Estatus;
import com.lceciliacifpfbmoll.programing.toyWars.data.enumClass.Gender;
import com.lceciliacifpfbmoll.programing.toyWars.data.interfaceClass.IRender;

public abstract class LifeBeing implements DoActions, IRender {
    //Atributos privados no estaticos:
    private Long identification;
    private String name;
    private Gender gender;
    private Estatus estatus; // Se actualiza segun la acción que el usuario introduce.
                             // OJO QUE SI EL POKEMON SE ESTÁ ALIMENDO NO PUEDE VOLVER A ALIMENTARSE.

    //Constructores (alt+insertar)
    public LifeBeing(Estatus estatus, Long identification, String name, Gender gender) {
        this.estatus = estatus;
        this.identification = identification;
        this.name = name;
        this.gender = gender;
    }

    public LifeBeing(LifeBeing copyLifeBeing) {
        this.estatus = copyLifeBeing.estatus;
        this.identification = copyLifeBeing.identification;
        this.name = copyLifeBeing.name;
        this.gender = copyLifeBeing.gender;
    }

    public LifeBeing() {
    }



    //Geters y Seters (alt+insertar)
    public Estatus getEstatus() {
        return estatus;
    }

    public void setEstatus(Estatus estatus) {
        this.estatus = estatus;
    }

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
    //Methods insertData
    public abstract void printTConsoleLifeBeing();
}
