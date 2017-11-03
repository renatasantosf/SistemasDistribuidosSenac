
public class Tela {
	
	public static void main(String ...args) throws InterruptedException {
		
		Entrada e1 = new Entrada();
		e1.start();
		
		e1.join();
		
		Dash d1 = new Dash();
		
		d1.start();
		
		
	}
	

}
