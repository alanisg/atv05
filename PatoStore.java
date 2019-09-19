package atv05;

public abstract class PatoStore {
	public final Pato PatoStore(String type) {
		Pato pato = creatPato(type);
		pato.voar();
		pato.quack();
		return pato;
	}
	
	public abstract Pato creatPato (String type); 
}
