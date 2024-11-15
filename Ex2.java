package Teste;

import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Integer>numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        ArrayList<Integer>dobrados = new ArrayList<>();
        for(int numero : numeros){
            dobrados.add(numero * 2);
        }
        
        System.out.println("Lista origunal: " + numeros);
        System.out.println("Lista com valores dobrados: " + dobrados);
    }
}
