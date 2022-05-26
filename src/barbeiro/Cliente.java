package barbeiro;

public class Cliente extends Thread {
	public String nome;
	
	public BufferClientes bufferClientes;
	
	
	public Cliente() {
	}
	
	@Override
	public void run() {
		synchronized (bufferClientes) {
			if(bufferClientes.clientes.size() == bufferClientes.maximoClientes) {
				System.out.println(nome + " foi embora");
			}
			else {
				bufferClientes.clientes.add(this);
				System.out.println(nome + " esta esperando");
				bufferClientes.notifyAll();
			}
		}
	}
}
