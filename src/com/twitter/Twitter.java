package com.twitter;

import java.util.LinkedList;

import com.twitter.poruke.TwitterPoruka;

/**
 * Klasa koja sadrzi listu sa Twitter porukama
 * 
 * @author chebedzic
 * 
 */
public class Twitter {
	private LinkedList<TwitterPoruka> poruke = new LinkedList<TwitterPoruka>();

	/**
	 * metoda koja vraca listu
	 * 
	 * @return listu sa Twitter porukama
	 */
	public LinkedList<TwitterPoruka> vratiSvePoruke() {
		return poruke;
	}

	/**
	 * metoda za unosenje Twitter poruke u listu
	 * 
	 * @param korisnik
	 *            username korisnika
	 * @param poruka
	 *            poruka koju korisnik hoce da posalje
	 */
	public void unesi(String korisnik, String poruka) {
		// Pravi se nova poruka i puni podacima.
		TwitterPoruka tp = new TwitterPoruka();
		tp.setKorisnik(korisnik);
		tp.setPoruka(poruka);
		// Poruka se unosi u listu na kraj
		poruke.addLast(tp);
	}

	/**
	 * metoda koja elemente liste ubacuje u niz i onda vraca taj niz poruka
	 * 
	 * @param maxBroj
	 *            Broj broj na koji niz treba da se inicijalizuje odnosno koliko
	 *            poruka zelimo da se vrati
	 * @param tag
	 *            rec koja se proverava da li postoji u poruci
	 * @return vraca niz koji zadovoljava uslov da sadrzi odgovarajucu rec
	 *         odnosno tag
	 */
	public TwitterPoruka[] vratiPoruke(int maxBroj, String tag) {
		if (tag == null || tag.isEmpty())
			throw new RuntimeException("Morate uneti tag");
		// Ako je maxBroj <=0, vraca maxBroj se postavlja na 100 poruka
		if (maxBroj <= 0)
			maxBroj = 100;
		// Pomocna promenljiva koja predstavlja brojac upisanih poruka
		int brojac = 0;
		// Pomocni niz koja predstavlja rezultat pretrage tj. sadrzace
		// sve poruke koje u sebi imaju zadati tag
		TwitterPoruka[] rezultat = new TwitterPoruka[maxBroj];
		// Pretrazuju se poruke i traze se one koje sadrze tag.
		// Ako se nadje neka takva, i ako nije prekoracen maxBroj
		// ona se upisuje u niz. Ako je prekoracen maxBroj,pretraga
		// se prekida.
		for (int i = 0; i < poruke.size(); i++)
			if (poruke.get(i).getPoruka().indexOf(tag) != -1)
				if (brojac < maxBroj) {
					rezultat[brojac] = poruke.get(i);
					brojac++;
				} else
					break;
		return rezultat;
	}
}
