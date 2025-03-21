import java.util.Locale;
import java.util.Scanner;



public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        System.out.println("Digite o numero da sua conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a agência do seu Banco: ");
        String agenciaConta = scanner.nextLine();

        System.out.println("Digite o nome de usuario: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Saldo inicial: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta numero " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque." );

    }
}