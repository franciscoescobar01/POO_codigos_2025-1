package org.example;

import java.util.*;

public class Persona {

	private String nombre;
	private String rol;
	private String correo;
	private int años;
	ArrayList<Pelicula> peliculas;

	public Persona(String nombre, String rol, String correo, int años) {
		this.nombre = nombre;
		this.rol = rol;
		this.correo = correo;
		this.años = años;
		peliculas = new ArrayList<>();
	}

	public void addPelicula(Pelicula pelicula){
		this.peliculas.add(pelicula);
	}

	@Override
	public String toString() {
		return "Persona{" +
				"nombre='" + nombre + '\'' +
				", rol='" + rol + '\'' +
				", correo='" + correo + '\'' +
				", años=" + años +
				", peliculas=" + peliculas.size() +
				'}';
	}
}