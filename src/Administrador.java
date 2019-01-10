
public class Administrador extends Empregado {
	//atributos de instancia
	private double ajudaDeCusto;
	//atributos da classe
	
	//construtores
	
	public Administrador(String nome,String end, String tel, int codigoSetor, int salarioBase, double imposto, double ajudaDeCusto) {
		super(nome,end,tel,
				codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public Administrador() {
		super();
	}
	
	public Administrador(Empregado e) {
		super(e);
		this.getAjudaDeCusto();
	}
	//acessores
	
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	//metodos
	
	public double calcularSalario() {
		return super.calcularSalario() + this.ajudaDeCusto;
	}
	
	//toString and writing methods
	@Override
	public String toString() {
		return "Administrador [ajudaDeCusto=" + ajudaDeCusto + ", toString()=" + super.toString() + "]";
	}
	
}
