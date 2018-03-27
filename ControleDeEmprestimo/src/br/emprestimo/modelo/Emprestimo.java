package br.emprestimo.modelo;

public class Emprestimo {
	private Livro livro;
	private Usuario usuario;
	private String dataEmprestimo;
	private String dataDevolucao;
	
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
		
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
//	/ **
//	 * validado o formato da data
//	 * 
//	 * @param data no formato dd / MM / aaaa
//	 * @revolve true se um dado está no formato valido e falso para
//	 * invalido
//	 * /
//	public  boolean  validaData ( dados da seqüência  ) { 
//		DateFormat  df  =  new  SimpleDateFormat ( "dd / MM / aaaa" );
//		df . setLenient ( false );  //
//		try  {
//			df . analisar ( dados );  // data v lida
//			retorno  verdadeiro ;
//		}  catch  ( ParseException  ex )  {
//			logger . erro ( "Erro na validação de dados -"  +  ex . getMessage ());
//			retorno  falso ;
//		}
//	}
	
}
