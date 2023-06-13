package rover;

public class Coordenada {
	
	private int x;
	private int y;
	private char z;	
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public char getZ() {
		return Character.toUpperCase(z);
	}
	
	public Coordenada (int x, int y, char z) {
		if (x < 0) {
			throw new IllegalArgumentException("El valor minimo para x es 0");
		}
		if (y < 0) {
			throw new IllegalArgumentException("El valor minimo para y es 0");
		}
		if (!(z == 'N' || 
				z == 'n' || 
				z == 'E' || 
				z == 'e' || 
				z == 'S' || 
				z == 's' || 
				z == 'W' || 
				z == 'w' )) {
			throw new IllegalArgumentException("Los valores aceptados solo pueden ser N,n,E,e,S,s,W,w");
		}
		
		this.x = x;
		this.y = y;
		this.z = z;		
	}
	
	@Override
	public String toString() {
		return String.format("[%d, %d, %c]", this.x, this.y, this.z);
	}
}
