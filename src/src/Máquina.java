import java.util.LinkedList;

public class Máquina {
    private float Valoracumulado;

    private LinkedList<Produtos> listaprodutos;

    public Máquina(float valoracumulado, LinkedList<Produtos> listaprodutos) {
        Valoracumulado = valoracumulado;
        this.listaprodutos = listaprodutos;
    }

    public float getValoracumulado() {
        return Valoracumulado;
    }

    public LinkedList<Produtos> getListaprodutos() {
        return listaprodutos;
    }

    public void setValoracumulado(float valoracumulado) {
        Valoracumulado += valoracumulado;
    }

    public void resetmaquina(){
        this.Valoracumulado = 0;
    }
}
