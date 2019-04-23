
public class Autostrada {

	private Tariffa tariffa;
	private Casello[] caselli;

	public Autostrada (Tariffa tariffa, Casello[] caselli) {
		
		this.tariffa = tariffa;
		this.caselli = caselli;
	}
	
	public Tariffa getTariffa() {
		return tariffa;
	}
	
	public Casello[] getCaselli() {
		return this.caselli;
	}

}