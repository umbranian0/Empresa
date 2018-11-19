
public class Pessoa {

	//atributos de instancia
	private String nome;
	private String endereco;
	private String telefone;
	//atributos da classe

	
	//construtores
	public Pessoa() {
		
	}
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public Pessoa(Pessoa p) {
		this(p.getNome(), p.getEndereco(), p.getTelefone());
	}
	//acessores
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	//metodos
	
	//toString and writing methods
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + "]";
	}
}
