package barbeiro;

import java.util.Random;
import java.util.UUID;

public class ClientesGenerator extends Thread {

	public BufferClientes bufferClientes;
	
	@Override
	public void run() {
		Random rand = new Random(); //instance of random class
	     
		Cliente cliente;
		int segundos;
		
		while(true) {
			cliente = new Cliente();
			cliente.nome = UUID.randomUUID().toString();
			cliente.bufferClientes = bufferClientes;
			cliente.start();
			
			segundos = rand.nextInt(5);
			
			try {
				sleep(segundos * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("erro no sleep do gerador");
			}
		}
	}
	
}
