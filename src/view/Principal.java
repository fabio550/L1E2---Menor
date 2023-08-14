package view;

import controller.MenorValorController;

public class Principal {
    public static void main(String[] args) {
        MenorValorController mvc = new MenorValorController();

        int[] vet = {3,4,1,10,2};

        int res = mvc.CalcMenorValor(vet, 5, 4 );

        System.out.println(res);
    }
}
