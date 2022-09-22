package atividades;

public class ConversorMedidas {

    public static void main(String[] args) {

        final double FATOR = 2.54;
        double polegadas = 10;
        System.out.printf("%.2f polegadas equivalem a %.2f centimetros.", polegadas, (polegadas * FATOR));

    }

}
