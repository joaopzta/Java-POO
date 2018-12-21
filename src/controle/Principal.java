package controle;

public class Principal {

	public static void main(String[] args) {
		
		ControleRemoto c = new ControleRemoto();
		
		c.ligar();
		c.maisVolume();
		c.maisVolume();
		c.ligarMudo();
		c.play();
		c.pause();
		c.abrirMenu();
		c.fecharMenu();
		
	}

}
