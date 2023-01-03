package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "12345679";
        prof.rg = "10859740357";
        prof.nome = "Armando";
        prof.matricula = "5556789";

        Professor prof2 = new Professor();
        prof2.cpf = "12412151235";
        prof2.rg = "555555555";
        prof2.nome = "Julia";
        prof2.matricula = "5556789";


//        System.out.println(prof.cpf);
//        System.out.println(prof.nome);
//        System.out.println(prof.matricula);
//        System.out.println(prof.rg);

        prof.imprime(prof);
        prof.imprime(prof2);
    }
}
