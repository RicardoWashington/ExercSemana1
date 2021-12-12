package exerc_semana_01;

import java.util.Scanner;

public class Exerc007 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro entre 0 e 10:");
        int valor = scanner.nextInt();
        int fat = 1;
        if (valor >= 0 && valor <= 10){
            for (int i = 1; i < valor; i++){
                int cont = i + 1;
                fat = cont * fat;
            }
        } else {
            System.out.println("Não foi informado um número entre 0 e 10");
        }
        System.out.printf("O fatoral de %d é %d", valor, fat);
    }
}
