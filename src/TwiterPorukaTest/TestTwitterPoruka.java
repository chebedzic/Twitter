/**
 * 
 */
package TwiterPorukaTest;

import com.twitter.poruke.TwitterPoruka;

import junit.framework.TestCase;

/**
 * @author chebe
 *
 */
public class TestTwitterPoruka extends TestCase {
	TwitterPoruka tp = new TwitterPoruka();

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		tp.setKorisnik("ch3b3");
		tp.setPoruka("testiranje");
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#getKorisnik()}.
	 */
	public void testGetKorisnik() {
		String korisnik = "ch3b3";
		assertEquals(korisnik, tp.getKorisnik());
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setKorisnik(java.lang.String)}.
	 */
	public void testSetKorisnik() {
		String korisnik = "pera";
		tp.setKorisnik(korisnik);
		assertEquals("pera", tp.getKorisnik());
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#getPoruka()}.
	 */
	public void testGetPoruka() {
		String poruka = "testiranje";
		assertEquals(poruka, tp.getPoruka());
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#setPoruka(java.lang.String)}.
	 */
	public void testSetPoruka() {
		String poruka = "eclipse";
		tp.setPoruka(poruka);
		assertEquals(poruka, tp.getPoruka());
	}

	/**
	 * Test method for {@link com.twitter.poruke.TwitterPoruka#toString()}.
	 */
	public void testToString() {
		assertEquals("KORISNIK:ch3b3 PORUKA:testiranje", tp.toString());
	}

}
