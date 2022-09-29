package terceira.aula;

import java.util.Scanner;

public class TerceiraAula {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a linguagem: ");
        String linguagem = scanner.next();

        linguagem = linguagem.toUpperCase();

        switch (linguagem) {
            case "JAVA":
            case "KOTLIN":
                System.out.println("É uma linguagem compilada.");
                break;
            case "PHP":
            case "JAVASCRIPT":
                System.out.println("É uma linguagem interpretada.");
                break;
            default:
                System.out.println("Linguagem não encontrada.");
                break;
        }
    }
}
