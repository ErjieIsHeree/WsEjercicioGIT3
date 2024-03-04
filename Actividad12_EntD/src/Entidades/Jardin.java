package Entidades;

public class Jardin {
	
	double cantMeTros;
	int numeroPlantas;
	
	public Jardin() {
		super();
	}
	
	public Jardin(double cantMeTros, int numeroPlantas) {
		super();
		this.cantMeTros = cantMeTros;
		this.numeroPlantas = numeroPlantas;
	}

	@Override
	public String toString() {
		return "Jardin [cantMeTros=" + cantMeTros + ", numeroPlantas=" + numeroPlantas + "]";
	}

	public double getCantMeTros() {
		return cantMeTros;
	}

	public void setCantMeTros(double cantMeTros) {
		this.cantMeTros = cantMeTros;
	}

	public int getNumeroPlantas() {
		return numeroPlantas;
	}

	public void setNumeroPlantas(int numeroPlantas) {
		this.numeroPlantas = numeroPlantas;
	}
	
}
