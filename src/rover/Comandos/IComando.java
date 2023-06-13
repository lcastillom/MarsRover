package rover.Comandos;

import rover.Coordenada;

public interface IComando {
	char getInstruccion();	
	Coordenada Ejecutar (Coordenada actual);
}
