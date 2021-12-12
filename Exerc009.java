package exerc_semana_01;

import java.util.Scanner;

public class Exerc009 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha: 1 - Mussarela / 2 - Peperroni / 3 - Frango Catupiry / 4 - Portuguesa / 0 - Caso esteja satisfeito");
        int escolha = scanner.nextInt();
        int cont = 0;
        while (escolha >= 1) {
            if (escolha >= 5) {
                System.out.println("Tente novamente!");
            }else{
                cont++;
            }
            System.out.println("Escolha: 1 - Mussarela / 2 - Peperroni / 3 - Frango Catupiry / 4 - Portuguesa / 0 - Caso esteja satisfeito");
            escolha = scanner.nextInt();
        }
        if (escolha == 0 && cont == 0) {
            System.out.println("Você não comeu!");
            System.out.println("Obrigado e volte sempre!");
        }else{
            System.out.printf("Você comeu %d fatias! %n", cont);
            System.out.println("Obrigado e volte sempre!");
        }
        scanner.close();
    }
}
