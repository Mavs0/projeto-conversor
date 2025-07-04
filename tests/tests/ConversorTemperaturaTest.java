package tests.tests;

import src.ConversorTemperatura;

public class ConversorTemperaturaTest {
    public static void main(String[] args) {
        testFahrenheitToCelsius();
        testCelsiusToFahrenheit();
        System.out.println("Todos os testes foram executados.");
    }

    public static void testFahrenheitToCelsius() {
        double result = ConversorTemperatura.fahrenheitToCelsius(32);
        if (result != 0) {
            System.err.println("Erro no fahrenheitToCelsius: esperado 0, obtido " + result);
            System.exit(1);
        }
    }

    public static void testCelsiusToFahrenheit() {
        double result = ConversorTemperatura.celsiusToFahrenheit(0);
        if (result != 32) {
            System.err.println("Erro no celsiusToFahrenheit: esperado 32, obtido " + result);
            System.exit(1);
        }
    }
}
