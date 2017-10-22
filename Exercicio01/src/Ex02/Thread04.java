package Ex02;

public class Thread04 implements Runnable{

    @Override
    public void run() {
    	System.out.print("\nThread 04: responsável por imprimir ");
        for(int i=4; i<=100; i+=4){
               
            System.out.print(" "+i+",");
        }
    }
}
