package ubu.gii.dass.test.c01;

import static org.junit.Assert.*;

import org.junit.Test;
import ubu.gii.dass.c01.*;

/**
 * @author Álvaro Manjón Vara
 * @author María Alonso Peláez
 *
 */
public class ReusableTest {
	
	@Test
	public void testUtil() {
		Reusable r = new Reusable();
		assertEquals(r.util(), r.hashCode() + "  :Uso del objeto Reutilizable");
	}
}
