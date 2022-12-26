import javax.swing.*;

public class ControleFluxo2 {
    public static void main(String[] args) {
        byte dia = 7;
        char sexo = 'A';
        dia = Byte.parseByte(JOptionPane.showInputDialog("Qual dia você quer saber?"));

        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, "Domingo (NÃO é dia útil)");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Segunda");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Terça");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Quarta");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Quinta");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sexta");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Sabado (NÃO é dia útil)");
                break;
        }
        // switch (sexo) {
        //case 'F':
        //JOptionPane.showMessageDialog(null, "Feminino");
        //  break;
        //case 'M':
        //JOptionPane.showMessageDialog(null, "Masculino");
        //default:
        //  JOptionPane.showMessageDialog(null, "Invalido");
    }
}
}
