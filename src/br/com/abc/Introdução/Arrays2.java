package br.com.abc.Introdução;

import javax.swing.*;

public class Arrays2 {
    public static void main(String[] args) {
        // o valor padrão do array para int,byte, short , long, float e double é : 0
        // para char é um valor vazio
        // para boolean é false
        // para reference é null
        // nome do array.lenght - retorna o tamanho do array
        String[] nomes = new String[5];
        nomes[0] = "Luffy";
        nomes[1] = "Maycon";
        nomes[2] = "Fred";
        nomes[3] = "Zoro";
        nomes[4] = "Usoup";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
            continue;
        }
        JOptionPane.showMessageDialog(null, nomes[0] + "\n" + nomes[1] + "\n" + nomes[2] + "\n" + nomes[3] + "\n" + nomes[4]);
        nomes = new String[10]; // referenciando novamente o array fazendo ele ter 10 valores

    }
}
