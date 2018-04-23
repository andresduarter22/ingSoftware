package intefaz;

public class FactoryPizza {
	
	public static IPizza make(String type) {
		
		IPizza pizza = null;
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
