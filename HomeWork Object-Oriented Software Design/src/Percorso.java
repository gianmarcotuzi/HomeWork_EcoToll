
public class Percorso {

	private Casello partenza;
	private Casello arrivo;
	private Veicolo veicolo;

	public Percorso(Casello part, Casello arr, Veicolo veicolo) { 
		
		if (part.getAutostrada() == arr.getAutostrada()) {
			
			this.partenza = part;
			this.arrivo = arr;
			this.veicolo = veicolo;
		}
		else {
			this.partenza = part;
			this.arrivo = part;
			this.veicolo = veicolo;
			
			// TBD:  lanciare un'eccezione.
		}
			
	}
	
	public double getKmPercorsi() { // km percorsi da un punto di partenza e un punto di arrivo
		
		double kmpercorsi = 0;
		
		kmpercorsi = this.arrivo.getKm() - this.partenza.getKm();
			
		return kmpercorsi;
	}
	
	public Casello getPartenza() {
		return this.partenza;
	}
	
	public Casello getArrivo() {
		return this.arrivo;
	}
	
	public Veicolo getVeicolo() {
		return this.veicolo;
	}
	
	public double CalcolaPedaggio() { // il pedaggio è il prodotto dei km percorsi relativi 
		                              // a ogni corrispondenza
	
		//Un percorso può contenere solo caselli della stessa autostrada!
		
		Autostrada autostrada;
		Tariffa tariffa;
		TipoDiVeicolo classe;
		double pedaggio;
		double costounitario;
		double distanza;
		
		distanza = this.getKmPercorsi();
		autostrada = partenza.getAutostrada();
		tariffa = autostrada.getTariffa();
		classe = veicolo.getClasse();
	    costounitario = tariffa.calcolaTariffa(classe);
				
		pedaggio = distanza * costounitario;
	
		return pedaggio;
	}

}
