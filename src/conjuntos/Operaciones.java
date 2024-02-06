package conjuntos;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class Operaciones {

    public static Vector<String> obtenerLenguajes(String cadena) {
        Vector<String> lenguajes = new Vector<>();

        // Variable para almacenar temporalmente las letras de un lenguaje
        StringBuilder lenguajeActual = new StringBuilder();

        // Bandera para indicar si estamos dentro de un bloque
        boolean dentroDelBloque = false;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (caracter == '{') {
                // Inicio de bloque
                dentroDelBloque = true;
            } else if (caracter == '}') {
                // Fin de bloque
                dentroDelBloque = false;

                // Añadir el lenguaje actual al vector
                lenguajes.add(lenguajeActual.toString());

                // Limpiar el lenguaje actual para el próximo bloque
                lenguajeActual.setLength(0);
            } else if (dentroDelBloque && caracter != ',' && caracter != ' ') {
                // Agregar el caracter al lenguaje actual si estamos dentro de un bloque y no es una coma
                lenguajeActual.append(caracter);
            }
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

    public static String obtenerUniverso(Vector<String> conjuntos) {
        Set<Character> universo = new HashSet<>();

        // Iterar sobre cada conjunto en el vector
        for (String conjunto : conjuntos) {
            // Agregar cada letra del conjunto al conjunto universo
            for (char letra : conjunto.toCharArray()) {
                universo.add(letra);
            }
        }

        // Crear una cadena con los elementos del conjunto universo
        StringBuilder resultado = new StringBuilder();
        for (char letra : universo) {
            resultado.append(letra);
        }

        return resultado.toString();
    }

}
