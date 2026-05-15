package org.example;
import java.io.InputStream;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Main {

    public static void main(String[] args) throws Exception {

        //creem l'objecte de Jackson >> convertim el JSON a objectes java
        ObjectMapper mapper = new ObjectMapper(); //crear objecte principal de jackson
        /*
        opció 1: ficar-ho dins un string i tractar-ho (JOEL)
        opció 2: busca el fitxer json (persona.json) i el carrega inputStream
         */

        InputStream input = Main.class                  // semblant a properties, guarda els elements de json a input
                .getResourceAsStream("/persona.json");

        //convertir el JSON a objecte de classe persona (lo que recibes se tiene que llamar igual: atributos)
        //jackson mira els camps del JSON del JSON i els assigna automàticament
        Persona p = mapper.readValue(input, Persona.class); //

        System.out.println(p);
    }
}

package org.example;

public class Persona {

    public String nom;
    public int edat;

    @Override
    public String toString() {
        return nom + " - " + edat;
    }
}


