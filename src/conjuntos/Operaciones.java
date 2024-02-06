package conjuntos;

import java.util.HashSet;
import java.util.Set;
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

    public static String union(String conjuntoA, String conjuntoB) {
        Set<Character> conjuntoUnion = new HashSet<>();

        // Agregar elementos de conjuntoA al conjuntoUnion
        for (char elemento : conjuntoA.toCharArray()) {
            conjuntoUnion.add(elemento);
        }

        // Agregar elementos de conjuntoB al conjuntoUnion
        for (char elemento : conjuntoB.toCharArray()) {
            conjuntoUnion.add(elemento);
        }

        // Crear una cadena con los elementos de conjuntoUnion
        StringBuilder resultado = new StringBuilder();
        for (char elemento : conjuntoUnion) {
            resultado.append(elemento);
        }

        return resultado.toString();
    }

    public static String interseccion(String conjuntoA, String conjuntoB) {
        Set<Character> conjuntoInterseccion = new HashSet<>();

        // Crear conjuntos para A y B
        Set<Character> setA = new HashSet<>();
        Set<Character> setB = new HashSet<>();

        // Agregar elementos de conjuntoA al setA
        for (char elemento : conjuntoA.toCharArray()) {
            setA.add(elemento);
        }

        // Agregar elementos de conjuntoB al setB
        for (char elemento : conjuntoB.toCharArray()) {
            setB.add(elemento);
        }

        // Obtener la intersección de A y B
        for (char elemento : setA) {
            if (setB.contains(elemento)) {
                conjuntoInterseccion.add(elemento);
            }
        }

        // Crear una cadena con los elementos de conjuntoInterseccion
        StringBuilder resultado = new StringBuilder();
        for (char elemento : conjuntoInterseccion) {
            resultado.append(elemento);
        }

        return resultado.toString();
    }

    public static String diferenciaSimetrica(String conjuntoA, String conjuntoB) {
        Set<Character> universo = new HashSet<>();

        for (char letra : conjuntoA.toCharArray()) {
            universo.add(letra);
        }
        for (char letra : conjuntoB.toCharArray()) {
            universo.add(letra);
        }

        StringBuilder resultado = new StringBuilder();
        for (char letra : universo) {
            resultado.append(letra);
        }

        return complemento(interseccion(conjuntoA, conjuntoB), resultado.toString());
    }

    public static String diferencia(String conjuntoA, String conjuntoB) {
        Set<Character> conjuntoDiferencia = new HashSet<>();

        // Crear conjuntos para A y B
        Set<Character> setA = new HashSet<>();
        Set<Character> setB = new HashSet<>();

        // Agregar elementos de conjuntoA al setA
        for (char elemento : conjuntoA.toCharArray()) {
            setA.add(elemento);
        }

        // Agregar elementos de conjuntoB al setB
        for (char elemento : conjuntoB.toCharArray()) {
            setB.add(elemento);
        }

        // Obtener la diferencia de A - B
        for (char elemento : setA) {
            if (!setB.contains(elemento)) {
                conjuntoDiferencia.add(elemento);
            }
        }

        // Crear una cadena con los elementos de conjuntoDiferencia
        StringBuilder resultado = new StringBuilder();
        for (char elemento : conjuntoDiferencia) {
            resultado.append(elemento);
        }

        return resultado.toString();
    }

    public static String complemento(String conjunto, String universo) {
        Set<Character> setConjunto = new HashSet<>();
        Set<Character> setUniverso = new HashSet<>();

        // Agregar elementos de conjunto al setConjunto
        for (char elemento : conjunto.toCharArray()) {
            setConjunto.add(elemento);
        }

        // Agregar elementos de universo al setUniverso
        for (char elemento : universo.toCharArray()) {
            setUniverso.add(elemento);
        }

        // Obtener el complemento de conjunto con respecto a universo
        Set<Character> conjuntoComplemento = new HashSet<>(setUniverso);
        conjuntoComplemento.removeAll(setConjunto);

        // Crear una cadena con los elementos de conjuntoComplemento
        StringBuilder resultado = new StringBuilder();
        for (char elemento : conjuntoComplemento) {
            resultado.append(elemento);
        }

        return resultado.toString();
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

}
