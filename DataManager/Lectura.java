package DataManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import static DataManager.InterfaceDataManager.RUTA;
import static DataManager.InterfaceDataManager.SEPARADOR;

public class Lectura {
    private int pos=-1; // Contador para posicionar el nº de heroes
    private String[] dataHero = null;  // Listado de todos los heroes con datos leidos del fichero CSV
    private ArrayList<String> getHeroes = new ArrayList<>(); // Return con listado listo para trabajar
    String hero; // Linea con el heroe leído del CSV
    FileReader ficheroCSV; // Lectura del fichero
    private BufferedReader br; // Buffer de lectura
    String linea;  // Variable que almacena la línea leída del CSV

    public Lectura() { // Constructor
    }

    public ArrayList<String> LeeCSV() throws IOException { // Metodo lectura CSV
        /**
         * Primero, leeremos los registros por línea usando readLine() en BufferReader.
         * A continuación, dividiremos la linea en tokens según el delimitador coma.
         */
        try {
            ficheroCSV = new FileReader(RUTA); // Ruta en el sistema del fichero de datos
            br = new BufferedReader(ficheroCSV); // Buffer de entrada
            linea = br.readLine(); // Inicio de la lectura del fichero
            while (linea != null ) {
                dataHero = linea.split(SEPARADOR); // Split de la ',' del CSV
                hero = Arrays.toString(dataHero); // Heroe leído
                // System.out.printf("%d ··> %s \n", pos, hero); // Muestra datos leidos
                getHeroes.add(hero);
                linea = br.readLine(); // Lectura de la siguiente línea del CSV
                pos++;
            }
            return getHeroes; // Devolvemos el array con todos los heroes encontrados y sus datos.
        } catch (IOException ex) {
            System.out.println("Fichero no encotrado. \n" +
                    "Por favor, revise la ruta y vuelva a intentarlo de nuevo. \n" +
                    "---------------------------------------------------------- \n" +
                    "La ruta donde debe almacenar el fichero data.CSV es en: ..\\Data\\data.csv");
            return null;
        } finally {
            if (br != null) {
                br.close(); // Cerramos el fichero
            }
        }

    }
}



