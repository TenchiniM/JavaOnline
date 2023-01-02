package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Estudante;
import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Arnaldo";
        professor.cpf = 18031442703F;
        professor.rg = 123456789F;
        professor.matricula = 123456789;

        System.out.println("Nome: " + professor.nome);

        System.out.println("Cpf: " + professor.cpf);

        System.out.println("RG: " + professor.rg);

        System.out.println("Matricula: " + professor.matricula);


    }
}
