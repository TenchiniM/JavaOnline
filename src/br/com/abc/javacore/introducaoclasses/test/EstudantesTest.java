package br.com.abc.javacore.introducaoclasses.test; // colocar o metodo main dentro dos pacotestest e todas as classes devem ter test

import br.com.abc.javacore.introducaoclasses.classes.Estudante; // importando a classe de outro pacote

public class EstudantesTest {
    public static void main(String[] args) {
        Estudante joao = new Estudante(); // variavel de referencia fazendo referencia a um objeto
        joao.nome = "Joao";
        joao.matricula = 1212;
        joao.idade = 19;

        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);


    }
}
