package com.twitter.poruke;

/**
 * Ova klasa kreira jednostavnu twiter poruku
 * 
 * @author chebedzic
 * @version 1.0
 */
public class TwitterPoruka {

	private String korisnik;
	private String poruka;

	/**
	 * Metoda koja vraca korisnika
	 * 
	 * @return vraca username korisnika
	 */
	public String getKorisnik() {
		return korisnik;
	}

	/**
	 * Metoda koja kao parametar uzima korisnika i menja ili postavlja kao novu
	 * vrednost
	 * 
	 * @param korisnik
	 *            username korisnika
	 */
	public void setKorisnik(String korisnik) {
		if (korisnik == null || korisnik.equals(""))
			throw new RuntimeException("Ime korisnika mora biti uneto");
		this.korisnik = korisnik;
	}

	/**
	 * metoda koja vraca poruku tipa String
	 * 
	 * @return tekst Twitter poruke
	 */
	public String getPoruka() {
		return poruka;
	}

	/**
	 * Metoda koja kao parametar uzima poruku i menja je ili postavlja kao novu
	 * @param poruka tekst poruke koju korisnik hoce da posalje
	 */
	public void setPoruka(String poruka) {
		if (poruka == null || poruka.length() > 140)
			throw new RuntimeException(
					"Poruka mora biti uneta i mora imati najvise 140 znakova");
		this.poruka = poruka;
	}
	/**
	 * Metoda koja vraca String koij predstavlja sve atribute odgovarajuceg objekta
	 */
	public String toString() {
		return "KORISNIK:" + korisnik + " PORUKA:" + poruka;
	}
}