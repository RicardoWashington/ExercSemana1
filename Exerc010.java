package exerc_semana_01;

import java.util.Scanner;

public class Exerc010 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número inteiro:");
        int num = scanner.nextInt();
        char primo = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = 1;
                break;
            }
        }
        if (primo == 0) {
            System.out.println(num + " é um número primo");
        } else {
            System.out.println(num + " não é um número primo");
        }
        scanner.close();


   /*   Forma sem FOR

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int vlr = scanner.nextInt();
        if (vlr%2 != 0 || vlr == 2){
            if (vlr%3 != 0 || vlr == 2 || vlr == 3){
                if (vlr%5 != 0 || vlr ==  2 || vlr == 3 || vlr == 5){
                    if (vlr%7 != 0 || vlr ==2 || vlr == 3 || vlr == 5 || vlr == 7){
                        System.out.println("Esse é um número primo");
                    }else{
                        System.out.println("Esse não um número primo");
                    }
                }else{
                    System.out.println("Esse não um número primo");
                }
            }else{
                System.out.println("Esse não um número primo");
            }
        } else {
            System.out.println("Esse não um número primo");
        }*/

    }
}
