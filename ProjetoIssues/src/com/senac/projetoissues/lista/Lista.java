package com.senac.projetoissues.lista;

public class Lista <T> {

	private Nodo <T> tail;
	private Nodo <T> head;
	
	
	private boolean Vazia() {
		if(head == null){
			return true;
		}else{
			return false;
		}		
	}
	
	

	public void adicionar(T valor) {
		Nodo<T> novo = new Nodo<T>(valor);
		if ( Vazia() ) {
			this.head = novo;
			this.tail = novo;
		}
		else {
			Nodo<T> nodo = procuraProximo(valor);

			if ( nodo != null ) {
				Nodo<T> nodoAnte = nodo.getAnterior();
				Nodo<T> nodoProx = nodo;

				novo.setProximo(nodoProx);
				novo.setAnterior(nodoAnte);

				if ( nodoAnte != null )
					nodoAnte.setProximo(novo);
				else
					this.head = novo;

				nodoProx.setAnterior(novo);	
			}
			else {
				Nodo<T> nodoAnte = tail;
				Nodo<T> nodoProx = null;

				novo.setProximo(nodoProx);
				novo.setAnterior(nodoAnte);

				tail.setProximo(novo);
				tail = novo;
			}

		}
	}
	private Nodo<T> procuraProximo(T valor) {
		
				return null;
	}
	
	public Nodo<T> getTail() {
		return tail;
	}

	public Nodo getHead() {

	return head;
	}

}
