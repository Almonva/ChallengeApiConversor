package com.ejemplo.conversormonedas;

import java.io.IOException;
import java.util.Scanner;

public class CurrencyConverterApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        while (true) {
            ConsoleUtils.printMenu();
            int option = scanner.nextInt();

            if (option == 7) {
                ConsoleUtils.printExitMessage();
                break;
            }

            System.out.print("Ingrese la cantidad: ");
            double amount = scanner.nextDouble();
            double result = 0;
            String fromCurrency = "";
            String toCurrency = "";

            try {
                switch (option) {
                    case 1:
                        fromCurrency = "USD";
                        toCurrency = "PEN";
                        result = converter.convert(fromCurrency, toCurrency, amount);
                        ConsoleUtils.printConversionResult(amount, fromCurrency, result, toCurrency);
                        break;
                    case 2:
                        fromCurrency = "PEN";
                        toCurrency = "USD";
                        result = converter.convert(fromCurrency, toCurrency, amount);
                        ConsoleUtils.printConversionResult(amount, fromCurrency, result, toCurrency);
                        break;
                    case 3:
                        fromCurrency = "USD";
                        toCurrency = "BRL";
                        result = converter.convert(fromCurrency, toCurrency, amount);
                        ConsoleUtils.printConversionResult(amount, fromCurrency, result, toCurrency);
                        break;
                    case 4:
                        fromCurrency = "BRL";
                        toCurrency = "USD";
                        result = converter.convert(fromCurrency, toCurrency, amount);
                        ConsoleUtils.printConversionResult(amount, fromCurrency, result, toCurrency);
                        break;
                    case 5:
                        fromCurrency = "EUR";
                        toCurrency = "PEN";
                        result = converter.convert(fromCurrency, toCurrency, amount);
                        ConsoleUtils.printConversionResult(amount, fromCurrency, result, toCurrency);
                        break;
                    case 6:
                        fromCurrency = "PEN";
                        toCurrency = "EUR";
                        result = converter.convert(fromCurrency, toCurrency, amount);
                        ConsoleUtils.printConversionResult(amount, fromCurrency, result, toCurrency);
                        break;
                    default:
                        ConsoleUtils.printError("Opción no válida.");
                        break;
                }
            } catch (IOException e) {
                ConsoleUtils.printError("Error al realizar la conversión: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
