package segunda.aula;

import java.util.Scanner;

public class SegundaAula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        System.out.println("Digite sua cidade:");
        String cidade = sc.next();

        System.out.println("Digite sua estado:");
        String estado = sc.next();

        System.out.println("A idade da " + idade + " é " + idade + " anos. " + cidade + " estado " + estado);


       // Scanner sc = new Scanner(System.in); System.out.print("Bem-vindo ao nosso site!"); String nome = sc.nextline(); Scanner sc = new Scanner(System.in); System.out.print("Digite seu nome:"); String nome = sc.next();
       // para imprimir: Bem-vindo ao nosso site! Digite seu nome:


        sc.close();
    }
}
