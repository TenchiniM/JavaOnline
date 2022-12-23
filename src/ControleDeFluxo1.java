public class ControleDeFluxo1 {
    public static void main(String[] args) {
        double carros = 67;
        carros = carros + 67 + (int) (carros * 0.1) ;

        if (carros == 67 ){
            System.out.println("Certo");
        }else {
            System.out.println("errado");
        }

    }
}
