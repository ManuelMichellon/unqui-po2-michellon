package unq;

import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	private String ubicaci�n;
	private ArrayList<Producto> catalogo;
	
	public Supermercado(String nombre, String ubicaci�n) {
		this.nombre = nombre;
		this.ubicaci�n = ubicaci�n;
		this.catalogo = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicaci�n() {
		return ubicaci�n;
	}

	public void setUbicaci�n(String ubicaci�n) {
		this.ubicaci�n = ubicaci�n;
	}

	public ArrayList<Producto> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(ArrayList<Producto> catalogo) {
		this.catalogo = catalogo;
	}

	public int getCantidadDeProductos() {
		return catalogo.size();
	}

	public void agregarProducto(Producto producto) {
		this.catalogo.add(producto);
	}

	public Double getPrecioTotal() {
		double result = 0;
		for (Producto producto : catalogo) {
			result = result + producto.getPrecio();
		}
		return result;
	}


	
}
