public class Manager extends Angajat {
  public Subordonat subordonati[];
  public Departament departament;
 
  public Manager(Angajat angajat, Organizatie organizatie) {
    super(angajat.nume, angajat.prenume, 10, organizatie);
  }
  public void organizeazaLucrare(int numarZile) {
    this.subordonati = departament.sub;
    int orePePersoana = numarZile * 8 / subordonati.length;
 
    for (int no=0; no < subordonati.length ; no++) {
      subordonati[no].executaSarcina(orePePersoana);
    }  
  }

  public String toString() {
    return (super.toString() + ", Manager de Departament");  
  }
}