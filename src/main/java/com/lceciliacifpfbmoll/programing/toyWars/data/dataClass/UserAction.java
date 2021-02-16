package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import com.lceciliacifpfbmoll.programing.toyWars.ToyWars;
import com.lceciliacifpfbmoll.programing.toyWars.data.enumClass.ToysType;

import java.util.concurrent.atomic.AtomicLong;

public class UserAction {
    //Atributos publicos estaticos final:
    private static final AtomicLong count = new AtomicLong(0);

    //Atributos privados estaticos:
    private static Toy toy;

    //Atributos privados no estaticos:
    private Long registryAction; //111111L => integer largo
    private ToysType toysType;
    private Integer pointsStart;
    private Integer actualPoints;

    //Geters y Seters (alt+insertar)
    public static AtomicLong getCount() {
        return count;
    }



    public Long getRegistryAction() {
        return registryAction;
    }

    public void setRegistryAction(Long registryAction) {
        this.registryAction = registryAction;
    }

    public ToysType getToysType() {
        return toysType;
    }

    public void setToysType(ToysType toysType) {
        this.toysType = toysType;
    }

    public Integer getPointsStart() {
        return pointsStart;
    }

    public void setPointsStart(Integer pointsStart) {
        this.pointsStart = pointsStart;
    }

    public Integer getActualPoints() {
        return actualPoints;
    }

    public void setActualPoints(Integer actualPoints) {
        this.actualPoints = actualPoints;
    }

    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //Methods insertData
    public UserAction() {
        this.setRegistryAction(count.incrementAndGet());
        ToysType optionToysType = toy.getToysType();
        this.setToysType(optionToysType);
        this.setPointsStart(ToyWars.beginningPoints);
        this.setActualPoints(toy.getActualPoints());
    }

    //Methods printData
    public void printUserActionConsole() {
        System.out.println("");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("Impresión del UserAction " + this.getRegistryAction() + ".");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("");
        System.out.println("Su tipo de juguete es: " + this.getToysType() + ".");
        System.out.println("Su puntos de inicio son: " + this.getPointsStart() + ".");
        System.out.println("Su puntos obtenidos son: " + this.getActualPoints() + ".");
        System.out.println("");
        System.out.println("");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("");
        System.out.println("");
    }
}
