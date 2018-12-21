package ultra.emoji.combat;

import java.util.Random;

public class Lutas implements ILutas{

	private Lutador desafiante;
	private Lutador desafiado;
	private int rounds;
	private boolean aprovada;
	
	
	public void marcarLuta(Lutador L1, Lutador L2) {
		
		if( L1.getCategoria() == L2.getCategoria() && L1 != L2 ) {
			this.setAprovada(true);
			this.setDesafiado(L1);
			this.setDesafiante(L2);
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
		
	}

	public void lutar() {
		
		if( this.aprovada ) {
			
			System.out.println("\tULTRA EMOJI COMBAT");
			System.out.println("\t    LUTA DA NOITE\n");
			Random aleatorio = new Random();
			System.out.println("\t#### Desafiante ####\n");
			this.getDesafiante().apresentar();
			System.out.println("\n\t#### Desafiado ####\n");
			this.getDesafiado().apresentar();
			int vencedor = aleatorio.nextInt(3);
			System.out.println("========= RESULTADO DA LUTA =========");
			switch( vencedor ) {
				
				case 0:
					System.out.println("\n||||  A Luta terminou em EMPATE!  ||||\n");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1:
					System.out.println("\nE o Vencedo é..... " + this.desafiante.getNome() + "!!!!!\n");
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
				case 2:
					System.out.println("\nE o Vencedo é..... " + this.desafiado.getNome() + "!!!!!\n");
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
					
			}
			System.out.println("=====================================");
			
		} else System.out.println("\nA Luta não pode acontecer!");
		
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	
	

}
