package exrercicio.livros;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("João", 15, 'M');
		p[1] = new Pessoa("Maria", 19, 'F');
		
		l[0] = new Livro("Jardim das Aflições", "Olavo de Carvalho", 420, p[0]);
		l[1] = new Livro("A Divina Comédia", "Dante Alighieri", 800, p[1]);
		l[2] = new Livro("O Livre Mercado", "Ludwig Von Misses", 139, p[0]);
		
		
		l[0].abrir();
		l[0].folhear(200);
		l[0].detalhes();
		l[1].detalhes();
		l[2].detalhes();
		
	}

}
