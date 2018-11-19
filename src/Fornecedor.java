
public class Fornecedor extends Pessoa{
	//atributos de instancia
	
	//atributos da classe
	private double valorCredito;
	private double valorDivida;
	//construtores
	//dafault
	public Fornecedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	//clone
	public Fornecedor(Pessoa p) {
		super(p);
		this.getValorCredito();
		this.getValorDivida();
		// TODO Auto-generated constructor stub
		
	}
	//constructor with fields
	public Fornecedor(double  newValorCredito, double newValorDivida,
			String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		this.valorCredito = newValorCredito;
		this.valorDivida = newValorDivida;
		// TODO Auto-generated constructor stub
	}

	
	//acessores
	public double getValorCredito() {
		return valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	//metodos
	public double obterSaldo() {
		return this.getValorCredito() - this.getValorDivida();
	}
	
	//toString and writing methods
	@Override
	public String toString() {
		
		return "Fornecedor" + super.toString().substring(6)
				+ " [getValorCredito()=" + getValorCredito() + ", getValorDivida()=" + getValorDivida() + "]";
	}
	
	
}
