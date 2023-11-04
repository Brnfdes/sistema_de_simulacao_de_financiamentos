package util;
import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner entrada = new Scanner(System.in);

    public double lerValorImovel() {
        double valorImovel;
        do {
            System.out.print("Qual o valor do imovel? ");
            valorImovel = entrada.nextDouble();
            if (valorImovel <= 0) {
                System.out.println("O valor do imovel deve ser positivo. Tente novamente.");
            }
        } while (valorImovel <= 0);
        return valorImovel;
    }

    public int lerPrazo() {
        int prazo;
        do {
            System.out.print("Qual o prazo do financiamento (em meses)? ");
            prazo = entrada.nextInt();
            if (prazo <= 0) {
                System.out.println("O prazo do financiamento deve ser positivo. Tente novamente.");
            }
        } while (prazo <= 0);
        return prazo;
    }

    public double lerTaxa() {
        double taxa;
        do {
            System.out.print("Qual a taxa de juros anual? ");
            taxa = entrada.nextDouble();
            if (taxa <= 0 || taxa > 100) {
                System.out.println("A taxa de juros anual deve ser positiva e menor ou igual a 100%. Tente novamente.");
            }
        } while (taxa <= 0 || taxa > 100);
        return taxa;
    }

    public void fecharScanner() {
        entrada.close();
    }
}
