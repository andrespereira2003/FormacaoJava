import java.util.InputMismatchException;
import java.util.Scanner;

public class FuncoesLeitura {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void fecharScanner() {
        SCANNER.close();
    }

    /**
     * função para ler string
     */

    public static String lerString() {
        String string;
        do {
            string = SCANNER.nextLine();
            if (string.isBlank() || string.matches(".*\\d.*")) {
                System.out.print("Erro. \n\nInsira: ");
            }
        } while (string.isBlank() || string.matches(".*\\d.*"));

        return string.trim();
    }

    /**
     * função para ler números inteiros
     */
    public static int lerInteiro(int min, int max) {
        int num = -1;
        boolean erro;
        do {
            try {
                erro = false;
                if (SCANNER.hasNextInt()) {
                    num = SCANNER.nextInt();
                } else {
                    erro = true;
                    throw new InputMismatchException("Erro. Tem que introduzir um valor válido");
                }
                if(num == 12345){
                    return num;
                }
                if (num < min || num > max) {
                    erro = true;
                    throw new InputMismatchException("Erro. Tem de inserir um valor entre " + min + " e " + max + "\n\nInsira: ");
                }
            } catch (Exception e) {
                erro = true;
                System.out.println(e.getMessage());
            }
            SCANNER.nextLine();
        } while (erro && num < min || num > max);
        return num;
    }
    /**
     * função para ler números do tipo float
     */
    public static float lerFloat(float min, float max) {
        float num = -1;
        boolean erro;
        do {
            try {
                erro = false;
                num = SCANNER.nextFloat();
                if (num < min || num > max) {
                    throw new InputMismatchException();
                }
            } catch (Exception e) {
                erro = true;
                System.out.print("Erro. Tem de inserir um valor entre " + min + " e " + max + "\n\nInsira: ");
                SCANNER.nextLine();
            }
        } while (erro && num < min || num > max);
        return num;
    }

    /**
     * função para ler números do tipo double
     */
}
