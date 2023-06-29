
package entidad;

import app.Perro;
import app.Persona;
import java.util.ArrayList;

public class App {
    
/**
 *  Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
    clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
    atributos: nombre, apellido, edad, documento y Perro.
    Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
    pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
    la clase Persona, la información del Perro y de la Persona.
 */

    public static void main(String[] args) {
        
        //creamos un arraylist de tipo Perro
        ArrayList<Perro> perro = new ArrayList();
        
        //adicionamos dos OBJ de tipo perro al arraylist
        perro.add(new Perro("Misky", "Peruana", 3, "mediano"));                
        perro.add(new Perro("Amaru", "Chusco", 23, "grande"));
        
        //creamos un arraylist de tipo Persona
        ArrayList<Persona> persona = new ArrayList();
        
        //adicionamos dos OBJ de tipo persona al arraylist
        persona.add(new Persona("Juan", "Vilchez", 40, "42759062", null));
        persona.add(new Persona("Luciano", "Moris", 32, "17829346", null));
        
        //al arraylist de persona adicionaos 
        int i = 0;
        for(Persona per: persona){
            per.setPerro(perro.get(i));
            i++;
        }
        
        //mostramos Persona
        for(Persona per: persona){
            System.out.println(per.toString());
        }
    }
    
}
