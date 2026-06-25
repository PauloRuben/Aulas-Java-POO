package aula07;

public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int toPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor; 
	
	
	public String detalhes() {
		return "Livro{" + "titulo=" + titulo + "\n, autor=" + autor + 
				"\n, toPaginas=" + toPaginas + "\n, pagAtual=" + pagAtual
				+ "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + 
				", idade=" + leitor.getIdade() +",sexo="+ leitor.getSexo() + "}";
	}


	public Livro(String titulo, String autor, int toPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.toPaginas = toPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
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


	public int getToPaginas() {
		return toPaginas;
	}


	public void setToPaginas(int toPaginas) {
		this.toPaginas = toPaginas;
	}


	public int getPagAtual() {
		return pagAtual;
	}


	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}


	public boolean getAberto() {
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


	@Override
	public void abrir() {
		this.aberto = true;
		
	}


	@Override
	public void fechar() {
		this.aberto = false;
		
	}


	@Override
	public void folhear(int p) {
		//condicao para não ultrapassar o numero total de paginas
		if(p > this.toPaginas) {
			this.pagAtual = 0 ;
		} else {
			this.pagAtual = p;
		}
	}


	@Override
	public void avancaPag() {
		this.pagAtual++;
		
		
	}


	@Override
	public void voltarPag() {
		this.pagAtual--;
	}
}
