/*Pedir un numero N,
y mostrar todos los numeros
del 1 al N.
 */


import java.util.Scanner;

public class Numeros {
    public static void main(String [] args){
        Scanner user_input = new Scanner(System.in);
        int user_number, i = 0;

        System.out.println("Introduce un numero: ");
        user_number = user_input.nextInt();

        while (i < user_number){
            System.out.println("El numero actual es " + i);
            i++;
        }

    }
}
