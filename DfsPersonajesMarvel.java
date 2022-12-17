
public class DfsPersonajesMarvel {
	
	/**
	 * Se pide leer por teclado dos personajes que se encuentren en el .csv
	 * Calcular el camino de personajes dados por teclado anteriormente
	 * siempre que el numero de caminos  no sea superior 9 personajes 
	 * Si no existe ninguna secuencia de personajes con esas características deberá indicarse
	 * Se pide Repetir la busqueda si se el usario quiere.
	 * @author barreiro Luis Miguel
	 * @param g
	 * @param v
	 * @param z
	 * @param sp
	 * @return
	 */
	// ALGORITMO DFS OBLIGATORIO 
	// Leer por teclado dos personajes 
	// Calcular camino de personajes dados anteriormente por teclado ,
	// siempre que el numero de caminos  no sea superior 9 personajes 
	// Si no existe ninguna secuencia de personajes con esas características deberá indicarse
	
	// IMPORTANTE: PREGUNTAR SI SE QUIERE REPETIR LA BUSQUEDA 
	
	/**
	 * Creamos un metodo que devuelve si los vertices correspondientes a los personajes de marvel
	 * son iguales, es decir si hemos llegado al final del camino DFS
	 * Para ello creamos el metodo y pasamos el grafo , vertice inicial v y el vertice final z y
	 * una estructura de  datos pila para ir almacenando los vertices visitados
	 * 
	 * comenzamos el primer elemento que sera v lo ponemos como visitado, y como es busqueda profundidad va ir visitando
	 * hijos adyacentes , por tanto comenzamos recorriendo el grafo con un iterador, con la condicion que mientras it.next que exista
	 * y sea noFinal 
	 * Recorrer el grafo y nos encontramos e introduce  los elementos de los vertices visitados , mediante la sp.push, siempre que no haya mas de 10
	 * interaciones 
	 * 
	 * @param v
	 * @param z
	 * @param sp
	 * @return
	 */
	
	public static boolean PathDFS(Graph<V, E> g,vertex<DecoratedElementTraversal>v,
										  vertex<DecoratedElementTraversal>z,
										  Stack<Edge>sp) {
		boolean noFinal=!v.equals(z);
		Edge e;
		iterator<Edge<decoratedElementTraversal>it
		Vertex<decoratedElementTraversal>w;
		
		v.getElement().setVisited(true);
		it=g.incidentEdges(v);
		while (it.hasNext() && noFinal) {
			e = it.next();
			w = g.opposite(v, e);
			if (!w.getElement().getVisited() && e.getElement().getElement() <= 9) {
				sp.push(e);
				noFinal = pathDFS(g, w, z, sp);
				if (noFinal)
					sp.pop();
			}
		}
		return noFinal;  
		
		
		
	}
	
	public static void PrintGraph (Graph gr) {
		Vertex [] v;
	    Iterator<Edge> ite;
	    System.out.println("Graph");
	    ite = gr.getEdges();
	    while (ite.hasNext()) {
	      v = gr.endVertices(ite.next());
	      System.out.print(v[0].getElement().toString());
	      System.out.print("-" + v[1].getElement().toString() + "//");
	    }
	}
	
}
