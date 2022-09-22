package atividades;

public class CalculoCombustivel {

    public static void main(String[] args) {

        final double KM_POR_LITRO = 12;
        double velocidade = 60;

        double tempo = 3;
        double distancia = tempo * velocidade;
        double litrosUsados = distancia / KM_POR_LITRO;

        System.out.printf("A velocidade média da viagem foi de %.0f Km/hora, " +
                "durou %.0f horas, com uma distancia de %.2f km e utilizando %.2f litros " +
                "de gasolina", velocidade, tempo, distancia, litrosUsados);

    }

}
