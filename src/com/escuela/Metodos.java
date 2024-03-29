package com.escuela;

public enum Metodos {
	/*
	 package com.escuela;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class EscuelaMetodos implements InterfaceEscuela {
	
	//Metodo que inicializa valores en 0 para poder luego incrementar con addAlumno()
	public void init(Map<String, Integer> hash) {
		for(Nacionalidades nacionalidades: Nacionalidades.values()) {
			hash.put(nacionalidades.toString(), 0);
		}
	}
	
	public void queHacer(Map<String, Integer> hash) {
		Scanner sc1 = new Scanner(System.in);
		Integer opcion1 = sc1.nextInt();
		for (Nacionalidades nacionalidades : Nacionalidades.values()) {
			Integer ordinal = nacionalidades.ordinal();
			if (ordinal.equals(opcion1)) {
				addAlumno(hash, nacionalidades.getNacionalidad());
			}
		}
		sc1.close();
	}

	
	@Override
	public void addAlumno(Map<String, Integer> hash, String nacionalidad) {
		//no se puede inicializar en 1 o 0 por que en cada add reinicia el contador	
		//Añade la nacionalidad de un nuevo alumno
		Integer value = hash.get(nacionalidad); 
		if(hash.containsKey(nacionalidad)) {
			value++;
			hash.put(nacionalidad, value);				
		} else {
			System.out.println("Nacionalidad no encontrada");
		}
	}
	

	@Override
	public void showAll(Map<String, Integer> hash) {
		//Muestra el número de alumnos por nacionalidad
		Iterator iterator = hash.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry alumnos = (Map.Entry) iterator.next();			
			System.out.println(alumnos.getKey() + ": " + alumnos.getValue());
		}	
	}

	@Override
	public void showNacionalidad(Map<String, Integer> hash, String nacionalidad) {
		//Muestra el número de alumnos por nacionalidad y alumnos de esa nacionalidad 
		if(hash.containsKey(nacionalidad)) {
			System.out.println(nacionalidad + ": " + hash.get(nacionalidad));
		}else {
			System.out.println("Nacionalidad no encontrada");
		}
	}

	@Override
	public void cuantos(Map<String, Integer> hash) {		
		//Muestra cuantas nacionalidades diferentes hay en la escuela
		Iterator iterator = hash.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry alumnos = (Map.Entry) iterator.next();
			System.out.println(alumnos.getKey());
		}

	}

	@Override
	public void borra(Map<String, Integer> hash, String nacionalidad) {
		//Borra la nacionalidad
		if(hash.containsKey(nacionalidad)) {
			//hash.remove(nacionalidad);
			//Si se borra despues no puede ser aññadida a no ser encontrada como key
			hash.put(nacionalidad, 0);
		}else {
			System.out.println("Nacionalidad no encontrada");
		}		
	}
	
}
	 */
}
