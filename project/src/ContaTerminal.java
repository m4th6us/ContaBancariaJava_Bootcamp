import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        
        int Numero;
        String Agencia;
        String nomeCliente;
        double Saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        Numero = scanner.nextInt();
        
        System.out.println("Por favor, digite sua Agência!");
        Agencia = scanner.next();

        System.out.println("Por favor, digite o seu Nome!");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu Saldo!");
        Saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo R$ " + Saldo + " já está disponível para saque.");

    }
}
