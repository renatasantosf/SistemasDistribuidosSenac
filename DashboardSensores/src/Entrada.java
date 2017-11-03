import java.util.Scanner;


public class Entrada extends Thread {
	
	Scanner ler;
	private int[] sensores = new int[6]; 
	
	@Override
    public void run(){
		ler = new Scanner(System.in);
	
		for(int i=0;i<6;i++) {
			System.out.println("Sensor"+(i+1)+":");
			this.sensores[i] = ler.nextInt();
						
		}
		
		
	}
	
	
	public int[] getSensores() {
		return sensores;
	}

	public void setSensores(int[] sensores) {
		this.sensores = sensores;
	}
	
}
