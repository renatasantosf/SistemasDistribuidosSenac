package Ex01;


public class NumeroDecrescente implements Runnable{

    @Override
    public void run() {
    	System.out.println("Decrescente:");
        for(int i=500; i>0; i--){
        	 
        	 
        	  System.out.println(i);
        }
    }
}
