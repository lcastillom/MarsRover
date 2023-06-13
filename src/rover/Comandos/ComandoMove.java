package rover.Comandos;

import rover.Coordenada;

public class ComandoMove implements IComando {

	@Override
	public char getInstruccion() {
		return 'M';
	}

	@Override
	public Coordenada Ejecutar(Coordenada actual) {
		switch(actual.getZ()) {
		case 'N':
			return new Coordenada(actual.getX(), actual.getY() + 1, actual.getZ());
		case 'W':
			return new Coordenada(actual.getX() - 1, actual.getY(), actual.getZ());
		case 'S':
			return new Coordenada(actual.getX(), actual.getY() - 1, actual.getZ());
		default:
			// actual.getZ es E
			return new Coordenada(actual.getX() + 1, actual.getY(), actual.getZ());
		}
	}

}
