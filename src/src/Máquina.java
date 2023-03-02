import java.util.LinkedList;

public class Máquina {
    private float Valoracumulado;

    private LinkedList<Produtos> listaprodutos;

    public Máquina(float valoracumulado, LinkedList<Produtos> listaprodutos) {
        Valoracumulado = valoracumulado;
        this.listaprodutos = listaprodutos;
    }
}
