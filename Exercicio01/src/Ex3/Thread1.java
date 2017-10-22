package Ex3;

import java.util.Scanner;

public class Thread1 implements Runnable{

    @Override
    public void run() {
    	 Scanner ler = new Scanner(System.in);
    	 System.out.println("Busca 1: Digite o valor que você deseja: ");
    	 int busca = ler.nextInt();
    	 Vetor vetor = new Vetor();
    	 int cont=0;
    	 while(cont<=99 && vetor.vet[cont]!=busca) {
    		 cont++;
    		 System.out.println(-1);
    		
    	 }
    	 
    	
    	 
    	
            
        
     }
  


}
