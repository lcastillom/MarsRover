package rover.Comandos;

import rover.Coordenada;

public class ComandoLeft implements IComando {

	@Override
	public char getInstruccion() {
		return 'L';
	}

	@Override
	public Coordenada Ejecutar(Coordenada actual) {
		switch(actual.getZ()) {
		case 'N':
			return new Coordenada(actual.getX(), actual.getY(), 'W');
		case 'W':
			return new Coordenada(actual.getX(), actual.getY(), 'S');
		case 'S':
			return new Coordenada(actual.getX(), actual.getY(), 'E');
		default:
			// actual.getZ es E
			return new Coordenada(actual.getX(), actual.getY(), 'N');
		}
	}
}
