package ed.examen.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {
	
	Persona p = new Persona("18086912b", "Javier", "Marmol");

	@Test
	public void testPersonaStringStringString() {
		Persona p = new Persona("18086912b", "Javier", "Marmol");
		assertEquals("18086912b",p.getDni());
		assertEquals("Javier",p.getNombre());
		assertEquals("Marmol",p.getApellido1());
	}
	
	@Test
	public void testGetDni() {
		assertEquals("18086912b", p.getDni());
	}

	@Test
	public void testSetDni() {
		try {
			p.setDni("12345678c");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("12345678c", p.getDni());

		Boolean lanzaExcepcion = false;
		try {
			p.setDni("012345678");
		} catch (Exception e) {
			lanzaExcepcion = true;
		}
		assertTrue(lanzaExcepcion);
		
	}

	@Test
	public void testGetNombre() {
		
	}

	@Test
	public void testSetNombre() {
		
	}

	@Test
	public void testGetApellido1() {
		
	}

	@Test
	public void testSetApellido1() {
		
		
	}

}
