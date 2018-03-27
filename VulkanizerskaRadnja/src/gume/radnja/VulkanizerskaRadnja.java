package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;
/**
 * Klasa koja opisuje vuklanizersku radnju.
 * @author BojanDjekic
 * @version 1.0
 */
public class VulkanizerskaRadnja {
	/**
	 * Lista objekata klase AutoGuma
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
	/**
	 * Dodaje gumu unetu kao parametar u listu
	 * @param a objekat klase AutoGuma
	 * @throws NullPointerException (ukoliko je uneti parametar null) ili RuntimeException (ukoliko je uneti parametar vec postoji u listi)
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}
	/**
	 * Pronalazi sve gume modela istog kao i uneti parametar i ubacuje ih u novu listu
	 * @param markaModel naziv modela koji se trazi
	 * @return null ukoliko je uneti parametar null, a u suprotnom novoformiranu listu
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}

}
