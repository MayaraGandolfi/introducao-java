package atividades;

public class CalculoCombustivel {

    public static void main(String[] args) {

        final double KM_POR_LITRO = 12;
        int velocidade = 70;
        int tempo = 3;
        int distancia = tempo * velocidade;
        double litros = distancia / KM_POR_LITRO;

        System.out.printf("A velocidade média da viagem foi de %d Km/hora, " +
                "durou %d horas, com uma distancia de %d km e utilizando %.2f litros " +
                "de gasolina.", velocidade, tempo, distancia, litros);

    }

}
