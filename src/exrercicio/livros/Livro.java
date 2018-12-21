package exrercicio.livros;

public class Livro implements Publicacao{
	
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.pagAtual = 0;
		this.leitor = leitor;
		this.setAberto(false);
		this.totPaginas = totPaginas;
	}

	public void detalhes() {
		
		System.out.println("------- DETALHES -------");
		System.out.println("Titulo: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de Páginas: " + this.getTotPaginas());
		System.out.println("Pagina Atual: " + this.getPagAtual());
		System.out.println("O livro está aberto? " + this.isAberto());
		System.out.println("Leitor Atual: " + this.getLeitor().getNome());
		System.out.println("------------------------");
		
	}

	@Override
	public void abrir() {
		
		this.setAberto(true);
		
	}

	@Override
	public void fechar() {
		
		this.setAberto(false);
		
	}

	public void folhear(int p) {
		
		this.pagAtual = p;
		
	}

	@Override
	public void avancarPag() {
		
		if (this.isAberto()) {
			
			this.setPagAtual(this.getPagAtual() + 1);
			System.out.println("Página " + this.getPagAtual());
			
		} else System.out.println("O livro não está aberto!");
		
	}

	@Override
	public void voltarPag() {
		
		if (this.isAberto()) {
			
			this.setPagAtual(this.getPagAtual() - 1);
			System.out.println("Página " + this.getPagAtual());
			
		} else System.out.println("O livro não está aberto!");
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	

}
