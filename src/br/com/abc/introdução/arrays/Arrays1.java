package br.com.abc.introdução.arrays;

import javax.swing.*;

public class Arrays1 {
    public static void main(String[] args) {
        //sintaxe para se criar um array
        //arrays sao considerados objetos
        //"new" se usa para objetos
        int[] idades = new int[3];
        idades[0] = 20;
        idades[1] = 30;
        idades[2] = 23;
        JOptionPane.showMessageDialog(null, idades[0]);
    }
}
