package rover;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Cuadricula pruebaCuadricula = new Cuadricula(5,8);
			
			System.out.println("Max X es igual a " +  pruebaCuadricula.getMaxX());
			System.out.println("Max Y es igual a " +  pruebaCuadricula.getMaxY());
			
			Coordenada pruebaCoordenada = new Coordenada(8,9,'i');
		
					
			pruebaCuadricula.EsCoordenadaValida(pruebaCoordenada);
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
