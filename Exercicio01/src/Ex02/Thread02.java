package Ex02;

public class Thread02 implements Runnable{

    @Override
    public void run() {
    	System.out.print("\nThread 02: responsável por imprimir ");
        for(int i=2; i<=100; i+=4){
               
            System.out.print(" "+i+",");
            
        }
     }
}
