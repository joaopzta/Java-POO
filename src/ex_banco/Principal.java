package ex_banco;

public class Principal {
	
	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente();
		c1.abrirConta("cc");
		c1.setDono("Jubileu");
		c1.setNumConta(1545);
		
		ContaCorrente c2 = new ContaCorrente();
		c2.abrirConta("cp");
		c2.setDono("Mia");
		c2.setNumConta(1245);
		
		c1.depositar(600f);
		c2.depositar(600f);
		
		
		c2.sacar(150f);
		c1.sacar(550f);
		
		c1.mostrar();
		c2.mostrar();
	}
	
}
