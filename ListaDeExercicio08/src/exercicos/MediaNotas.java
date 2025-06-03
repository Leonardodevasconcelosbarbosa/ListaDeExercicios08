package exercicos;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidade = 0;
        double soma = 0;

        System.out.println("Digite notas de 0 a 10. Para parar, digite um número fora desse intervalo.");

        while (true) {
            System.out.print("Digite a nota: ");
            double nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                break; 
            }

            soma += nota;
            quantidade++;
        }

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.printf("Média das notas: %.2f%n", media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }

        sc.close();
    }
}