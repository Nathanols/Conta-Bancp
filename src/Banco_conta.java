
import java.util.Scanner;

public class Banco_conta {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nomeCliente;
		String tipoConta;
		float saldo=0, recebido=0, transferido=0;
		int opcao=0;
		
		System.out.println("Digite o nome do cliente");
		nomeCliente = ler.nextLine();
		
		System.out.println("Digite o tipo da conta");
		tipoConta = ler.nextLine();
		
		while(opcao != 4) {
		System.out.println("***********************************");
		System.out.println("Dados iniciais odo cliente:");
		System.out.println();
		System.out.println("Nome: " + nomeCliente);
		System.out.println("Tipo conta: " + tipoConta);
		System.out.println("Saldo inicial: " + saldo);
		System.out.println("***********************************");
		System.out.println();
		
		System.out.println("OPERAÇÔES");
		System.out.println();
		
		
		System.out.println("1- Consultar saldo");
		System.out.println("2- Receber saldo");
		System.out.println("3- Transferir valor");
		System.out.println("4- Sair");
		
		System.out.println();
		System.out.println("Digite a opcao desejada:");
		opcao = ler.nextInt();
		
		if(opcao==1) {
			System.out.println("Seu saldo atualizado é " + saldo);
		}else if(opcao==2) {
			System.out.println("Digite o Valor que vai receber");
			recebido = ler.nextFloat();
			saldo = saldo + recebido;
			System.out.println("Novo saldo " + saldo);
		}else if(opcao==3){
			System.out.println("Digite o Valor que vai transferir");
			transferido = ler.nextFloat();
			if(transferido > saldo) {
				System.out.println("Saldo insuficiente");
			}else {
				saldo = saldo - transferido;
				System.out.println("Novo saldo " + saldo);
			}
		}else if (opcao<=0 || opcao>4) {
			System.out.println("Opcao inválida");
		}else {
			return;
		}
		}
		
	}

}