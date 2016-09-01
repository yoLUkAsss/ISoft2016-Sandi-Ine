package src.elements

import java.util.List
import src.excepciones.InsercionDePiezaInvalidaException

class Tablero {

	
	List<Celda> celdas;
	


	new(){
		celdas = newArrayList
		for(int i: 1..9){
			celdas.add(new Celda)
		}
	}



	def celdas() {
		this.celdas
	}

	def colocarPieza(Pieza piezaAColocar, Integer posicion) throws InsercionDePiezaInvalidaException{
		var a =celdas.get(posicion)
		if (a.getPieza == (Pieza.NIL)) {
			a.setPieza(piezaAColocar)
		} else {
			throw new InsercionDePiezaInvalidaException("No es posible reemplazar una celda con pieza ya colocada")
		}
	}
	
	def piezaEnPisicion(Integer posicion){
		var a = celdas.get(posicion)
		a.getPieza();
	}
	
	def hayJugadaGanadora(){
		
	}
}


