import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu nome completo: ");
        String nome = sc.nextLine(); 

        System.out.println("Por favor, informe o número da Agência: ");
        int agencia = sc.nextInt();

        System.out.println("Por favor, informe o número da sua conta: ");
        int conta = sc.nextInt();

        System.out.println("Por favor, informe o seu saldo: ");
        float saldo = sc.nextFloat();

        System.out.println("O seu nome é " + nome);
        System.out.println("A sua agência é " + agencia);
        System.out.println("O número da sua conta é " + conta);
        System.out.println("O saldo da sua conta é " + saldo);

        sc.close();
    }
}