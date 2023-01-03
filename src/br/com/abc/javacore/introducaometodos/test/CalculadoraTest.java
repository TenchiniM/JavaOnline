package br.com.abc.javacore.introducaometodos.test;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Somando Dois Numeros");
        calc.somaDoisNumeros();
        System.out.println("Subtrai dois numeros");
        calc.subtraiDoisNumeros();
        System.out.println("Multiplica dois numeros");
        calc.multiplicaDoisNumeros(10, 20);
        System.out.println("Divide dois numeros");
        System.out.println(calc.divideDoisNumeros(20, 0));
        System.out.println("Imprime dois numeros divididos");
        calc.imprimeDoisNumerosDivididos(20,5);
        System.out.println("Continuando a execução");
    }

}
