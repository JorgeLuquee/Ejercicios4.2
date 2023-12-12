import java.util.Scanner;

/**
 * @Author Jorge Luque
 *
 * Este programa solicita dos cadenas de texto al usuario y verifica si son iguales,
 * diferenciando entre mayúsculas y minúsculas.
 */
public class CompararCadenas {

    public static void main(String[] args) {

        String cadena1;
        String cadena2;

        Scanner entrada = new Scanner(System.in);

        // Pedir al usuario que ingrese la primera cadena de texto
        System.out.println("Ingresa la primera cadena de texto:");
        cadena1 = entrada.nextLine();

        // Pedir al usuario que ingrese la segunda cadena de texto
        System.out.println("Ingresa la segunda cadena de texto:");
        cadena2 = entrada.nextLine();

        // Comparar las cadenas sin diferenciar entre mayúsculas y minúsculas y mostrar el resultado
        if (cadena1.equalsIgnoreCase(cadena2)) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas son diferentes");
        }

	// Cerrar el scanner después de su uso
        entrada.close();
    }
}
