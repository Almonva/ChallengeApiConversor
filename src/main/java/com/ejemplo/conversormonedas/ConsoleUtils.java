package com.ejemplo.conversormonedas;

public class ConsoleUtils {

    public static void printMenu() {
        System.out.println("===================================");
        System.out.println("         CONVERSOR DE MONEDAS      ");
        System.out.println("===================================");
        System.out.println("Seleccione una opción:");
        System.out.println("1) Dólar a Sol peruano");
        System.out.println("2) Sol peruano a Dólar");
        System.out.println("3) Dólar a Real Brasileño");
        System.out.println("4) Real Brasileño a Dólar");
        System.out.println("5) Euro a Sol peruano");
        System.out.println("6) Sol peruano a Euro");
        System.out.println("7) Salir");
        System.out.println("===========Por Alvaro Montesinos===========");
        System.out.print("Opción: ");
    }

    public static void printConversionResult(double amount, String fromCurrency, double result, String toCurrency) {
        System.out.printf("%.2f %s es igual a %.2f %s%n", amount, fromCurrency, result, toCurrency);
        System.out.println("===================================");
    }

    public static void printError(String message) {
        System.out.println("Error: " + message);
        System.out.println("===================================");
    }

    public static void printExitMessage() {
        System.out.println("Gracias por usar el conversor de monedas. ¡Hasta luego!");
    }
}
