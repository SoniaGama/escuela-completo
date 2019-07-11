package com.escuela;

import java.util.Map;
import java.util.Scanner;

import com.sun.glass.ui.Menu;

public class ElegirMetodo extends EscuelaMetodos {
	EscuelaMetodos metodos = new EscuelaMetodos();

	//menu principal
	public void menu() {	
		System.out.println("¿Que desea hacer?");
		for(MenuPrincipal menu : MenuPrincipal.values()) {
			System.out.println(menu.ordinal() + ": " + menu.getMenu());
		}
	}
	
	public void queNacionalidad() {
		System.out.println("Que nacionalidad: \n");
		for (Nacionalidades nacionalidades : Nacionalidades.values()) {
			System.out.println("Opción " + nacionalidades.ordinal() + ": " + nacionalidades.getNacionalidad());
			//String nac = nacionalidades.getNacionalidad();
		}		
	}

	public void escogerMetodo(Map<String, Integer> hash) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		boolean salir = false;		
		while (!salir) {
			menu();
			opcion = sc.nextInt();
			switch (opcion) {
			case (0):
				queNacionalidad();
				Scanner sc1 = new Scanner(System.in);
				Integer opcion1 = sc1.nextInt();
				//opcionNacionalidadYMetodo(opcion1);				
				for (Nacionalidades nacionalidades : Nacionalidades.values()) {
					Integer ordinal = nacionalidades.ordinal();
					if (ordinal.equals(opcion1)) {
						addAlumno(hash, nacionalidades.getNacionalidad());
					}
				}				
				break;

			case (1):

				showAll(hash);
				break;

			case (2):
				queNacionalidad();
				Scanner sc2 = new Scanner(System.in);
				Integer opcion2 = sc2.nextInt();
				for (Nacionalidades nacionalidades : Nacionalidades.values()) {
					Integer ordinal = nacionalidades.ordinal();
					if (ordinal.equals(opcion2)) {
						showNacionalidad(hash, nacionalidades.getNacionalidad());
					}
				}
				break;

			case (3):
				cuantos(hash);
				break;

			case (4):
				queNacionalidad();
				Scanner sc3 = new Scanner(System.in);
				Integer opcion3 = sc3.nextInt();
				for (Nacionalidades nacionalidades : Nacionalidades.values()) {
					Integer ordinal = nacionalidades.ordinal();
					if (ordinal.equals(opcion3)) {
						borra(hash, nacionalidades.getNacionalidad());
					}
				}
				break;

			case (5):
				sc.close();
				salir = true;
				break;
			}
		}

	}

}
