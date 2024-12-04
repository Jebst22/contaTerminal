import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
    /
        // Criação do objeto Scanner para leitura dos dados via terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitando e recebendo os dados do usuário
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        scanner.nextLine(); // Limpa o buffer após a leitura do número inteiro

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem formatada com os dados fornecidos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

   
        scanner.close();

    }

}
