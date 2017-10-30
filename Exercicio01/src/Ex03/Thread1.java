package Ex03;

import java.util.Scanner;

public class Thread1 implements Runnable{
	
	private int[] vetor = new int[200];

    @Override
    public void run() {
    	
    	for(int i=0;i<200;i++) {
    		vetor[i] = (int) Math.random();
    	}
    	
    	
    	 Scanner ler = new Scanner(System.in);
    	 System.out.println("Busca 1: Digite o valor que voce deseja: ");
    	 int busca = ler.nextInt();
    	
    	 
    	for(int i=0;i<100 && vetor[i]!=busca;i++) {
    		System.out.println(-1);
    	}
    	 
    	
    	ler.close();
    	 
    	
            
        
     }
  


}
