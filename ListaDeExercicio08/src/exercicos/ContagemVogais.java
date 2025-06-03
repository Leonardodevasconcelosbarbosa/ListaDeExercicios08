package exercicos;

import java.util.Scanner;

public class ContagemVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase(); 
        int contador = 0;
        int totalVogais = 0;

        while (contador < palavra.length()) {
            char letra = palavra.charAt(contador);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                totalVogais++;
            }

            contador++;
        }

        System.out.println("A palavra \"" + palavra + "\" possui " + totalVogais + " vogais.");

        sc.close();
    }
}