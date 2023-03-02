import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;

public class Compras {
    public static int selecionarproduto(LinkedList<Produtos> listaprodutos) {
        System.out.println("Selecione o produto: ");
        int i = 1;
        for (Produtos produto : listaprodutos) {
            System.out.println(i + ") " + produto.getNome() + " " + produto.getPreco() + "€");
            i++;
        }
        int escolha = FuncoesLeitura.lerInteiro(1, listaprodutos.size());

        return escolha;
    }

    public static void comprarproduto(int escolha, LinkedList<Produtos> listaprodutos) {
        float valor;
        double valorfinal = 0;
        DecimalFormat formatador = new DecimalFormat("0.00");
        ArrayList<Float> valorMoedas= new ArrayList<Float>();

        valorMoedas.add(0.05f);
        valorMoedas.add(0.10f);
        valorMoedas.add(0.20f);
        valorMoedas.add(0.50f);

        Produtos produtoescolhido = listaprodutos.get(escolha - 1);
        System.out.println("Inserir " + produtoescolhido.getPreco() + "€");

        System.out.println("Insira dinheiro");
        do {
            do {
                valor = FuncoesLeitura.lerFloat((float) 0.05, (float) 0.5);

                if (!valorMoedas.contains(valor)) {
                    System.out.println("Colocar moedas de 5, 10, 20 ou 50 centimos");
                    System.out.println("*Som das moedas a serem devolvidas*");

                } else {
                    valorfinal = (produtoescolhido.getPreco() - valor);
                    valorfinal = Math.round(valorfinal * 100.0) / 100.0;

                    if (valorfinal < 0) {
                        valorfinal *= -1;
                        System.out.println("*Máquina devolve " + valorfinal);
                        valorfinal = 0;

                    } else {
                        System.out.println("Faltam " + formatador.format(valorfinal) + "€");
                    }
                }
            }
            while (valorMoedas.contains(valor));
        }
        while (valorfinal != 0);

    }
}

