package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Estudante;
import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Arnaldo";
        professor.cpf = "18031442703";
        professor.rg = "123456789";
        professor.matricula = "123456789";

        System.out.println("Nome: " + professor.nome);
        System.out.println("Cpf: " + professor.cpf);
        System.out.println("RG: " + professor.rg);
        System.out.println("Matricula: " + professor.matricula);
        System.out.println("-----------------");

        Professor professor2 = new Professor();
        professor2.matricula = "879875465462";
        professor2.cpf = "456333215";
        professor2.nome = "Jilçon";
        professor2.rg = "555-99945-789";

        System.out.println("Nome: " + professor2.nome);
        System.out.println("Cpf: " + professor2.cpf);
        System.out.println("RG: " + professor2.rg);
        System.out.println("Matricula: " + professor2.matricula);


    }
}
