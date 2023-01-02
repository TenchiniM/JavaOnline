package br.com.abc.introdução.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        // dois modos de criar arrays
        int[] numeros = {1, 2, 3, 4, 5, 6}; // tamanho é 6, porém o indice so vai ate 5. o 0 também conta
        int[] numeros2 = new int[6];
        int[] numeros3 = new int[]{1, 2, 3, 4, 5, 6};

//        for (int i = 0; i<10;i++){
//
//        }
        // pega todas as posições do numeros2 e joga dentro de aux
        for (int aux : numeros) {
            System.out.println(aux);
        }
    }
}
