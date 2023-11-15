/*
*   Generar un programa que permita ingresar un nombre de una ciudad;
*   Los nombres de las ciudades permitidas son las que empiezan con vocal.
*   Si la ciudad es permitida presentar un mensaje:
*   Nombre con inicial O de otavalo
*   Si la ciudad no es permitida presentar un mensaje:
*   opción incorrecta; ninguna de las anteriores
*   ANA DIAZ con edad 19, es estudiante de UTPL
*   luis vera con edad 19, es estudiante de UNL
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese el nombre del estudiante");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la edad del estudiante");
        String edad = entrada.nextLine();
        System.out.println("Ingrese el nombre de la universidad");
        String universidad = entrada.nextLine();
        // nombre = "atacames"
        // obtener el primer caracter de una
                                       // cadena
        //  L   o   j   a
        //  0   1   2   3
        
        char uni = universidad.charAt(0);
        switch(uni){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.printf("%s con edad de %s es estudiante de la "
                        + "Univercidad con inicial %s de %s\n", 
                        nombre, edad, uni, universidad.toLowerCase());
                break;
            
            default:
                System.out.println("opción incorrecta; ninguna de las "
                        + "anteriores");
                break;
                
        }
        
    }
}
