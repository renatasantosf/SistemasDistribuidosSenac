import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Escritor {

	public static void main(String[] args) {
		
		Socket socketCliente = null;
		
		DataInputStream dis;
		DataOutputStream dos;

		
		try {
			
			System.out.println("Aguardando conexão.");
			int porta = Integer.parseInt(JOptionPane.showInputDialog("Porta: "));
			socketCliente = new Socket("localhost",porta);
			
			dos =  new DataOutputStream(socketCliente.getOutputStream());
			dis = new DataInputStream(socketCliente.getInputStream());
			
            dos.writeUTF(String.valueOf(porta));
            System.out.println("Conectado com o cliente.");
            
            String mensagem;
            do {
            	 mensagem = dis.readUTF();
            	System.out.println(mensagem);
            }while(!mensagem.equalsIgnoreCase("sair"));
			
			
		} catch (IOException ex) {
            Logger.getLogger(Leitor.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                if(socketCliente != null)
                    socketCliente.close();
                
            } catch (IOException ex) {
                Logger.getLogger(Leitor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
		
	}

}


