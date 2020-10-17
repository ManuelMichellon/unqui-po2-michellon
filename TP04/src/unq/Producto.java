package unq;

public class Producto {
	private String nombre;
	private double precio;
	private boolean precioCuidado;
	
	public Producto(String nombre, double precio, boolean preciosCuidados) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = preciosCuidados;
	}

	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = false; 
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean esPrecioCuidado() {
		return precioCuidado;
	}

	public void setPreciosCuidados(boolean preciosCuidados) {
		this.precioCuidado = preciosCuidados;
	}

	public void aumentarPrecio(double aumento) {
		this.precio = precio + aumento;
		
	}
	
	

}
