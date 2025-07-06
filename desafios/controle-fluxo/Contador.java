import java.util.Scanner;

public class Contador {

    // Classe de exceção personalizada (não verificada)
    static class ParametrosInvalidosException extends RuntimeException {
        public ParametrosInvalidosException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        } finally {
            terminal.close(); // Fechar o scanner
        }
    }
    
    static void contar(int parametroUm, int parametroDois) {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("Parâmetros inválidos");
        }
        
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}