package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {

	Curso c = new Curso();
	Persona p = new Persona ("12345678i","Jose", "Luis");
	
	@Test
	public void testEliminarAlumno() {
		try {
			c.eliminarAlumno("18086912b");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertFalse(c.estaRegistrado("18086912b"));
		
		Boolean lanzarExcepcion = false;
		try {
			c.eliminarAlumno("20");
		} catch (Exception e) {
			lanzarExcepcion = true;
		}
		assertTrue(lanzarExcepcion);
	}


	@Test
	public void testAniadirAlumno() {
		c.aniadirAlumno(p);
		assertTrue(c.estaRegistrado("12345678i"));
	}

	@Test
	public void testEstaRegistrado() {
		c.aniadirAlumno(p);
		assertTrue(c.estaRegistrado("12345678i"));
		assertFalse(c.estaRegistrado("18086912b"));
	}

	@Test
	public void testCurso() {
		Curso c = new Curso();
		assertEquals(c.numeroAlumnos(),0);
	}

	@Test
	public void testNumeroAlumnos() {
		Curso c = new Curso();
		assertEquals(c.numeroAlumnos(),0);
	}

}
