package atividades;

public class ConversorDolar {

    public static void main(String[] args) {

        final double COTACAO = 5.18;
        double real = 150;
        System.out.printf("A conversão de R$ %.2f hoje é US$ %.2f.", real, (real / COTACAO));

    }
}
