package com.lceciliacifpfbmoll.programing.toyWars.data.dataClass;

import java.util.concurrent.atomic.AtomicLong;

public class UserAction {
    //Atributos publicos estaticos final:
    private static final AtomicLong count = new AtomicLong(0);

    //Atributos privados no estaticos:
    private Long registryAction;
    private String typeToy;
    private Integer pointsStart;
    private Integer pointsObtained;

    //Constructores (alt+insertar)
    public UserAction() {
    }

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

    public String getTypeToy() {
        return typeToy;
    }

    public void setTypeToy(String typeToy) {
        this.typeToy = typeToy;
    }

    public Integer getPointsStart() {
        return pointsStart;
    }

    public void setPointsStart(Integer pointsStart) {
        this.pointsStart = pointsStart;
    }

    public Integer getPointsObtained() {
        return pointsObtained;
    }

    public void setPointsObtained(Integer pointsObtained) {
        this.pointsObtained = pointsObtained;
    }

    //-------------------------------------------------->> Methods <<--------------------------------------------------
    //Methods insertData
    public UserAction(String typeToy, String pointsObtained) {
        this.setRegistryAction(count.incrementAndGet());
        this.setTypeToy(typeToy.toLowerCase().trim());
        this.setPointsStart(100);
        this.setPointsObtained(Integer.parseInt(pointsObtained.toLowerCase().trim()));
    }

    //Methods printData
    public void printUserActionConsole() {
        System.out.println("");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("Impresión del UserAction " + this.getRegistryAction() + ".");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("");
        System.out.println("Su tipo de juguete es: " + this.getTypeToy() + ".");
        System.out.println("Su puntos de inicio son: " + this.getPointsStart() + ".");
        System.out.println("Su puntos obtenidos son: " + this.getPointsObtained() + ".");
        System.out.println("");
        System.out.println("");
        System.out.println("<<---------------------------------------------------------->>");
        System.out.println("");
        System.out.println("");
    }
}
