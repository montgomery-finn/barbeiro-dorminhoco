package barbeiro;

public class Main {

	public static void main(String[] args) {

		var barbeiro = new Barbeiro();
		
		var bufferClientes = new BufferClientes(5);
		
		barbeiro.bufferClientes = bufferClientes;
		barbeiro.start();
		
		ClientesGenerator generator = new ClientesGenerator();
		generator.bufferClientes = bufferClientes;
		generator.start();		
	}
}
