package exerc_semana_01;

import java.util.Scanner;

public class Exerc006 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        float n1 = scanner.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float n2 = scanner.nextFloat();
        System.out.println("Digite a terceira nota:");
        float n3 = scanner.nextFloat();
        float media = (n1+n2+n3)/3;
        System.out.printf("A média final é: %.2f", media);

    }
}
