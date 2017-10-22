package Ex02;

public class Thread01 implements Runnable{

    @Override
    public void run() {
    	System.out.print("\nThread 01: responsável por imprimir ");
        for(int i=1; i<=100; i+=4){
        	
            System.out.print(" "+i+",");
        }
    }
}
