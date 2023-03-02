import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Produtos> listaprodutos = new LinkedList<Produtos>();
        Máquina maquina = new Máquina(0, listaprodutos);

        Produtos produto1 = new Produtos("Cola-cola",0.70, Categoria.BEBIDA, 0);
        listaprodutos.add(produto1);

        Produtos produto2 = new Produtos("Pepsi", 0.65, Categoria.BEBIDA, 1);
        listaprodutos.add(produto2);

        Produtos produto3 = new Produtos("Ice-Tea", 0.60, Categoria.BEBIDA, 8);
        listaprodutos.add(produto3);


        int escolha;

        do {
            escolha = Compras.selecionarproduto(listaprodutos, maquina);

            if (escolha == 12345) {
                System.out.println("Reinicialização confirmada.");
                System.out.println("Valor acumulado: " + maquina.getValoracumulado() + "€");
                maquina.resetmaquina();
                System.out.println("Reset realizado com sucesso.");
                System.out.println("Valor acumulado: " + maquina.getValoracumulado() + "€");
            }

            if (escolha != 0) {
                Compras.comprarproduto(escolha, listaprodutos, maquina);
            }
        }
        while(escolha != 12345 || escolha == 0);

    }
}