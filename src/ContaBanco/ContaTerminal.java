package ContaBanco;
import java.util.Scanner;

public class ContaTerminal {
     
     public static void main(String[] args) throws Exception {
         
         double saldoCliente = 237.4;
         
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Por favor, insira seu nome: ");
         String nomeCliente = scanner.nextLine();
         
         System.out.println("Por favor, insira sua conta: ");
         int contaCliente = scanner.nextInt();
         
         scanner.nextLine(); 
         
         System.out.println("Por favor, insira sua agencia: ");
         String agenciaCliente = scanner.nextLine();
         
         System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agenciaCliente
                + " e conta " + contaCliente + ". Seu saldo de " + saldoCliente + " já está disponível para saque.");
         scanner.close();
     }


	       
	       
	   
	       
	       
	       
	        
	      

	}
 