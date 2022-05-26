package barbeiro;
import java.util.LinkedList;
import java.util.Queue;

public class BufferClientes {
	
	public Queue<Cliente> clientes;
	public int maximoClientes;
	
	public BufferClientes(int maximoClientes) {
		this.clientes = new LinkedList<Cliente>();
		this.maximoClientes = maximoClientes;
	}
}
