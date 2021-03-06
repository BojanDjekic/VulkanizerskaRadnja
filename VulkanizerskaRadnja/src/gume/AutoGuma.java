package gume;
	/**
	 * Klasa koja opisuje gumu sa svim njenim karakteristikama.
	 * @author BojanDjekic
	 * @version 1.0
	 *
	 */
public class AutoGuma {
	/**
	 * Oznacava model gume
	 */
	private String markaModel = null;
	/**
	 * Oznacava precnik gume
	 */
	private int precnik = 0;
	/**
	 * Oznacava sirinu gume
	 */
	private int sirina = 0;
	/**
	 * Oznacava visinu gume
	 */
	private int visina = 0;
	/**
	 * @return model gume
	 */
	public String getMarkaModel() {
	return markaModel;
	}
	/**
	 * Metoda za unos modela gume
	 * @param markaModela2 model gume koji se unosi
	 * @throws RuntimeException u slucaju da je unet parameta null ili duzina parametra manja od 3
	 */
	public void setMarkaModel(String markaModel) {
	if (markaModel==null || markaModel.length()<3)
	throw new RuntimeException("Morate uneti marku i model");
	this.markaModel = markaModel;
	}
	/**
	 * 
	 * @return precnik gume
	 */
	public int getPrecnik() {
	return precnik;
	}
	/**
	 * Metoda za unos precnika gume
	 * @param precnik precnik gume koji se unosi
	 * @throws RuntimeException u slucaju unetog precnika manjeg od 13 ili veceg od 22
	 */
	public void setPrecnik(int precnik) {
	if (precnik < 13 || precnik > 22)
	throw new RuntimeException("Precnik van opsega");
	this.precnik = precnik;
	}
	/**
	 * 
	 * @return sirinu gume
	 */
	public int getSirina() {
	return sirina;
	}
	/**
	 * Metoda za unos sirine gume
	 * @param sirina sirina gume koja se unosi
	 * @throws RuntimeException u slucaju unete sirine manje od 135 ili vece od 355
	 */
	public void setSirina(int sirina) {
	if (sirina < 135 || sirina > 355)
	throw new RuntimeException("Sirina van opsega");
	this.sirina = sirina;
	}
	/**
	 * 
	 * @return visinu gume
	 */
	public int getVisina() {
	return visina;
	}
	/**
	 * Metoda za unos visine gume
	 * @param visina visina gume koja se unosi
	 * @throws RuntimeException u slucaju unete visine manje od 25 ili vece od 95
	 */
	public void setVisina(int visina) {
	if (visina < 25 || visina > 95)
	throw new RuntimeException("Visina van opsega");
	this.visina = visina;
	}
	/**
	 * @return sve karakteristike gume u jednom stringu
	 */
	@Override
	public String toString() {
	return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik +
	", sirina=" + sirina + ", visina=" + visina + "]";
	}
	/**
	 * Uporedjuje vrednosti dve gume
	 * @return true ukoliko su dve gume iste, false ukoliko su dve gume razlicite</ln>
	 */
	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	AutoGuma other = (AutoGuma) obj;
	if (markaModel == null) {
	if (other.markaModel != null)
	return false;
	} else if (!markaModel.equals(other.markaModel))
	return false;
	if (precnik != other.precnik)
	return false;
	if (sirina != other.sirina)
	return false;
	if (visina != other.visina)
	return false;
	return true;
	}

}
