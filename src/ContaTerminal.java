import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, informe o número da sua conta: ");
        int conta = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, informe o número da sua Agência: ");
        String agencia = sc.nextLine();

        System.out.println("Informe o seu nome completo: ");
        String nome = sc.nextLine(); 

        System.out.println("Por favor, informe o seu saldo inicial (use vírgula para centavos): ");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                            + ", conta " + conta + ", e o seu saldo " + saldo +
                            " já está disponível para saque.");

        sc.close();
    }
}