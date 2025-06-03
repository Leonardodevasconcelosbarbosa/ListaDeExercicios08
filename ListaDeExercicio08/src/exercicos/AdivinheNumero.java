package exercicos;

import java.util.Scanner;

import java.util.Random;

public class AdivinheNumero {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(10) + 1;
        int palpite = 0;

        System.out.println("Tente adivinhar o número secreto entre 1 e 10!");

        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            palpite = sc.nextInt();

            if (palpite < 1 || palpite > 10) {
                System.out.println("Por favor, digite um número entre 1 e 10.");
                continue;
            }

            if (palpite < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto.");
            }
        }

        sc.close();
    }
}