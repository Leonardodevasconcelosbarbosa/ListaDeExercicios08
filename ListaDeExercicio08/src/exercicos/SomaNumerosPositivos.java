package exercicos;

import java.util.Scanner;

public class SomaNumerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite números positivos para somar. Digite um número negativo para parar.");

        while (true) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();

            if (numero < 0) {
                break; 
            }

            soma += numero;
        }

        System.out.println("Total somado dos números positivos: " + soma);

        sc.close();
    }
}