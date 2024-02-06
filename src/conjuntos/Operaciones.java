package conjuntos;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operaciones {

    public static Vector<Vector<String>> obtenerLenguajes(String cadena) {
        Vector<Vector<String>> lenguajes = new Vector<>();

        // Patrón para encontrar cada conjunto dentro de las llaves
        Pattern patronConjunto = Pattern.compile("\\{(.*?)\\}");

        // Matcher para encontrar coincidencias en la cadena
        Matcher matcher = patronConjunto.matcher(cadena);

        // Iterar sobre las coincidencias
        while (matcher.find()) {
            // Obtener el contenido dentro de las llaves
            String contenido = matcher.group(1);

            // Dividir el contenido por comas y espacios
            String[] elementos = contenido.split(",\\s*");

            // Convertir el array de elementos a un vector
            Vector<String> conjunto = new Vector<>();
            for (String elemento : elementos) {
                conjunto.add(elemento);
            }

            // Agregar el vector al vector principal
            lenguajes.add(conjunto);
        }

        return lenguajes;
    }

    public static Vector<String> union(Vector<String> conjuntoA, Vector<String> conjuntoB) {
        // Utilizar un conjunto para garantizar la unicidad de elementos
        Set<String> unionSet = new HashSet<>();

        for (String elemento : conjuntoA) {
            unionSet.add(elemento);
        }

        for (String elemento : conjuntoB) {
            unionSet.add(elemento);
        }

        // Convertir el conjunto a un vector antes de devolverlo
        return new Vector<>(unionSet);
    }

    public static Vector<String> interseccion(Vector<String> conjuntoA, Vector<String> conjuntoB) {
        Vector<String> interseccion = new Vector<>();

        for (String elemento : conjuntoA) {
            if (!conjuntoB.contains(elemento)) {
                interseccion.add(elemento);
            }
        }

        for (String elemento : conjuntoB) {
            if (!conjuntoA.contains(elemento)) {
                interseccion.add(elemento);
            }
        }

        return interseccion;
    }

    public static Vector<String> diferenciaSimetrica(Vector<String> conjuntoA, Vector<String> conjuntoB) {
        Vector<String> diferenciaSimetrica = new Vector<>();

        for (String elemento : conjuntoA) {
            if (conjuntoB.contains(elemento)) {
                diferenciaSimetrica.add(elemento);
            }
        }

        for (String elemento : conjuntoB) {
            if (conjuntoA.contains(elemento) && !diferenciaSimetrica.contains(elemento)) {
                diferenciaSimetrica.add(elemento);
            }
        }

        return diferenciaSimetrica;
    }

    public static Vector<String> diferencia(Vector<String> conjuntoA, Vector<String> conjuntoB) {
        for (String elemento : conjuntoB) {
            conjuntoA.removeElement(elemento);
        }

        return conjuntoA;
    }

    public static Vector<String> complemento(Vector<String> conjunto, Vector<String> universo) {
        // Convertir el universo y el conjunto a conjuntos (Set) para facilitar la operación de complemento
        Set<String> conjuntoUniverso = new HashSet<>(universo);
        Set<String> conjuntoConjunto = new HashSet<>(conjunto);

        // Calcular el complemento como la diferencia entre el conjuntoUniverso y el conjuntoConjunto
        conjuntoUniverso.removeAll(conjuntoConjunto);

        // Convertir el resultado de nuevo a un Vector antes de devolverlo
        return new Vector<>(conjuntoUniverso);
    }

    public static Vector<String> obtenerUniverso(Vector<Vector<String>> conjuntos) {
        // Utilizar un conjunto para garantizar la unicidad de elementos
        Set<String> universoSet = new HashSet<>();

        // Iterar sobre cada conjunto en los conjuntos
        for (Vector<String> conjunto : conjuntos) {
            // Agregar todos los elementos del conjunto al conjunto de universo
            for (String elemento : conjunto) {
                for (char simbolo : elemento.toCharArray()) {
                    String s = "";
                    s += simbolo;
                    universoSet.add(s);
                }
            }
        }

        // Convertir el conjunto a un vector antes de devolverlo
        return new Vector<>(universoSet);
    }

    public static boolean validarParentesis(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char caracter : expresion.toCharArray()) {
            if (caracter == '(') {
                pila.push(caracter);
            } else if (caracter == ')') {
                if (pila.isEmpty() || pila.pop() != '(') {
                    // Se encontró un paréntesis cerrado sin un paréntesis correspondiente abierto
                    return false;
                }
            }
        }

        // La expresión es válida si la pila está vacía al final
        return pila.isEmpty();
    }

    public static boolean validarCorchetes(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char caracter : expresion.toCharArray()) {
            if (caracter == '{') {
                pila.push(caracter);
            } else if (caracter == '}') {
                if (pila.isEmpty() || pila.pop() != '{') {
                    // Se encontró un paréntesis cerrado sin un paréntesis correspondiente abierto
                    return false;
                }
            }
        }

        // La expresión es válida si la pila está vacía al final
        return pila.isEmpty();
    }

}
