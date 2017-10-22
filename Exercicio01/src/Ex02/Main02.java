package Ex02;

public class Main02 {

	public static void main(String[] args) {
		 Thread01 t1 = new Thread01();
         new Thread(t1).start();
         
                  
         Thread02 t2 = new Thread02();
         new Thread(t2).start();
         
         
         Thread03 t3 = new Thread03();
         new Thread(t3).start();
         
        
         Thread04 t4 = new Thread04();
         new Thread(t4).start();
         
	}

}
