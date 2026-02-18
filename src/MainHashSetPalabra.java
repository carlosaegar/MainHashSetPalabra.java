/*
4. Escribe un programa que lea una lista de palabras y muestre solo las palabras
únicas (ignorando las repetidas) usando un HashSet. (MainHashSetPalabra
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainHashSetPalabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> lista = new HashSet<>();
        Set<String> repetidas = new HashSet<>();

        System.out.println("Introduce palabras (escribe 'fin' para terminar):");

        while (sc.hasNext()) {
            String entrada = sc.next().toLowerCase();

            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            if (!lista.add(entrada)) {
                repetidas.add(entrada);
            }
        }

        lista.removeAll(repetidas);

        System.out.println("Palabras que aparecieron una sola vez:");
        if (lista.isEmpty()) {

            System.out.println("No hay palabras que solo salgan una vez.");

        } else {
            for (String palabra : lista) {
                System.out.println(palabra);
            }
        }

        sc.close();
    }
}

