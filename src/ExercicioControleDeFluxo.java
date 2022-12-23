import javax.swing.*;

public class ExercicioControleDeFluxo {
    public static void main(String[] args) {
        double salario, imposto, salariofinal;
        salario = 2000;
        imposto = 0;

        if (salario < 1000) {
            imposto = (5 * salario /100 );
        } else {
            if (salario >= 1000  && salario < 2000){
                imposto = (10 * salario /100 );
            }
            if (salario >= 2000 && salario < 4000) {
                imposto = (15 * salario /100 );
            }
            if (salario >= 5000) {
                imposto = (20 * salario /100 );
            }
            salariofinal = salario - imposto;

            JOptionPane.showMessageDialog(null, salariofinal);
        }
    }
}
