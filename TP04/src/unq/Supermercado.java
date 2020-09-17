package unq;

import java.util.ArrayList;

public class Supermercado {
	private String nombre;
	private String ubicación;
	private ArrayList<Producto> catalogo;
	
	public Supermercado(String nombre, String ubicación) {
		this.nombre = nombre;
		this.ubicación = ubicación;
		this.catalogo = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicación() {
		return ubicación;
	}

	public void setUbicación(String ubicación) {
		this.ubicación = ubicación;
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
