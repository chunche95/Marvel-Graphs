package DataManager;
import java.util.*;
import static DataManager.InterfaceDataManager.*;

/**
 * CLASE MENUS.
 * <p>
 * Clase encargada de contener el menu principal del programa y a los submenus de los mismos. Contiene cada uno de ellos
 * la solicitud de la opcion deseada, son de tipo numerico dicha solicitud, para facilitar el uso del programa.
 * <br>
 * Contenido:
 * * MENUS
 * * PRINCIPAL - Menu principal
 * * Opcion 1. -- Dibujar grafo correspondiente
 *      - APARTADOA - Numero de personajes
 *      - APARTADOB - Numero de interacciones entre dos personajes
 *      - APARTADOC - Personaje mas sociable
 *      - APARTADOD - Personaje menos sociable
 * * Opcion 2. -- Secuencia mas corta entre dos personajes
 * * Opcion 3. -- Diseñar un equipo de personajes
 * * Opcion 4. -- Finalizar el programa
 * </p>
 */
public class Menus {
    public Menus() {}
    public int Principal() {
        int opcion = 0;
        Scanner sc;
        do {
            try {
                System.out.println(PRINCIPAL);
                //sc = new Scanner(System.in);
                opcion = 1; //sc.nextInt();
                switch (opcion) {
                    case 1, 2, 3, 4: {
                        return opcion;
                    }
                    default: {
                        System.out.println("Error: No cumple los valores del menu, del 1 al 5 solo.");
                        System.out.println("");
                        System.out.println("Repetimos...");
                        Principal();
                    }
                }
                return opcion;
            } catch ( InputMismatchException letrasNo ) {
                System.out.println("Introduciste un dato NO NUMERICO. - " + letrasNo );
                Principal();
            } catch (Exception ex ) {
                System.out.println("Error: " + ex);
                Principal();
            }
        } while ( opcion != 4 );
        return opcion;
    }
    // Opcion A)
    public int ApartadoA() {
        int opcion = 0;
        Scanner sc;
        do {
            try {
                System.out.println(APARTADOA);
                //sc = new Scanner(System.in);
                opcion = 1; //sc.nextInt();
                switch (opcion) {
                    case 1, 2, 3, 4, 5: {
                        return opcion;
                    }
                    default: {
                        System.out.println("Error: No cumple los valores del menu, del 1 al 5 solo.");
                        System.out.println("");
                        System.out.println("Repetimos...");
                        ApartadoA();
                    }
                }
                return opcion;
            } catch ( InputMismatchException letrasNo ) {
                System.out.println("Introduciste un dato NO NUMERICO. - " + letrasNo );
                ApartadoA();
            } catch (Exception ex ) {
                System.out.println("Error: " + ex);
                ApartadoA();
            }
        } while ( opcion != 5 );
        return opcion;
    }
    // Opcion 1
    public Object[] Opcion1 (ArrayList<String> cleanData){
        Iterator<String> nombres = cleanData.iterator(); // Recorrido de los nombres con los herores + sus datos
        int index = cleanData.size(); // Tamaño total de datos encontrados
        Object[] sinDuplicados = new Object[index]; // Objeto
        String[] nHero;
        // Queremos el primer nombre y lo guardaremos en nHero
        while (nombres.hasNext()) {
            nHero = nombres.next().split(",");
            sinDuplicados = Arrays.stream(nHero).distinct().toArray(); // Eliminamos duplicados
        }
        return sinDuplicados;
    }
    // Opcion 2
    public void Opcion2() {
    }
    // Opcion 3
    public void Opcion3() {
    }
    // Opcion 4
    public void Opcion4() {
    }

    // Opcion: Finalizar programa
    public void FinDelPrograma() {
        System.out.println(FINPROGRAMA);
        System.exit(0);
    }
}
