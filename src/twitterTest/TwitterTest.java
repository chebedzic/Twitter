package twitterTest;

import java.util.LinkedList;

import com.twitter.Twitter;
import com.twitter.poruke.TwitterPoruka;

import junit.framework.TestCase;

public class TwitterTest extends TestCase {
	LinkedList<TwitterPoruka> twp = new LinkedList<TwitterPoruka>();
	Twitter tw = new Twitter();

	protected void setUp() throws Exception {

	}

	protected void tearDown() throws Exception {
	}

	public void testVratiSvePoruke() {
		int br=0;
		for (int i = 0; i < twp.size(); i++) {
			if (!twp.get(i).equals(tw.vratiSvePoruke().get(i))) {
				br++;
				assertEquals(0,br);
			}
		}
	}

	public void testUnesi() {
		tw.unesi("ch3b3", "poruka");
		TwitterPoruka tp = new TwitterPoruka();
		tp.setKorisnik("ch3b3");
		tp.setPoruka("poruka");
		twp.add(tp);
		assertEquals("ch3b3", tw.vratiSvePoruke().get(0).getKorisnik());
	}

	public void testVratiPoruke() {
	
		tw.unesi("ch3b3", "poruka");
		tw.unesi("chebe", "poruka");
		assertEquals("chebe",tw.vratiPoruke(10, "poruka")[1].getKorisnik());
		
	}

}
