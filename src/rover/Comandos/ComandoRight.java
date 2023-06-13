package rover.Comandos;

import rover.Coordenada;

public class ComandoRight implements IComando {

	@Override
	public char getInstruccion() {
		return 'R';
	}

	@Override
	public Coordenada Ejecutar(Coordenada actual) {
		switch(actual.getZ()) {
		case 'N':
			return new Coordenada(actual.getX(), actual.getY(), 'E');
		case 'W':
			return new Coordenada(actual.getX(), actual.getY(), 'N');
		case 'S':
			return new Coordenada(actual.getX(), actual.getY(), 'W');
		default:
			// actual.getZ es E
			return new Coordenada(actual.getX(), actual.getY(), 'S');
		}
	}

}
