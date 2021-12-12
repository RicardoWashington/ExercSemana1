package exerc_semana_01;

import java.util.Scanner;

public class Exerc005 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Seu nome tem " + nome.length() + " letras.");
    }
}
