package ubu.gii.dass.test.c01;

import static org.junit.Assert.*;

import org.junit.Test;
import ubu.gii.dass.c01.*;

/**
 * @author Álvaro Manjón Vara
 * @author María Alonso Peláez
 *
 */

public class ClientTest {
	
	@Test
	public void ClientClassTest() {
		Client c = new Client();
		assertNotNull(c);
		assert(c instanceof Client);
	}
}
