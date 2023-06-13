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
	
	public void ProcesoDeInstrucciones(String instrucciones) {
		for(int i = 0; i < instrucciones.length(); i++) {
			char instruccion = instrucciones.charAt(i);
						
			for(int j = 0; j < comandos.length; j++) {
				if (comandos[j].getInstruccion() == instruccion) {
					Coordenada nueva = comandos[j].Ejecutar(posicionActual);
					
				}
			}
		}
	}
}