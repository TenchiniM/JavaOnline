package br.com.abc.introdução.controleDeFluxo;

public class ControleDeFluxo4 {
    public static void main(String[] args) {
        //comando break
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
               break;
            }
                System.out.println("parcelas: " + parcela + " R$ " + valorParcela);


        }
    }
}
