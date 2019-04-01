public class Subordonat extends Angajat {
  public Departament dep;
 
  public Subordonat(Angajat angajat, Organizatie organizatie, Departament departament) {
    super(angajat.nume, angajat.prenume, 10, organizatie);  
    this.dep = departament;   
  }
 
  public void executaSarcina(int numarOre) {
    System.out.println( nume + " " + prenume + "a executat sarcina in " + numarOre + " ore");  
  }
}