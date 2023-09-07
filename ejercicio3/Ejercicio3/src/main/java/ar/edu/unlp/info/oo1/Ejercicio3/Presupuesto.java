package ar.edu.unlp.info.oo1.Ejercicio3;


import java.time.LocalDate;
import java.util.ArrayList;


public class Presupuesto {
	
	private LocalDate fecha;
	private String cliente;
	private ArrayList<Item> items = new ArrayList<Item>();
	


	public Presupuesto (String cliente) {
		this.cliente = cliente;
		this.fecha = java.time.LocalDate.now();
		
	}
	
	public void agregarItem (Item item) {
		this.items.add(item);
	}
	
	
	public double calcularTotal () {
		double total = 0;
		for (Item i:items) total += i.costo();
		
		return total;
		
		
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	
	

}
