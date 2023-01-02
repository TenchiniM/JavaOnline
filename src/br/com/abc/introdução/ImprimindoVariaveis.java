package br.com.abc.introdução;

import javax.swing.*;

public class ImprimindoVariaveis {
    public static void main(String[] args) {
        String nome, endereco,telefone,estadoCivil,salario,sexo,idade, msg;




        nome = JOptionPane.showInputDialog("Digite um nome");
        endereco = JOptionPane.showInputDialog("Digite um Endereço");
        telefone = JOptionPane.showInputDialog("Digite um Telefone" );
        estadoCivil = JOptionPane.showInputDialog("Digi" + "te o Estado Civil" );
        salario = JOptionPane.showInputDialog("Digite o seu Salario" );
        sexo = JOptionPane.showInputDialog("Digite o seu Sexo " );
        idade = JOptionPane.showInputDialog("Digite a sua idade" );

        msg = (" O "
                + nome +
                "\n"
                + " domiciliado no endereco " +
                "\n"
                + endereco +
                "\n"
                +" telefone : " +
                "\n"
                +telefone +
                "\n"
                + "Sexo : " +
                "\n"
                +sexo +
                "\n"
                + "Estado Civil :" +
                "\n"
                + estadoCivil +
                "\n"
                + "De idade : " +
                "\n"
                +idade+
                "\n"
                +"E salário :"+
                "\n"
                +salario+
                "\n"
                +" não possui nenhum tipo de pendencia. ");

        JOptionPane.showMessageDialog(null,msg);

    }
}
