public class Salariu {
	protected double salariu_brut;
	protected double salariu_net;
	
	Salariu(double salariu_net) {
		this.salariu_net = salariu_net;
		this.salariu_brut = salariu_net + salariu_net * 35 / 100;
	}
	
	public double Salariu_anual_brut() {
		return this.salariu_brut * 12;
		
	}
	
};
