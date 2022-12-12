package DataManager;

/**
 * CLASE INTERFACEDATAMANAGER.
 * <p>
 * Clase que responde a:
 * ¿Qué se debe hacer? y no al ¿cómo hacerlo?
 * Además de contener las constantes del programa y los mensajes estáticos del mismo. Haciendo mas facil el realizar
 * cambios en los mismos.
 * </p>
 */
public interface InterfaceDataManager {
    /** ++++++++++++++++++++++++++++++++++++++++++++++
     *          CONSTANTES DEL PROGRAMA
     *  ++++++++++++++++++++++++++++++++++++++++++++++
     *
     * Constantes que nos sirven para todo el programa, cambiando su valor, se aplicara sobre todo el programa.
     */
    static final String SEPARADOR = ",";

    static final String RUTA = "F:\\UCLM\\2do\\Estructura de Datos\\practicas\\Grafos\\Grafos\\src\\main\\java\\Data\\data.csv";

    /** ++++++++++++++++++++++++++++++++++++++++++++++
     *              MENSAJES DEL PROGRAMA.
     *  ++++++++++++++++++++++++++++++++++++++++++++++
     *
     *  Se toma como opcion para tener centralizados todos los menus y submenus del programa.
     *  Creo que es una buena idea, para tener que venir aqui, hacer los cambios y se apliquen en todos sitios, ademas,
     *  evitamos perder tiempo en buscar en las diferentes clases del programa.
     */
    static final String PRINCIPAL = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>> \n " +
        "<<     MENU PRINCIPAL DEL MARVEL UCLM.     >>\n" +
        "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>> \n " +
        "\n" +
        "Opciones:\n" +
        "1) Grafo correspondiente. \n" +
        "2) Secuencia mas corta entre dos personajes. \n" +
        "3) Diseñar equipo. \n" +
        "4) Finalizar el programa. \n";
    static final String APARTADOA = "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>> \n " +
            "<<    BIENVENIDO AL SUBMENU DE MARVEL EN LA UCLM    >> \n" +
            "<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>> \n" +
            "\t\t\t\t\t\t\t\t · \n" +
            "Seleccione una de las siguientes opciones disponibles: \n" +
            " 1. Mostrar numero de personajes \n" +
            " 2. Numero de interacciones entre personajes. \n" +
            " 3. Personaje más sociable. \n" +
            " 4. Personaje menos trabajador en equipo. \n" +
            " 5. Salir del programa. \n";

    static final String FINPROGRAMA = "Gracias por usar MARVEL EN LA UCLM. \n Y recuerda! \n\t Wakanda forever. - Black Panther.";
}
