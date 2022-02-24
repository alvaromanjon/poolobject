/**
 * 
 */
package ubu.gii.dass.test.c01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ubu.gii.dass.c01.*;

/**
 * @author Álvaro Manjón Vara
 * @author María Alonso Peláez
 *
 */
public class ReusablePoolTest {

	private ReusablePool p;
	private Reusable r1, r2, r3;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		p = ReusablePool.getInstance();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		try {
			r1 = null;
			r2 = null;
			r3 = null;
			while(true) {
				p.acquireReusable();
			}
		} catch (Exception ex) {
			
		}
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		assertNotNull(p);
		ReusablePool p2 = ReusablePool.getInstance();
		assertNotNull(p2);
		assertEquals(p, p2);
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 */
	@Test
	public void testAcquireReusable() {
		
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}.
	 */
	@Test
	public void testReleaseReusable() {
		
	}
}
