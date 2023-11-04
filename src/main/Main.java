package main;
import java.util.ArrayList;
import modelo.Financiamento;
import util.InterfaceUsuario;

public class Main {
    
        public static void main(String[] args) {

        ArrayList<Financiamento> financiamentos = new ArrayList<>();
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        System.out.println("Bem vindo ao sistema de simulacao de financiamento!");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < 4; i++) {
            double vImovel;
            int prazo;
            double taxa;

            vImovel = interfaceUsuario.lerValorImovel();
            prazo = interfaceUsuario.lerPrazo();
            taxa = interfaceUsuario.lerTaxa();

            Financiamento financiamento = new Financiamento(vImovel, prazo, taxa);
            financiamentos.add(financiamento);

            System.out.println("---------------------------------------------------");
            System.out.println("Resumo do financiamento " + (i + 1));
            System.out.println("---------------------------------------------------");
            financiamento.exibirInfo();
            System.out.println("---------------------------------------------------");
        }

        double valorTotalImoveis = financiamentos.stream().mapToDouble(Financiamento::getValorImovel).sum();
        double valorTotalFinanciamentos = financiamentos.stream().mapToDouble(Financiamento::getPagamentoTotal).sum();

        System.out.println("Valor total de todos os imóveis: R$" + valorTotalImoveis);
        System.out.println("Valor total de todos os financiamentos: R$" + valorTotalFinanciamentos);

        interfaceUsuario.fecharScanner();
    }
}
