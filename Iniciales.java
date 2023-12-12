import java.util.Scanner;

/**
 * @Author Jorge Luque
 *
 * Este programa solicita dos cadenas de texto al usuario y verifica si son iguales,
 * diferenciando entre mayúsculas y minúsculas.
 */
public class Iniciales{
	
	public static void main(String[] args){
	
		Scanner entrada = new Scanner(System.in);
		String Nombre, Apellido1, Apellido2, codigoUsuario;

	// Pedir al usuario que ingrese el nombre
        System.out.println("Ingresa tu nombre:");
        Nombre = entrada.nextLine();

        // Pedir al usuario que ingrese el primer apellido
        System.out.println("Ingresa tu primer apellido:");
        Apellido1 = entrada.nextLine();

        // Pedir al usuario que ingrese el segundo apellido
        System.out.println("Ingresa tu segundo apellido:");
        Apellido2 = entrada.nextLine();

        // Obtener las tres primeras letras de cada cadena y concatenarlas en mayúsculas con el toUpperCase()
        codigoUsuario = Nombre.substring(0, 3).toUpperCase() + Apellido1.substring(0, 3).toUpperCase() + Apellido2.substring(0, 3).toUpperCase();

        // Mostrar el código de usuario
        System.out.println("Tu código de usuario es: " + codigoUsuario);


        // Cerrar el scanner después de su uso
        entrada.close();
    }
}