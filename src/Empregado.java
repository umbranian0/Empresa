
public class Empregado extends Pessoa{
	//atributos de instancia
	private int codigoSetor, salarioBase;
	
	//atributos da classe
	private double imposto;
	
	//construtores
	public Empregado(int codigoSetor, int salarioBase, double imposto) {
		super();
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public Empregado() {
		super();
	}
	
	public Empregado(Pessoa p) {
		super(p);
		this.getCodigoSetor();
		this.getSalarioBase();
		this.getImposto();		
	}
	
	//acessores
	
public int getCodigoSetor() {
	return codigoSetor;
}

public void setCodigoSetor(int codigoSetor) {
	this.codigoSetor = codigoSetor;
}

public int getSalarioBase() {
	return salarioBase;
}

public void setSalarioBase(int salarioBase) {
	this.salarioBase = salarioBase;
}

public double getImposto() {
	return imposto;
	}
	//metodos

public double calcularSalario() {
	return this.getSalarioBase() * (1-this.getImposto()); // -1 indefenido????
}


	@Override
public String toString() {
	return "Empregado [codigoSetor=" + codigoSetor + ", salarioBase=" + salarioBase + ", imposto=" + imposto
			+ ", toString()=" + super.toString() + "]";
}
}
