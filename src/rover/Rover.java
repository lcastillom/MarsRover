package rover;

import rover.Comandos.IComando;

public class Rover {
	private Coordenada posicionActual;
	private Cuadricula mapa;
	private IComando[] comandos;
		
	public Rover(Cuadricula mapa, Coordenada posicionActual, IComando[] comandos) {
		this.mapa = mapa;
		this.posicionActual = posicionActual;
		this.comandos = comandos;
	}
	
	public String getPosicion() {
		return posicionActual.toString();
	}
	
	public void ProcesoDeInstrucciones(String instrucciones) throws IllegalArgumentException {
		for(int i = 0; i < instrucciones.length(); i++) {
			char instruccion = instrucciones.charAt(i);				
			instruccion = Character.toUpperCase(instruccion);

			boolean esInstruccionValida = false;
			for(int j = 0; j < comandos.length; j++) {
				if (comandos[j].getInstruccion() == instruccion) {
					Coordenada nuevaCoordenada = comandos[j].Ejecutar(posicionActual);
					
					mapa.EsCoordenadaValida(nuevaCoordenada);
					posicionActual = nuevaCoordenada;
					esInstruccionValida = true;
					break;
				}
			}
			
			if (!esInstruccionValida) {				
				throw new IllegalArgumentException(String.format("La instruccion %c no es valida", instruccion));
			}
		}
	}
}