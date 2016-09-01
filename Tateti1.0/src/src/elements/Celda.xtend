package src.elements

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Celda {
	
	
	Pieza pieza
	Integer posicion
	
	new () {
		pieza = Pieza.NIL
	}
	
	
	
	
}