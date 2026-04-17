package TreinandoArraysMultidimensionais;

public class Exercicio03 {
    public static void main(String[] args) {
        int[][] matriz = new int[2][2];

        matriz[0][0] = 10;
        matriz[0][1] = 20;

        matriz[1][0] = 30;
        matriz[1][1] = 40;

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }

    }
}
