import java.util.Scanner;

public class ContaTermial {
    public static void main(String[] args)  {

        //ToDo: conhecer é importar a classe Scanner 
        Scanner entrada = new Scanner(System.in);
        int num = 0 ;
        String agencia = "",nomeCliente = "";
        float saldo = 0.0f ;
        //Exibir as msgs para o usuário
        //Obter pelo Scanner digitados pelo terminal

        System.out.print("Digite seu nome : ");
        nomeCliente = entrada.nextLine();
        System.out.print("Digite o número da sua conta :  ");
        num = entrada.nextInt();
        entrada.nextLine(); // Limpa o buffer para evitar erro
        System.out.print("Digite a sua agencia : ");
        agencia = entrada.nextLine();
         System.out.print("Digite o valor valor do seu saldo : ");
        saldo = entrada.nextFloat();
        // Exibir a msg da conta criada
        System.out.printf("\"Olá %s, obrigado por criar uma conta em nosso banco," +
        "sua agência é %s, conta %d e seu saldo %f já está disponível para saque.\n ", nomeCliente,agencia,num,saldo);
    }
}
