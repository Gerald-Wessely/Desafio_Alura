import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao programa Bancario ");
        System.out.printf("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.printf("Tipo de Conta ");
        String tipoConta = sc.nextLine();
        Double saldo = 2500.0;
        System.out.println("######################");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        String Menu = """    
                
                     *Escolha uma Opção*
                1 - Consultar saldo em conta
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair """;
        int opcao = 0;
        while (opcao != 4) {
            System.out.println(Menu);
            opcao = sc.nextInt();
            if (opcao == 1) {
                System.out.printf("Seu saldo em conta é " + " \n " + " R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual valor você deseja Transferir? ");
                Double valor = sc.nextDouble();
                if (valor >= saldo) {
                    System.out.println("Valor insuficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Valor realizado com sucesso " + " \n " + "Seu Saldo é R$" + saldo);
                }
            }else if (opcao == 3) {
                    System.out.println("Você recebeu um valor de R$ ");
                   double valoR = sc.nextDouble();
                   saldo += valoR;
                    System.out.println("Seu Saldo é " + saldo );

                } else if (opcao != 4) {
                    System.out.println("Opção invalida");

                }
            }


        }
    }

