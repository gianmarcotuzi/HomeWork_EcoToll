
public class Casello {
	
	private double km;
	private Autostrada autostrada;


	public Casello(double chilometri, Autostrada autostrada){
		
		this.km = chilometri;
		this.autostrada = autostrada;
		
	}

	public double getKm() {
		return km;
	}
	
	public Autostrada getAutostrada() {
		return autostrada;
	}
}
