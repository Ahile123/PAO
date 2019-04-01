public class Departament {
  private String denumire;
  private int numarSubordonati = 0;
  public Organizatie organizatie;
  public Subordonat sub[];
  public Manager manager;
 
  public Departament(String denumire, Organizatie organizatie, Manager manager, int numarSubordonati) {
   
    this.denumire = denumire;  
    this.organizatie = organizatie;
 
    this.manager = manager;  
    manager.departament = this;
    this.sub = new Subordonat[numarSubordonati];
  
  }
 
  public void angajare(Angajat angajat) {
    sub[numarSubordonati++] = new Subordonat(angajat, organizatie, this);  
  }
  public boolean posturiOcupate() {
    return (numarSubordonati == sub.length);  
  }
}