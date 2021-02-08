package com.lceciliacifpfbmoll.programing.toyWars.helper;

import java.util.Scanner;

public class ConsoleUtils {
    //Atributos privados estaticos finales:
    private static final Scanner lector = new Scanner(System.in);

    public String getLectorNextLineLowerCase() {
        return lector.nextLine().toLowerCase().trim();
    }

    public String getLectorNextLineUpperCase() {
        return lector.nextLine().toUpperCase().trim();
    }

    public String getLectorNextLowerCase() {
        return lector.next().toLowerCase().trim();
    }

    public String getLectorNextUpperCase() {
        return lector.next().toLowerCase().trim();
    }
}
