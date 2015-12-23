package Builder;

import Modele.Cible;
import Vue.DecorDef;

public class Builder {
	
	private DecorDef decor;
	
	public Builder(DecorDef d){
		decor = d;
	}
	
	public void tour(){
		
		//for(int i=1;i<2;i++){
			Cible c = new Cible(decor);
			c.set_X(decor.getposDep()+100);
			c.set_Y(c.getTaille()/2);
			decor.ajouterCible(c);
			Cible c2 = new Cible(decor);
			c2.set_X(decor.getposDep()+100);
			c2.set_Y(c.getTaille()+c2.getTaille()/2);
			decor.ajouterCible(c2);
			
			
		//}
	}
	
}
