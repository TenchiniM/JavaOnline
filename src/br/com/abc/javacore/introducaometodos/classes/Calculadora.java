package br.com.abc.javacore.introducaometodos.classes;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(5 - 5);
    }

    public void multiplicaDoisNumeros(int num1, int num2) { // metodo recebendo uma variavel local
        System.out.println(num1 * num2);

    }

    public double divideDoisNumeros(double num1, double num2) {
        // double resultado = num1 / num2; // um jeito de retorno
        // return resultado;
        // System.out.println(num1/num2); metodos com retorno vc imprime na classe onde ele é chamado
        //return num1 / num2; // outro jeito de retorno
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Não foi possivel dividir esse valor");
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 30;
        num2 = 20;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}

