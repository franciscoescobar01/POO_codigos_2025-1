package org.example;

import java.util.*;

public class Pelicula {

	private String titulo;
	private Date inicio;
	private Date termino;
	private String estado;
	ArrayList<Persona> equipo;
	Reporte reporte;

	public Pelicula(String titulo, Date inicio) {
		this.titulo = titulo;
		this.inicio = inicio;
		this.termino = new Date(0L);
		this.estado = "por iniciar";
		equipo = new ArrayList<>();
		reporte = new Reporte();

	}

	public void addEquipo (Persona persona){
		equipo.add(persona);
		persona.addPelicula(this);
		reporte.addEquipo(persona);
	}
	public void addRecurso(Recurso recurso){
		if(recurso.isDisponible())
		{
			recurso.ocupar();
			reporte.addRecurso(recurso);
			System.out.println("Recurso asignado correctamente");
		}else {
			System.out.println("El recurso esta ocupado");
		}
	}
	public void iniciar(){
		this.estado = "en producción";

	}

	public void terminar(){
		this.estado = "Terminado";
		reporte.calcularCosto();
		reporte.mostrar();
	}

	public String getTitulo() {
		return titulo;
	}


	@Override
	public String toString() {
		return "Pelicula{" +
				"titulo='" + titulo + '\'' +
				", inicio=" + inicio +
				", termino=" + termino +
				", estado='" + estado + '\'' +
				", equipo=" + equipo +
				", reporte=" + reporte +
				'}';
	}
}