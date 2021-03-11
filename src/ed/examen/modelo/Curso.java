package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase para representar a un curso escolar
 * @author Javier
 * @version 0.1
 **/

public class Curso {
	
	private List<Persona> listaAlumnos;

	/**
	 * Elimina un alumno introduciendo su dni
	 * @param dni DNI del alumno que se quiere eliminar 
	 * @throws Exception Excepcion si la longuitud del DNI no es la correcta
	 **/
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	/**
	 * A�ade alumnos al curso
	 * @param p Persona que se añade al curso
	 **/
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
