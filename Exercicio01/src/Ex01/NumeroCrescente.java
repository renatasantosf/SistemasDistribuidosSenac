package Ex01;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NumeroCrescente implements Runnable{

	    @Override
	    public void run() {
	    	System.out.println("Crescente:");
	        for(int i=1; i<=500; i++){
	            System.out.println(i);
	            
	          
	        }
	    }
}
