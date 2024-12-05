package loja;

public class Produto {
    private static int ultimoId = 0;
    private String nome;
    private int id;
    private double preco;

    public Produto() {
        this.id = ++ultimoId;
        this.nome = "Não Informado";
        this.preco = 0;
    }

    public Produto(String nome, double preco) {
        this();
        this.nome = nome;
        setPreco(preco);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else
            this.preco = 0;
    }

    public void reajustaPreco(double percentual) {
        this.preco = this.preco * (1 + (percentual / 100));
    }

    public void exibe() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Id: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
    }
}
