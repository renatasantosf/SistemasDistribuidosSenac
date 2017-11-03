import java.util.Scanner;

public class Saida extends Thread{
	
	
	Scanner ler = new Scanner(System.in);
	
	@Override
	public synchronized void run()  {
		
		int indice, escolha = 0;
		Entrada entrada = new Entrada(); 
		
		while(escolha!=2) {
			System.out.println("Digite as opções:\n1-Incluir Novo\n2- Sair");
			escolha = ler.nextInt();
			switch(escolha){
			case 1: 
				System.out.println("Qual sensor você deseja preencher? 0 - 5");
				indice = ler.nextInt();
				System.out.println("Preencha o Sensor "+indice);
				entrada.getSensores().add(indice, ler.nextInt());
				
				
				for(int i=0;i<6;i++) {
					System.out.println(entrada.getSensores().get(i));
				}
				
				break;
			case 2:
				System.exit(2);
				break;
			default:
				System.out.println("Opção inválida");
			}
		}
		
		
	
		
		
	}
	

}
