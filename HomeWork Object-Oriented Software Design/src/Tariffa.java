
public abstract class Tariffa {

	private double tariffabase;
	
	public Tariffa() {
		
	}
	

	
	public void setTariffaBase(double nuovatariffabase) {
		this.tariffabase = nuovatariffabase;
	}
	
	public double getTariffaBase() {
		return tariffabase;
	}
	
	public abstract double calcolaTariffa(TipoDiVeicolo tipodiveicolo);
		
		
	
	
}
