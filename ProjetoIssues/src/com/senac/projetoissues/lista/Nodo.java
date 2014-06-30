package com.senac.projetoissues.lista;

public class Nodo<T> {
		private Nodo<T> proximo;
		private Nodo<T> anterior;
		private T valor;

		public Nodo() {
		}

		public Nodo(T valor) {
			this.valor = valor;
		}

		public Nodo<T> getProximo() {
			return proximo;
		}

		public void setProximo(Nodo<T> proximo) {
			this.proximo = proximo;
		}
		
		public Nodo<T> getAnterior() {
			return anterior;
		}

		public void setAnterior(Nodo<T> anterior) {
			this.anterior = anterior;
		}

		public T getValor() {
			return valor;
		}

		public void setValor(T valor) {
			this.valor = valor;
	}

}