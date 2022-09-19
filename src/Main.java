import Classes.Nave;
import Classes.Lanzadera;
import Classes.Tripulada;
import Classes.NoTripulada;

public class Main {

    public static void main(String[] args) {
    	
    	// Naves para testear (Hardcoded)
    	Nave.naves.add(new Lanzadera("Voyager", 10.0, 10.0, 10, 10.0, 10.0, 10.0, 10.0, "NASA", "Solido"));
    	Nave.naves.add(new Lanzadera("Kozmo", 40.0, 50.0, 20, 15.0, 30.0, 33.0, 100.0, "NASA", "Solido"));
    	Nave.naves.add(new Lanzadera("Sputnik", 5.0, 15.0, 8, 18.0, 20.0, 20.0, 10.0, "AEFR", "Liquido"));
    	Nave.naves.add(new Tripulada("Artic1", 10.0, 10.0, 20, 25.0, 25.0, 20, 20.0, "ESA", "Liquido"));
    	Nave.naves.add(new Tripulada("Serafin", 15.0, 15.0, 25, 28.0, 25.0, 30, 20.0, "CSA", "Solido"));
    	Nave.naves.add(new Tripulada("Nautilus", 35.0, 25.0, 25, 28.0, 45.0, 50, 70.0, "CSA", "Liquido"));
    	Nave.naves.add(new NoTripulada("Maximus", 18.0, 25.0, 15, 25.0, 26.0, 30, "", "CSA", "Liquido/solido"));
    	Nave.naves.add(new NoTripulada("Patriot", 38.0, 35.0, 25, 45.0, 36.0, 40, "", "NASA", "Liquido/solido"));
    	Nave.naves.add(new NoTripulada("Messenger", 20.0, 20.0, 35, 45.0, 36.0, 50, "", "NASA", "Liquido/solido"));

        new Views.Menu();

    }

}
