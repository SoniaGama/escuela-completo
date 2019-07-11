package com.escuela;

public enum MenuPrincipal {
	
	ADD("Añadir la nacionalidad de un nuevo alumno"),
	NUMERO_ALUMNOS("Ver el numero de alumnos por nacionalidad"),
	NO_ALUMNOS_NACIONALIDAD("Ver el numero de alumnos de una nacionalidad"),
	NACIONALIDADES("Ver las nacionalidades de la escuela"),
	BORRAR("Borra una nacionalidad"),
	SALIR("Salir");
	
	private String menu;

	private MenuPrincipal(String menu){		
		this.menu = menu;
	}

	public String getMenu() {
		return menu;
	}

	/*"Que desea hacer: \n" 
				+ " 1: Añadir la nacionalidad de un nuevo alumno \n "
				+ "2: Ver el numero de alumnos por nacionalidad \n "
				+ "3: Ver el numero de alumnos de una nacionalidad \n " 
				+ "4: Ver las nacionalidades de la escuela \n "
				+ "5: Borra una nacionalidad \n" 
				+ "6: Salir"*/
}
