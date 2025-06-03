package exercicos;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo para calcular o fatorial: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Fatorial não é definido para números negativos.");
        } else {
            long fatorial = 1;
            int contador = numero;

            while (contador > 1) {
                fatorial *= contador;
                contador--;
            }

            System.out.println("O fatorial de " + numero + " é " + fatorial);
        }

        sc.close();
    }
}