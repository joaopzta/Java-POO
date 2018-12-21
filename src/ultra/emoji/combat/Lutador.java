package ultra.emoji.combat;

public class Lutador implements Lutadores{
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	@Override
	public void apresentar() {
		
		System.out.println("------ --------- -------");
		System.out.println("CHEGOU A HORA!! Apresentamos o Lutador " + this.getNome());
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " anos");
		System.out.println(this.getAltura() + "m de altura");
		System.out.println("Pesando " + this.getPeso() + "kg");
		System.out.println("Ganhou " + this.getVitorias() + " partida(s)");
		System.out.println("Perdeu em " + this.getDerrotas() + " partida(s)");
		System.out.println("Empatou " + this.getEmpates() + " partida(s)");
		
		if ( this.getDerrotas() == 0 ) {
			System.out.println("Atualmente INVICTO no campeonato, um monstro dos ringues");
		} else
			if ( this.getVitorias() >= 12 ) {
				System.out.println("Ele vem DESTRUINDO nos ringues com uma crescente de vitórias");
			} else System.out.println("Será uma luta e tanto...");
		
	}
	
	@Override
	public void status() {
		
		System.out.println("------- Status -------");
		System.out.println(this.getNome());
		System.out.println("É um peso " + this.getCategoria());
		System.out.println(this.getVitorias() + " vitórias");
		System.out.println(this.getDerrotas() + " derrotas");
		System.out.println(this.getEmpates() + " empates");
		
	}

	@Override
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	@Override
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	@Override
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria(peso);
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(float peso) {
		if (peso<52.2) {
			this.categoria = "Inválido";
		} else
			if (peso<=70.3) {
				this.categoria = "Leve";
			} else
				if (peso<=83.9) {
					this.categoria = "Médio";
				} else
					if (peso<=120.2) {
						this.categoria = "Pesado";
					} else this.categoria = "Inválido";
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}	
}
