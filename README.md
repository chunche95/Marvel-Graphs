<h1>Proyecto de estructuras de datos no lineales: Grafos</h1>
<pre>
Análisis de colaboraciones entre personajes del universo Marvel
<h2>Descripción</h2>
<p>
El estudio de los sistemas en red es en la actualidad un tema de tremendo interés y vitalidad1. 
Este interés está asociado al nacimiento de un nuevo campo de conocimiento conocido como Complex Networks/Network Science o Redes Complejas/Ciencia de Redes
donde las redes consideradas pueden ser sociales, económicas, metabólicas, genéticas, de comunicaciones, epidemiológicas, o ecológicas, entre otras. En este trabajo, se utilizará una
red de relaciones para aplicar los conceptos vistos en clase sobre el Tipo Abstracto de Datos Grafo, así como para ilustrar el tipo de estudios que es posible realizar sobre los sistemas
en red.
En el sitio web https://github.com/melaniewalsh/sample-social-networkdatasets/tree/master/sample-datasets/marvel se encuentra un fichero en formato CSV
(marvel-unimodal-edges.csv) que representa una red de relaciones entre personajes de la editorial Marvel1. 
En cada línea del fichero, además de los nombres de dos personajes relacionados, se indica mediante un número entero positivo el número de interacciones que estos han tenido. 
El objetivo de este trabajo es diseñar e implementar un programa en Java que procese el fichero indicado y realice las siguientes tareas:

a) Construir el grafo correspondiente y mostrar el número de personajes, el número total de relaciones entre personajes, el personaje más sociable (el que tiene más
relaciones con otros) y el personaje que menos trabaja en equipo (el que tiene menos interacciones con el resto). En los dos últimos casos, si hay más de un
personaje que cumpla la condición se mostrarán todos ellos.

b) Determinar la secuencia más corta de personajes que conecte a dos personajes dados (leídos por teclado).

c) Diseñar un equipo de personajes formado a partir de dos personajes dados (leídos por teclado). Para que sea original, se utilizarán personajes que hayan tenido pocas
interacciones entre ellos. De esta forma, para configurar el equipo se calculará una secuencia cualquiera de personajes que conecte a esos dos teniendo en cuenta que
el número de interacciones entre personajes en el camino no sea superior a 10. Si no existe ninguna secuencia de personajes con esas características deberá indicarse.
</p>
<h2>ESTRUCTURA DE DATOS CURSO 2022/23</h2>
<p>
FCCSS-Grado en Ingeniería Informática-Talavera de la Reina 2
Requisitos del trabajo
• En el apartado c) es obligatorio utilizar el recorrido DFS.
• Se valorará que la búsqueda de caminos se pueda repetir a indicación del usuario.
• Se usará la implementación de Grafos proporcionada en la asignatura.
• Se utilizará el patrón Elemento Decorado visto en clase para decorar o recoger el conjunto de atributos técnicos relacionados con la manipulación y recorrido de grafos, 
el cual deberá basarse en el uso de tipos de datos genéricos.
</p>