package exercicios;

public class Temperatura {
    public static void main(String[] args) {
        // Conversão de graus Fahrenheit p / celsius
        // (F - 32) * 5/9 = Cº
        double fahrenheit = 64;
        final double ajuste  = 32;
        final double multiplicador = 5.0/9.0;
        final double celsius = (fahrenheit - ajuste) * multiplicador;

        System.out.println("Celsius: "+celsius);
    }
}
