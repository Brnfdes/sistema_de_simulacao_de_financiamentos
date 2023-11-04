package modelo;
import java.text.DecimalFormat;

public class Financiamento {
    // Atributos privados
    private double valorImovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;
    private double pagamentoMensal;
    private double pagamentoTotal;
    private DecimalFormat decimalFormat = new DecimalFormat("0.00");

    // Construtor
    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
        pagamentoMensal();
        pagamentoTotal();
    }

    //calculo do pagamento mensal e total
    public double pagamentoMensal() {
        pagamentoMensal = (valorImovel / prazoFinanciamento) * (1 + ((taxaJurosAnual/100) / 12));
        return pagamentoMensal;
    }
    public double pagamentoTotal() {
        pagamentoTotal = pagamentoMensal * prazoFinanciamento;
        return pagamentoTotal;
    }
    
    // Getters para os atributos privados
    public double getValorImovel() {
        return valorImovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public double getPagamentoMensal() {
        return pagamentoMensal;
    }

    public double getPagamentoTotal() {
        return pagamentoTotal;
    }

    public void exibirInfo() {
        System.out.println("Valor do imóvel: R$" + decimalFormat.format(valorImovel));
        System.out.println("Prazo do financiamento: " + prazoFinanciamento + " meses");
        System.out.println("Taxa de juros anual: " + decimalFormat.format(taxaJurosAnual) + "%");
        System.out.println("Valor mensal do financiamento: R$ " + decimalFormat.format(pagamentoMensal));
        System.out.println("Valor total do financiamento: R$ " + decimalFormat.format(pagamentoTotal));
    }
}
