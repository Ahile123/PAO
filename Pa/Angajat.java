
public class Angajat {

	protected static int numarAngajati = 0;
	protected int id;
	protected String nume;
	protected String prenume;
	protected Organizatie organizatie; 
	
	public Angajat(String nume, String prenume, double salariu_angajat, Organizatie organizatie) { 
	    this.numarAngajati++; 
	    this.nume = nume;        
	    this.prenume = prenume;  
	    this.id = numarAngajati; 
	}
	 public String getNume() {
	  return this.nume;
	}
		 
	 public String getPrenume() {
		return this.prenume;
	 }
	 public int getID() {
	   return this.id;
	 }
}
	
