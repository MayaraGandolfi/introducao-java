package quarta.aula;


public class Matriz {

    public static void main(String[] args) {
      //  int[][] matriz = new int[3][3];

        System.out.println("Ola selecione a posição: \n");

        String[][] matrizNome = new String[3][3];

        int posicao = 0;
        String frase ;

        int a = 2;
        int b = 5;
        if(a<b){
            System.out.println("a é menor que b");
        }



        for (int i = 0; i < matrizNome.length; i++) {
            for (int j = 0; j < matrizNome[i].length; j++) {
                posicao++;
                if (posicao == 1) {
                    matrizNome[i][j] = "1";
                } else if (posicao == 2) {
                    matrizNome[i][j] = "2";
                } else if (posicao == 3) {
                    matrizNome[i][j] = "3";
                } else if (posicao == 4) {
                    matrizNome[i][j] = "4";
                } else if (posicao == 5) {
                    matrizNome[i][j] = "5";
                } else if (posicao == 6) {
                    matrizNome[i][j] = "6";
                } else if (posicao == 7) {
                    matrizNome[i][j] = "7";
                } else if (posicao == 8) {
                    matrizNome[i][j] = "8";
                } else if (posicao == 9) {
                    matrizNome[i][j] = "9";
                }
                System.out.print(matrizNome[i][j]);
                if (j < 2) {
                    System.out.print("  |  ");
                }

            }
            if (i < 2) {
                System.out.println("\n--------------");
            }
        }

//        String jogada = "";
//        if (posicao == 9) {
//            matrizNome[3][3] = "X";
//        }
        System.out.println("\n");

        //mostrar na tela
        for (int i = 0; i < matrizNome.length; i++) {
            for (int j = 0; j < matrizNome[i].length; j++) {
                System.out.print(matrizNome[i][j]);
                if (j < 2) {
                    System.out.print("  |  ");
                }
            }
            if (i < 2) {
                System.out.println("\n--------------");
            }
        }


    }
}
