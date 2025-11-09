import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Para ler uma palavra (texto sem espaços)
        String a;
        a = sc.next();
        System.out.println("Voce digitou " + a);

        // Para ler um número inteiro
        int b;
        b = sc.nextInt();
        System.out.println("Voce digitou " + b);

        // Para ler um número com ponto flutuante
        double c;
        c = sc.nextDouble();
        System.out.println("Voce digitou " + c);

        // Para ler um caractere
        char d;
        d = sc.next().charAt(0);
        System.out.println("Voce digitou " + d);

        // Para ler vários dados na mesma linha
        String e;
        int f;
        double g;
        e = sc.next();
        f = sc.nextInt();
        g = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        sc.close();
    }
}
