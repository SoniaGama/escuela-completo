package com.excepciones;


public enum CatalogoExcepciones {
	OPCION_NO_ECONTRADA(1, "No se encontro la opcion"),
	NO_ES_UN_NUMERO(2, "No es un número"), //InputMismatchException
	NUMERO_NO_ENCONTRADO(3, "Número no encontrado"),
	MAS_DE_UN_CARACTER_ESCRITO(4, "Más de un caracter escrito");
	
	
	private int id;
	private String mensaje;
	
	private CatalogoExcepciones(int id, String mensaje) {
		this.id = id;
		this.mensaje = mensaje;
	}

	public int getId() {
		return id;
	}

	public String getMensaje() {
		return mensaje;
	}
	
}
