/**
* @Author Jorge Luque
* Programa que pide una frase y separa cada letra de la frase y las muestra una a una.
*
**/

import java.util.Scanner;

public class SepararPalabras {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
	String cadena;
        char caracterActual;
        int longitud;

        // Pedir al usuario que ingrese una cadena de texto
        System.out.println("Ingresa una cadena de texto:");
        cadena = entrada.nextLine();



        // Mostrar cada palabra en una línea distinta utilizando charAt
        System.out.println("Palabras en la cadena:");
        longitud = cadena.length();
        for (int i = 0; i < longitud; i++) {
            caracterActual = cadena.charAt(i);

            // Imprimir el carácter solo si no es un espacio en blanco
            if (caracterActual != ' ') {
                System.out.print(caracterActual);
            } else {
                System.out.println(); // Cambiar de línea al encontrar un espacio
            }
        }
	
	// Cerrar el scanner después de su uso
        entrada.close();
    }
}
