package controller;

public class MenorValorController {

    public MenorValorController() {
        super();
    }

    public int CalcMenorValor(int[] vetor, int tamanho, int ultimaPosicao) {

        if (tamanho > 0) {
            //condição de parada: quando o tamanho do vetor for 1 não há dois vetores para comparar
            int menor = vetor[ultimaPosicao];

            if (vetor[ultimaPosicao] > vetor[ultimaPosicao - 1]) {
                // compara sempre ultimo e antepenultimo e reduz o em 1 a posição dos vetores comparados
                menor = vetor[ultimaPosicao - 1];
                CalcMenorValor(vetor, tamanho - 1, ultimaPosicao - 1);
                return menor;
            }
        }
        return 0;
    }
}
