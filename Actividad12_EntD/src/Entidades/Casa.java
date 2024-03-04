package Entidades;

public class Casa {

	private Direccion direccion;
	private double precio;
	private boolean esSegundaMano;
	private double cantMetros;
	private Jardin jardin;
	private Habitacion habitacion;	
	
	/* Se podrá calcular los metros cuadrados de la casa sumando todos los metros cuadrados de sus partes.
	Se podrá saber si una casa es un chalet o no, una casa es un chalet si tiene jardín asociado.
	Se podrá saber el precio de una casa con IVA, el precio de una casa con IVA depende de si es de segunda mano o */
	
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isEsSegundaMano() {
		return esSegundaMano;
	}
	public void setEsSegundaMano(boolean esSegundaMano) {
		this.esSegundaMano = esSegundaMano;
	}
	public double getCantMetros() {
		return cantMetros;
	}
	public void setCantMetros(double cantMetros) {
		this.cantMetros = cantMetros;
	}
	public Jardin getJardin() {
		return jardin;
	}
	public void setJardin(Jardin jardin) {
		this.jardin = jardin;
	}
	public Habitacion getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}
	public int calcularTotalMetros() {
		int totalMetros = 0;
		
		
		return totalMetros;
	}
}

