package ar.edu.unlp.info.oo1.ejercicioBal;

public class Balanza {
	
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	
	
	public Balanza () {
		
		cantidadDeProductos = 0;
		precioTotal = 0;
		pesoTotal = 0;
		
	}
	
	public void ponerEnCero() {
		
		this.cantidadDeProductos = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
		
	}
	
	public void agregarProducto(Producto producto) {
		
		this.cantidadDeProductos ++;
		this.precioTotal += producto.getPrecio();
		
	}
	
	public Ticket emitirTicket () {
		Ticket t = new Ticket(cantidadDeProductos,precioTotal,pesoTotal);
		return t;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
	

}
