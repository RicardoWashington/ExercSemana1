package exerc_semana_01;

import java.util.Scanner;

public class Exerc004 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor:");
        Float valor = scanner.nextFloat();
        int val = valor.intValue();
        System.out.println(val);
    }
}
