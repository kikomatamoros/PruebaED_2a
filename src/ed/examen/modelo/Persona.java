package ed.examen.modelo;

/**
 * La clase que representa los alumnos de los cursos
 * @author Javier
 * @version 0.1
 **/

public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	
	/**
	 * Inicializa a la persona
	 * @param dni DNI de la persona
	 * @param nombre Nombre de la persona 
	 * @param apellido1 Apellido de la persona
	 **/
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	/**
	 * Devuelve el DNI de la persona
	 * @return Printa el DNI
	 **/
	public String getDni() {
		return dni;
	}
	
	
	/**
	 * Comprueba que el DNI de la persona introducido es correcto, si no lo es lanza una Excepcion
	 * @param dni DNI de la persona
	 * @throws Exception Lanza la excepcion si el ultimo caracter del DNI no es una letra
	 **/
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	/**
	 * Devuelve el nombre de la persona
	 * @return Printal el nombre
	 **/

	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Modifica el nombre de la persona
	 * @param nombre Nuevo nombre 
	 **/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Devuelve el primer Apellido 
	 * @return Devuelve el primer Apellido
	 **/
	public String getApellido1() {
		return apellido1;
	}
	
	/*
	 * Documentar y crear test unitario
	 * */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}
