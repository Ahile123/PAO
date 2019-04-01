import java.util.Scanner;


public class Main {
	public static Organizatie org;
	public static Departament dept[];
	
	public static void main(java.lang.String[] args) {
	   Angajat angajat;
	   Manager manager;
	 
	   org = new Organizatie(2);
	   dept = org.departamente;
	   
	   angajat = new Angajat("Marius", "Constantin", 10, org);
	   manager = new Manager(angajat, org);
	   
	   dept[0] = new Departament("HR", org, manager, 1);
	   
	   angajat = new Angajat("Andrei", "Marian", 10, org);
	   manager = new Manager(angajat, org);
	   dept[1] = new Departament("PR", org, manager, 1);
	   
	}
}

//1. structura unei organizații (angajați, relații ierarhice, salarii)
// 10 acțiuni - Numar_Angajati, Venituri_Lunare, Lista_departamente, Lista_Subordonati, Nr_Taskuri, numar_ore_lucrate ...
// 8 tipuri de obiecte - Angajat, Director, Investitor, Salariu_total, Salariu_net, Manager, Departament, Subordornat, Organizatie. 