import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Leitor {

	
	
	public static void main(String...args) {
		ServerSocket serverSocket1 = null;
        Socket listenSocket1 = null;
        
        ServerSocket serverSocket2 = null;
        Socket listenSocket2 = null;
        
        ServerSocket serverSocket3 = null;
        Socket listenSocket3 = null;
        
        
		
   
		String sair = JOptionPane.showInputDialog("entrar?");
		
		
		 
			try {
		
				serverSocket1 = new ServerSocket(2300);
				System.out.println("Aguardando conexão ... ");
				listenSocket1 = serverSocket1.accept();
				System.out.println("Conectado com o cliente.");
				System.out.println("Leitor [0]: Entrou "
						+ "\nConectado com o servidor IP"
						+ " localhost \nConectado com o "
						+ "servidor IP porta 2300 ");
				DataOutputStream dos1 = new DataOutputStream(
	                    listenSocket1.getOutputStream());
				
				

				serverSocket2 = new ServerSocket(2301);
				System.out.println("Aguardando conexão ... ");
				listenSocket2 = serverSocket2.accept();
				System.out.println("Conectado com o cliente.");
				System.out.println("Leitor [1]: Entrou "
						+ "\nConectado com o servidor IP"
						+ " localhost \nConectado com o "
						+ "servidor IP porta 2301 ");
				DataOutputStream dos2 = new DataOutputStream(
	                    listenSocket2.getOutputStream());
				
				
			
				serverSocket3 = new ServerSocket(2302);
				System.out.println("Aguardando conexão ... ");
				listenSocket3 = serverSocket3.accept();
				System.out.println("Conectado com o cliente.");
				System.out.println("Leitor [2]: Entrou "
						+ "\nConectado com o servidor IP"
						+ " localhost \nConectado com o "
						+ "servidor IP porta 2302 ");
				DataOutputStream dos3 = new DataOutputStream(
	                    listenSocket3.getOutputStream());
				
					
				while(!sair.equalsIgnoreCase("sair")) {
					
					sair = JOptionPane.showInputDialog("mensagem: ");
					
					dos1.writeUTF(sair);
					dos2.writeUTF(sair);
					dos3.writeUTF(sair);
				
				}
		
				
			} catch (IOException ex) {
	            Logger.getLogger(Leitor.class.getName()).log(Level.SEVERE, null, ex);
	        } finally{
	            if(listenSocket1 != null){
	                try {
	                    listenSocket1.close();
	                    serverSocket1.close();
	                } catch (IOException ex) {
	                    Logger.getLogger(Leitor.class.getName()).log(Level.SEVERE, null, ex);
	                }
	            }
	            
	            if(listenSocket2 != null){
	                try {
	                    listenSocket2.close();
	                    serverSocket2.close();
	                } catch (IOException ex) {
	                    Logger.getLogger(Leitor.class.getName()).log(Level.SEVERE, null, ex);
	                }
	            }
	            
	            if(listenSocket3 != null){
	                try {
	                    listenSocket3.close();
	                    serverSocket3.close();
	                } catch (IOException ex) {
	                    Logger.getLogger(Leitor.class.getName()).log(Level.SEVERE, null, ex);
	                }
	            }
	        }
			
			
		 
		
		
	}

	public static boolean validaSair(String sair) {
		if(!sair.equalsIgnoreCase("sair")) {
			return true;
		} else {
			return false;
		}
	}
}
