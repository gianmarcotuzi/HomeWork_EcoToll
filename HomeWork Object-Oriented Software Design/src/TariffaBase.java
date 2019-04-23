
public class TariffaBase extends Tariffa {

	public TariffaBase(double tariffabase) {
		
		super.setTariffaBase(tariffabase);
	}
	
	
	@Override
	public double calcolaTariffa(TipoDiVeicolo tipodiveicolo) {
		
		double tariffa;
		
		if (tipodiveicolo.getClass()==TipoA.class) 
			tariffa = super.getTariffaBase();
		else if (tipodiveicolo.getClass()==TipoB.class)
			tariffa = super.getTariffaBase();
		else if (tipodiveicolo.getClass()==Tipo3.class)
			tariffa = super.getTariffaBase();
		else if (tipodiveicolo.getClass()==Tipo4.class)	
			tariffa = super.getTariffaBase();
		else if (tipodiveicolo.getClass()==Tipo5.class)
			tariffa = super.getTariffaBase();
		else 
			tariffa = super.getTariffaBase();
			
		
		return tariffa;
	}

}
