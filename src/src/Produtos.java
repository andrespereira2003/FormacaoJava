public class Produtos {
    private String nome;
    private double preco;
    private Categoria categoria;
    private int stock;

    public Produtos(String nome, double preco, Categoria categoria, int stock) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.stock = stock;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void gastastock() {
        this.stock -= 1;
    }

    public int getStock() {
        return stock;
    }
}
