package rover;

public class Cuadricula {

	
	private int maxX;
	private int maxY;
	private int minX = 0;
	private int minY = 0;
	
	
	public int getMaxX() {
		return maxX;
	}

	public int getMaxY() {
		return maxY;
	}

	public int getMinX() {
		return minX;
	}

	public int getMinY() {
		return minY;
	}

	
	public Cuadricula (int maxX, int maxY) throws IllegalArgumentException {
		if (maxX < 0) {
			throw new IllegalArgumentException("El valor minimo para x es 0");
		}
		if (maxY < 0) {
			throw new IllegalArgumentException("El valor minimo para y es 0");
		}
		
		this.maxX = maxX;
		this.maxY = maxY;
	}
	
	public void EsCoordenadaValida(Coordenada coordenada) throws IllegalArgumentException {
		if (coordenada.getX() > maxX){			
			throw new IllegalArgumentException(String.format("El valor del eje x %d excede el valor maximo %d", coordenada.getX(), maxX));
		}
		if (coordenada.getY() > maxY){
			throw new IllegalArgumentException(String.format("El valor del eje y %d excede el valor maximo %d", coordenada.getY(), maxY));
		}
	}
}
