/**
* @author Jorge Luque
* Programa que pide una frase y cuenta cada vocal que hay
**/

import java.util.Scanner;

   public class ContadorVocales {
   
	public static void main(String[] args) {

        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
	
	String frase;
	
	char caracter;

        Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario que introduzca una frase
        System.out.print("Introduce una frase: ");
        frase = entrada.nextLine();

        // Iterar sobre cada caracter de la frase
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i);

            // Incrementar el contador correspondiente a cada vocal encontrada
            switch (caracter) {
                case 'a':
                case 'A':
                    contadorA++;
                    break;
                case 'e':
                case 'E':
                    contadorE++;
                    break;
                case 'i':
                case 'I':
                    contadorI++;
                    break;
                case 'o':
                case 'O':
                    contadorO++;
                    break;
                case 'u':
                case 'U':
                    contadorU++;
                    break;
            }
        }

        // Mostrar los resultados
        System.out.println("Nº de A's: " + contadorA);
        System.out.println("Nº de E's: " + contadorE);
        System.out.println("Nº de I's: " + contadorI);
        System.out.println("Nº de O's: " + contadorO);
        System.out.println("Nº de U's: " + contadorU);

	// Cerrar el scanner después de su uso
        entrada.close();
    }
}
