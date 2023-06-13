package rover;

import rover.Comandos.*;

public class Prueba {

	public static void main(String[] args) {		
		try {
			Cuadricula cuadricula = new Cuadricula(5,5);
			IComando[] comandos = new IComando[] 
			{
				new ComandoLeft(),
				new ComandoMove(),
				new ComandoRight()
			};
			Coordenada actual = new Coordenada(1,2,'N');
			
			Rover rover = new Rover(cuadricula, actual, comandos);			
			rover.ProcesoDeInstrucciones("LMLMLMLMM");
			
			System.out.println(rover.getPosicion());
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
