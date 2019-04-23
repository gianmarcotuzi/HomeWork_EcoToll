
public class Veicolo {

	private String modello;
	private String marca;
	private int anno;
	private String targa;
	private int assi;
	private double peso;
	private double altezza;
	private TipoDiVeicolo classe;
	
	
												//COSTRUTTORE
	
	public Veicolo (String model, String brand, int year, String vehicleregistrationnumber, 
			        int axes, double weight, double height, TipoDiVeicolo type) {
		
		this.modello = model;
		this.marca = brand;
		this.anno = year;
		this.targa = vehicleregistrationnumber;
		this.assi = axes;
		this.peso = weight;
		this.altezza = height;
		this.classe = type;
	}
	
												// METODI GET
	
	public String getModello() {
		return this.modello;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public int getAnno() {
		return this.anno;
	}
	
	public String getTarga() {
		return this.targa;
	}
	
	public int getAssi() {
		return this.assi;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public double getAltezza() {
		return this.altezza;
	}
	
	public TipoDiVeicolo getClasse() {
		return this.classe;
	}
	
												//METODI SET
	
	public void setModello(String nuovomodello) {
		this.modello = nuovomodello;
	}
	
	public void setMarca(String nuovamarca) {
		this.marca = nuovamarca;
	}
	
	public void setAnno(int nuovoanno) {
		this.anno = nuovoanno;
	}
	
	public void setTarga(String nuovatarga) {
		this.targa = nuovatarga;
	}
	
	public void setAssi(int nuovoasse) {
		this.assi = nuovoasse;
	}
	
	public void setPeso(double nuovopeso) {
		this.peso = nuovopeso;
	}
	
	public void setAltezza(double nuovaaltezza) {
		this.altezza = nuovaaltezza;
	}
	
	public void setClasse(TipoDiVeicolo nuovotipodiveicolo) {
		this.classe = nuovotipodiveicolo;
	} 
}
