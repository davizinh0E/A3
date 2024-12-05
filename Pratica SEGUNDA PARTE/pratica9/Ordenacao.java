package pratica9;

class Ordenacao {

    private static void inverteComProximo(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }

    // Bubblesort
    public static int[] bolha(int[] arr) {
        for (int n = 1; n < arr.length; n++) {
            // Vamos encontrar o enesimo maior numero, e leva-lo ate a enesima posicao, de
            // tras pra frente
            // Por exemplo se n = 0, vamos achar o maior numero do array, e levalo para a
            // ultima posicao
            // Se n = 1, vamos achar o segundo maior numero, e levalo para penultima posicao
            for (int j = 0; j < (arr.length - n); j++) {
                if (arr[j] > arr[j + 1]) {
                    inverteComProximo(arr, j);
                }
            }
        }
        return arr;
    }

    // Selectsort
    public static int[] selecao(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int indiceMenorNumero = i;

            for (int indiceDoCandidato = i + 1; indiceDoCandidato < arr.length; indiceDoCandidato++) {
                if (arr[indiceDoCandidato] < arr[indiceMenorNumero]) {
                    indiceMenorNumero = indiceDoCandidato;
                }
            }

            int temp = arr[indiceMenorNumero];
            arr[indiceMenorNumero] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // Insertsort
    public static int[] insercao(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
