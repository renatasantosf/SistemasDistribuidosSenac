package Ex3;

public class Vetor {
	
	public int[] vet = new int[200];
	
	public Vetor() {
		for(int i=0;i<200;i++) {
			vet[i] = (int) Math.random();
		}
	}
	
	public int[] getVet() {
		return vet;
	}

}
