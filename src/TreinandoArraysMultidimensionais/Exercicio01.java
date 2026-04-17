package TreinandoArraysMultidimensionais;

public class Exercicio01 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        matriz[0][0] = 21;
        matriz[0][1] = 22;
        matriz[0][2] = 23;
        matriz[0][3] = 24;

        matriz[1][0] = 25;
        matriz[1][1] = 26;
        matriz[1][2] = 27;
        matriz[1][3] = 28;

        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[j][i]);

    }
}
    }
}
