package entidades;

public class Direccion {
	
	String tipoVia;
	String nombreVia;
	String localidad;
	int CP;
	
	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", localidad=" + localidad + ", CP=" + CP
				+ "]";
	}

	public Direccion() {
		super();
	}
	
	public Direccion(String tipoVia, String nombreVia, String localidad, int cP) {
		super();
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.localidad = localidad;
		CP = cP;
	}

	

	
	
	
	
}
