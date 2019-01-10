import java.util.ArrayList;

public class Stack {

	//Atributos 
	private ArrayList <Object> stack = new ArrayList<Object>();


	//construtores
	public Stack() {
		
	}
	public Stack(ArrayList<Object> stack) {
		super();
		this.stack = stack;
	}

	
	//acessores
	public ArrayList<Object> getStack() {
		return stack;
	}


	public void setStack(ArrayList<Object> stack) {
		this.stack = stack;
	}

	//metodos
	public void adicionaUm(Object o) {
		stack.add(o);
	}
	
	public Object retiraUltimo() {
		Object a = new Object() ;
		if(stack.get(tamanho()-1) != null ? true : false) {
			a = (Object) stack.get(this.tamanho()-1);
			stack.remove(this.tamanho()-1);
		}
			
		return a;
	}
	
	public int tamanho() {
		return stack.size();
	}
	public Object consultar () {
		return stack.get(this.tamanho()-1);
	}
	public boolean isEmpty() {
		return stack.size() < 0 ? true: false;
	}
	public Object getObjectByIndex(int index) {
		return this.stack.get(index);
	}
	//toString method
	@Override
	public String toString() {
		return "Stack [stack=" + stack + "]";
	}
	
	
	
}
