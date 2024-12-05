package pratica10;

import java.util.Arrays;

public class Ordenacao {

    public static void orderna(int[] arr) {
        ordenaTrecho(arr, 0, arr.length - 1);
    }

    /*
     * [2, 3, 1, 5]
     * ordenaTrecho 0 3
     * - ordenaTrecho 0 1
     * - ordenaTrecho 0 0
     * - ordenaTrecho 1 1
     * 
     * - ordenaTrecho 2 3
     * - ordenaTrecho 2 2
     * - ordenaTrecho 3 3
     * 
     * juntaDuasMetades
     * 
     * 
     * 
     * mergeSort {
     * if array so tem um elemento
     * return array
     * mergeSort(primeraMetade)
     * mergeSort(segundaMetade)
     * merge(primeiraMetade, segundaMetade)
     * }
     */

    private static void ordenaTrecho(int[] arr, int inicioOrdenacao, int fimDaOrdenacao) {

        if (inicioOrdenacao == fimDaOrdenacao) {
            return;
        }

        int meio = (inicioOrdenacao + fimDaOrdenacao) / 2;

        ordenaTrecho(arr, inicioOrdenacao, meio);
        ordenaTrecho(arr, meio + 1, fimDaOrdenacao);

        int[] merged = new int[fimDaOrdenacao - inicioOrdenacao + 1];

        int indicePrimeiroArray = inicioOrdenacao;
        int indiceSegundoArray = meio + 1;

        int posicaoOrdenado = 0;
        while (posicaoOrdenado < merged.length) {

            boolean segundoArrayAcabou = indiceSegundoArray > fimDaOrdenacao;

            if (segundoArrayAcabou
                    || (indicePrimeiroArray <= meio && arr[indicePrimeiroArray] < arr[indiceSegundoArray])) {
                merged[posicaoOrdenado] = arr[indicePrimeiroArray];
                indicePrimeiroArray++;
            } else {
                merged[posicaoOrdenado] = arr[indiceSegundoArray];
                indiceSegundoArray++;
            }
            posicaoOrdenado++;
        }

        for (int i = 0; i < merged.length; i++) {
            arr[inicioOrdenacao + i] = merged[i];
        }
    }

    public static void main(String[] args) {

        int[] teste = new int[] { 544, 52, 43, 5, 3, 35, 5, 67, 7, 544, 52, 43, 5, 3, 35, 5, 67, 7, 544, 52, 43, 5, 3,
                35, 5, 67, 7, 544, 52, 43, 5, 3, 35, 5, 67, 7, 544, 52, 43, 5, 3, 35, 5, 67, 7, 544, 52, 43, 5, 3, 35,
                5, 67, 7 };

        Ordenacao.orderna(teste);

        System.out.println(Arrays.toString(teste));
    }
}
