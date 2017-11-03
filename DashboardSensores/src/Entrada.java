import java.util.ArrayList;
import java.util.Scanner;


public class Entrada extends Thread {
	
	Scanner ler;
	private ArrayList<Integer> sensores = new ArrayList<Integer>();
	
	
	public Entrada() {
		for(int i=0;i<6;i++) {
			sensores.add(0);
		}
	}
	
	@Override
    public void run(){
			for(int i=0;i<6;i++) {
				System.out.println("Sensor "+(i+1)+":"+sensores.get(i));
		}
		
	}

	public ArrayList<Integer> getSensores() {
		return sensores;
	}

	public void setSensores(ArrayList<Integer> sensores) {
		this.sensores = sensores;
	}
	
	
	
	
}
