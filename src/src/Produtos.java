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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
