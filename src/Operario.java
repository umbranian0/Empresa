
public class Operario extends Empregado {
	
	//atributos
	private double valorProducao ;
	private double comissao ;
	
	//contrutores
	public Operario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Operario(int codigoSetor, int salarioBase, double imposto, double valorProducao, double comissao) {
		super(codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public Operario(Pessoa p) {
		super(p);
		// TODO Auto-generated constructor stub
	}


	//acessores 
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	//metodos
	
	//tostring etc
	
	
}
