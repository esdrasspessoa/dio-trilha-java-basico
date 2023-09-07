import java.util.Scanner;

public class ContaTerminal {
    
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaTerminal(int numeroConta, String agencia, String nomeCliente, double saldo){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void exibirInformacoes() {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numeroConta + " e seu é R$" + saldo );
        System.out.println("Já está disponível para saque.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo(a) ao nosso banco!");
        System.out.println("Por favor, digite os dados da conta bancária");

        System.out.print("Número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Número da Conta: ");
        int numeroConta = Integer.parseInt(scanner.nextLine());

        System.out.print("Nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Saldo: R$");
        double saldo = Double.parseDouble(scanner.nextLine());

        scanner.close();

        ContaTerminal conta = new ContaTerminal(numeroConta, agencia, nomeCliente, saldo);
        conta.exibirInformacoes();
    }
}
