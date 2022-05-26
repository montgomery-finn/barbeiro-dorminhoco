package barbeiro;

public class Barbeiro extends Thread {

	public BufferClientes bufferClientes;
	
	public Barbeiro() {
	}


	@Override
	public void run() {
		while(true) {
			
			synchronized (bufferClientes) {
				Cliente cliente = bufferClientes.clientes.poll();
				
				while(cliente == null) {
					System.out.println("O barbeiro dormiu");
					
					try {
						bufferClientes.wait();
						System.out.println("O barbeiro acordou");
						cliente = bufferClientes.clientes.poll();
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("Erro no wait do barbeiro");
					}
				}
				
				System.out.println("Cortando o cabelo de " + cliente.nome);
				
				try {
					sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("erro ao cortar cabelo");
				}
			}
			
		}
	}
	
}
