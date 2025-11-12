import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Sintaxe da estrutura condicional simples
        int a = 5;

        System.out.println("Bom dia");

        if (a < 0) {
            System.out.println("Boa tarde");
        }

        System.out.println("Boa noite");

        // Sintaxe da estrutura condicional composta
        Scanner sc = new Scanner(System.in);
        int hora1;

        System.out.println("Quantas horas ?");
        hora1 = sc.nextInt();

        if (hora1 < 12) {
            System.out.println("Bom dia");
        } else {
            System.out.println("Boa tarde");
        }

        // Sintaxe da estrutura condicional aninhadas
        int hora2;

        System.out.println("Quantas horas ?");
        hora2 = sc.nextInt();

        if (hora2 < 12) {
            System.out.println("Bom dia");
        } else if (hora2 < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }

        sc.close();
    }
}