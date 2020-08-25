package fatura;

public class Fatura {

    public String cod;
    public String desc;
    public int qtd;
    public double preco;
    public double total;

    public Fatura(String cod, String desc, Integer qtd, Double preco) {
        this.cod = cod;
        this.desc = desc;
        this.qtd = qtd;
        this.preco = preco;
    }

    public static Double totalFaturado(Integer qtd, Double preco) {
        return qtd * preco;
    }

    public static void main(String[] args) {
        String cod = args[0];
        String desc = args[1];
        int qtd = Integer.parseInt(args[2]);
        double preco = Double.parseDouble(args[3]);

        Fatura f1 = new Fatura(cod, desc, qtd, preco);
        System.out.println("Codigo: " + f1.cod);
        System.out.println("Descricao: " + f1.desc);
        System.out.println("Total: R$ " + totalFaturado(f1.qtd, f1.preco));
    }
}
