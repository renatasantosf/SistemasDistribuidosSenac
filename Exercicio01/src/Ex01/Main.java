package Ex01;

public class Main {

	public static void main(String[] args) {
		
		NumeroCrescente cresc = new NumeroCrescente();
        new Thread(cresc).start();
        
        
        NumeroDecrescente desc = new NumeroDecrescente();
        new Thread(desc).start();

	}

}
