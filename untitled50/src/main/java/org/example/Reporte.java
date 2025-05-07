package org.example;

import java.util.*;

public class Reporte {

	ArrayList<Persona> equipo;
	ArrayList<Recurso> recursos;
	private int costo;

	public Reporte() {
		this.equipo = new ArrayList<>();
		this.recursos = new ArrayList<>();
		this.costo = 0;
	}

	public void addEquipo(Persona persona){
		equipo.add(persona);
	}

	public void addEquipo(ArrayList<Persona> equipo){
		for(Persona p: equipo){
			this.equipo.add(p);
		}
	}

	public void addRecurso(Recurso recurso) {
		recursos.add(recurso);
	}

	public void calcularCosto() {
		for (Recurso r: recursos){
			costo+= r.getPrecio();
		}

	}
	public void mostrar(){
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Reporte{" +
				"equipo=" + equipo +
				", recursos=" + recursos +
				", costo=" + costo +
				'}';
	}
}