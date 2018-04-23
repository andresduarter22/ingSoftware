package abstracto;

import intefaz.Carne;
import intefaz.Hawaiana;
import intefaz.Tradicional;

public class FactoryPizza {
	public static Pizza make(String type) {
		
	
		Pizza pizza ;
		
		switch(type) {
		case "carne":
			pizza= new Carne();
		break;
		case "hawaiana":
			pizza = new Hawaiana();
		break;
		case "tradicional":
			pizza = new Tradicional();
		break;
		}
		return pizza;
		
	}

}
