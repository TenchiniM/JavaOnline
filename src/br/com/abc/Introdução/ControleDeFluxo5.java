package br.com.abc.Introdução;

public class ControleDeFluxo5 {
    public static void main(String[] args) {
        // comando continue
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                continue; //ignora qualquer coisa que estiver abaixo no IF para preservar memoria
            }
            System.out.println("parcelas: " + parcela + " R$ " + valorParcela);
        }
    }
}
