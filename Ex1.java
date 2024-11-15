package Teste;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga o valor do raio do circulo: ");
        double raio = scanner.nextDouble();

        double area = calcularArea(raio);
        double perimetro = calcularPerimetro(raio);

        System.out.println("Para um circuclo com um raio: " + raio);
        System.out.println("Area do circulo é: " + area);
        System.out.println("Perimetro do circulo é: "+ perimetro);
    }
    public static double calcularArea(double raio){
        return Math.PI * Math.pow(raio, 2);
    }
    public static double calcularPerimetro(double raio){
        return 2 * Math.PI * raio;
    }
}
