package paulinobermudez.github.io;

import DataManager.*;
import java.io.IOException;
import java.util.ArrayList;
/***
 *  <h1>Análisis de colaboraciones entre personajes del universo Marvel</h1>
 *
 * <h2>Descripción</h2>
 * El estudio de los sistemas en red es en la actualidad un tema de tremendo interés y vitalidad.
 * Este interés está asociado al nacimiento de un nuevo campo de conocimiento conocido como Complex Networks/Network Science o Redes Complejas/Ciencia de Redes
 * donde las redes consideradas pueden ser sociales, económicas, metabólicas, genéticas, de comunicaciones, epidemiológicas, o ecológicas, entre otras. En este trabajo, se utilizará una
 * red de relaciones para aplicar los conceptos vistos en clase sobre el Tipo Abstracto de Datos Grafo, así como para ilustrar el tipo de estudios que es posible realizar sobre los sistemas
 * en red. <br>
 * En el sitio web de github, encontrará <a link="https://github.com/melaniewalsh/sample-social-network-datasets/blob/master/sample-datasets/marvel/marvel-unimodal-edges.csv">Data.CSV</a>,
 * se encuentra un fichero en formato CSV (marvel-unimodal-edges.csv) que representa una red de relaciones entre personajes de la editorial Marvel.
 * En cada línea del fichero, además de los nombres de dos personajes relacionados, se indica mediante un número entero positivo el número de interacciones que estos han tenido.
 * </p>
 */

/**
 * CLASE MAIN.
 *
 * Contiene la funcionalidad principal del programa. Llama a las distintas clases del programa, con sus respectivos metodos, haciendo funcional el programa planteado en el enunciado anterior
 *
 */
public class Main {
    private static ArrayList<String> cleanData; // Datos del CSV listos para trabajar
    private static int opcionSeleccionada; // Opcion seleccionada en el menu de opciones
    public static void main(String[] args) throws IOException {
        /*
         * LECTURA DATOS
         */
        Lectura dataModel =  new Lectura(); // Creamos objeto para una nueva lectura
        /* *******************************************************
         * * --------------------------------------------------- *
         * *            ALMACENAMIENTO DE LOS DATOS              *
         * * --------------------------------------------------- *
         * *******************************************************
         */
        cleanData = dataModel.LeeCSV(); // Lectura del arraylist con los datos de entrada preparados
        System.out.println("Datos cargados...\n\n");

        /* *******************************************************
         * * --------------------------------------------------- *
         * *  MENU PRINCIPAL DEL PROGRAMA + OPCION SELECCIONADA  *
         * * --------------------------------------------------- *
         * *******************************************************
         */

        /**
         * MENU PRINCIPAL.
         * <p>
         *     Contiene las acciones que deben irse realizando, en funcion de la opción seleccionada. <br>
         *     <i>Para +detalles de las opciones, ver la clase @Menus.java</i>
         * </p>
         */
        Menus principal = new Menus(); // Objeto de clase Menu que llama el menu principal del programa.
        Menus apartadoA = new Menus(); // Objeto de clase Menu que llama al submenu -> Apartado a).
        Menus apartadoB = new Menus(); // Objeto de clase Menu que llama al submenu -> Apartado b).
        Menus apartadoC = new Menus(); // Objeto de clase Menu que llama al submenu -> Apartado c).
        Menus apartadoD = new Menus(); // Objeto de clase Menu que llama al submenu -> Apartado d).
        opcionSeleccionada = principal.Principal(); // Almacenamos la opcion seleccionada

        // Evaluamos las opciones disponibles del menu principal

        if (opcionSeleccionada == 1) { /* OPCION A) Grafo correspondiente y mostrar los datos. */
            opcionSeleccionada = apartadoA.ApartadoA(); //
            /* OPCION 1 - MOSTRAR NUMERO DE PERSONAJES */
            apartadoA.Opcion1(cleanData);
            /* OPCION 2 - NUMERO DE INTERACCIONES ENTRE PERSONAJES */
            apartadoA.Opcion2();
            /* OPCION 3 -  PERSONAJE MAS SOCIABLE */
            apartadoA.Opcion3();
            /* OPCION 4 - PERSONAJE MENOS SOCIABLE */
            apartadoA.Opcion4();
            /* OPCION 5 - SALIR DEL PROGRAMA */
            apartadoA.FinDelPrograma();
        } else if (opcionSeleccionada == 2) { /* OPCION B) Secuencia mas corta entre dos personajes conectados */

        } else if (opcionSeleccionada == 3) { /* OPCION C) Diseñar equipo de personajes con pocas interacciones */

        } else if (opcionSeleccionada == 4) { /* OPCION D) Finalizar el programa */
            principal.FinDelPrograma();
        } else {

        }
    }
}