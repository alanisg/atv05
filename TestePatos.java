package atv05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestePatos {

	public static void main(String[] args) {
		List <Pato> pato = new ArrayList <>(); 
		Random gerador = new Random();
		
		for(int i = 0;i<=100; i++) {
			if (gerador.nextBoolean()) {
				pato.add(new Pato_Sul());
			}
			else {
				pato.add(new Pato_Norte());
			}
		}
		for(Pato o : pato) {
			o.voar();
			o.quack();
			System.out.println();
		}
		
	}

}
