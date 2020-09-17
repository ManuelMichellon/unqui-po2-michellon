package unq;

public class Producto {
	private String nombre;
	private double precio;
	private boolean preciosCuidados;
	private boolean productoPrimerNecesidad;
	private double descuento;
	
	public Producto(String nombre, double precio, boolean preciosCuidados) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.preciosCuidados = preciosCuidados;
		this.productoPrimerNecesidad = false;
		this.descuento = 0;
	}

	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.preciosCuidados = false; 
		this.productoPrimerNecesidad = false;
		this.descuento = 0;
	}

	public Producto(String nombre, double precio, boolean preciosCuidados, boolean productoPrimeraNecesidad, double descuento) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.preciosCuidados = preciosCuidados;
		this.productoPrimerNecesidad = productoPrimeraNecesidad;
		this.descuento = descuento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		double result = 0;
		if (productoPrimerNecesidad) {
			result = (precio * descuento) / new Double(100);
		}else {
			result = precio;
		}
		return result;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isPreciosCuidados() {
		return preciosCuidados;
	}

	public void setPreciosCuidados(boolean preciosCuidados) {
		this.preciosCuidados = preciosCuidados;
	}
	
	

}
