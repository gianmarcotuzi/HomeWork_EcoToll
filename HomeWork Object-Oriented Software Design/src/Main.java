
public class Main {

	public static void main(String[] args) {
		
		TipoDiVeicolo tipodiveicolo = new TipoB();
		Veicolo veicolo = new Veicolo("Fiesta", "Ford", 2019, "EP430AP", 
									  2, 100, 110, tipodiveicolo);
		
		Tariffa tariffa = new TariffaBase(15.0);
		Casello[] caselli = new Casello[5];
		Autostrada autostrada = new Autostrada(tariffa, caselli);
		Casello casello1 = new Casello(10.0, autostrada);
		Casello casello5 = new Casello(70.0, autostrada);
		Casello casello2 = new Casello(20.0, autostrada);
		Casello casello3 = new Casello(30.0, autostrada);
		Casello casello4 = new Casello(53.0, autostrada);
		caselli[0] = casello1;
		caselli[1] = casello2;
		caselli[2] = casello3;
		caselli[3] = casello4;
		caselli[4] = casello5;
		Percorso percorso = new Percorso(casello2, casello4, veicolo);
	
		double pedaggio = percorso.CalcolaPedaggio();
		
		System.out.println("Il pedaggio calcolato è: " + pedaggio);
	}

}
