package Teste;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga uma frase: ");
        String frase = scanner.nextLine();

        System.out.println("Diga a palavra para ser procurada na frase: ");
        String palavra = scanner.nextLine();

        int ocorrencias = contarOcorrencias(frase, palavra);

        System.out.println("A palavra '" + palavra + "' apacere " + ocorrencias + " vezes na frase.");

        scanner.close();
    }
    public static int contarOcorrencias(String frase, String palavra){
        String[] palavras = frase.split(" ");
        int count = 0;

        for(String p : palavras){
            if(p.equalsIgnoreCase(palavra)){
                count++;
            }
        }
        return count;
    }
}
