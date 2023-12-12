/**
* @author Jorge Luque
* Programa que pide una frase y comprueba si es palíndromo o no lo es
**/

import java.util.Scanner;

public class VerificadorPalindromo {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
	String frase, fraseProcesada;

        // Solicitar al usuario que introduzca una frase
        System.out.print("Introduce una frase: ");
	frase = entrada.nextLine();

        // Eliminar espacios
        fraseProcesada = eliminarEspacios(frase);

        // Verificar si la frase es un palíndromo
        if (esPalindromo(fraseProcesada)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }

        // Cerrar el scanner después de su uso
        entrada.close();
    }

    /**
     * Elimina los espacios de una cadena.
     *
     * @param cadena La cadena de entrada.
     * @return La cadena sin espacios.
     */
    private static String eliminarEspacios(String cadena) {
        String resultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter != ' ') {
                resultado += caracter;		// += para la concatenación
            }
        }
        return resultado;
    }

    /**
     * Verifica si una cadena es un palíndromo.
     *
     * @param cadena La cadena de entrada.
     * @return true si la cadena es un palíndromo, false en caso contrario.
     */
    private static boolean esPalindromo(String cadena) {
        int longitud = cadena.length();

        // Verificar si la cadena es un palíndromo comparando caracteres de ambos extremos
        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
