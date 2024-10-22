package org.launchcode;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else if (lang.equals("pg")) {
            return "elloHay, orldWay!";
        } else {
            return "Hello, World!";
        }
    }
}
