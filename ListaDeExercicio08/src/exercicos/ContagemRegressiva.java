package exercicos;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro para começar a contagem regressiva: ");
        int numero = sc.nextInt();

        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }

        sc.close();
    }
}