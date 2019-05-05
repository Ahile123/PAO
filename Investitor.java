public class Investitor {
	protected String nume;
	protected String prenume;
	protected int suma_investita;
	public Investitor(String nume, String prenume, int suma_investita, Organizatie organizatie) {
		this.nume = nume;        
		this.prenume = prenume;  
		this.suma_investita = suma_investita;
	}
	
	public String getNume() {
		return this.nume;
	}
			 
	public String getPrenume() {
		return this.prenume;
	}
};
