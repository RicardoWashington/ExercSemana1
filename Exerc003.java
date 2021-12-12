package exerc_semana_01;

import java.util.Scanner;

public class Exerc003 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Infomre o seu sobrenome: ");
        String sobrenome = new String(scanner.nextLine());
        System.out.println("Infomre o seu nome: ");
        String nome = new String(scanner.nextLine());
        String nomecompleto = nome +" " + sobrenome;
        System.out.println("Seu nome completo é: " + nomecompleto);
    }
}
