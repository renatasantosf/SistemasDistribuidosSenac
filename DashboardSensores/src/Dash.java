
public class Dash extends Entrada{
	
	
	
	@Override
	public void run()  {
		
		for(int i=0;i<6;i++) {
			
			System.out.println("Sensor"+(i+1)+":"+getSensores()[i]);
			
		}
		
		
	}
	

}
