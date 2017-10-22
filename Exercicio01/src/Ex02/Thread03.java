package Ex02;

public class Thread03 implements Runnable{

    @Override
    public void run() {
    	System.out.print("\nThread 03: responsável por imprimir ");
        for(int i=3; i<=100; i+=4){
               
            System.out.print(" "+i+",");
        }
    }
}
