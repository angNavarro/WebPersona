/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class PersonaDAO {

    //Metodo para que devuelva todas las personas de la base de datos. 
    public static ArrayList<Persona> getAll() {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Juan", "Flores", 25));
        personas.add(new Persona(2, "Maria", "Garcia", 30));
        personas.add(new Persona(3, "Pedro", "Martinez", 28));
        personas.add(new Persona(4, "Ana", "Sánchez", 35));
        personas.add(new Persona(5, "Carlos", "López", 40));
        personas.add(new Persona(6, "Laura", "Rodríguez", 22));
        personas.add(new Persona(7, "Miguel", "Fernandez", 27));
        personas.add(new Persona(8, "Elena", "Díaz", 33));
        personas.add(new Persona(9, "David", "Flores", 29));
        personas.add(new Persona(10, "Sofía", "Vázquez", 31));
        personas.add(new Persona(11, "Javier", "Jiménez", 26));
        personas.add(new Persona(12, "Carmen", "Ruiz", 38));
        personas.add(new Persona(13, "Alejandro", "Gómez", 34));
        personas.add(new Persona(14, "Isabel", "Torres", 25));
        personas.add(new Persona(15, "Daniel", "Ortega", 23));
        personas.add(new Persona(16, "Lucía", "Flores", 32));
        personas.add(new Persona(17, "Diego", "Ramírez", 36));
        personas.add(new Persona(18, "Patricia", "Navarro", 41));
        personas.add(new Persona(19, "Jorge", "Nernández", 24));
        personas.add(new Persona(20, "Natalia", "Gutierrez", 39));
        return personas;
    }

    //Metodo para que devuelva los que tiene el apellido
    public static ArrayList<Persona> buscarPorApellido(String apellido) {

        ArrayList<Persona> resultado = new ArrayList<>();
        //Foreach para que busque en todas las Persona
        for (Persona persona : getAll()) {

            //metemos upper case para que no distinga entre minusculas y mayusculas el input. 
            if (persona.getApellidos().toUpperCase().contains(apellido.toUpperCase())) {
                //El resultado lo metemos 
                resultado.add(persona);
            }
        }
        return resultado;
    }
}
