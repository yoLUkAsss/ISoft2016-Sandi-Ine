/**
 * 
 */
package tests.testsValues;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import src.elements.*;
import src.excepciones.*;
/**
 * @author pcm-exilio
 *
 */
public class TableroTest {

	Tablero tableroDelTest = new Tablero();
	Pieza o = Pieza.O;
	Pieza x = Pieza.X;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTableroTieneCeldasCompletas() {
		Integer expected = 9;
		
		Integer current = tableroDelTest.celdas().size();
		
		assertEquals(expected,current);
	}
	
	@Test
	public void testAgregarPieza () {
		try {
			tableroDelTest.colocarPieza(x,5);
			Pieza expected = x;
			Pieza current = tableroDelTest.piezaEnPisicion(5);
			assertEquals(expected, current);
		} catch (InsercionDePiezaInvalidaException e) {
			assertTrue(false);
			e.printStackTrace();
		}
	}
	
	@Test (expected=InsercionDePiezaInvalidaException.class)
	public void testReemplazoDePiezaNoEsValido ()  throws InsercionDePiezaInvalidaException {
			tableroDelTest.colocarPieza(o, 3);
			tableroDelTest.colocarPieza(x, 3);
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
	}
	
	
	
	
	
	


}