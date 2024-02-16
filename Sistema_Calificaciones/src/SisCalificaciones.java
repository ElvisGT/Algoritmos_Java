import java.util.Scanner;

public class SisCalificaciones {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la calificacion entre 0 a 10: ");
        double calificacion = scanner.nextDouble();

        if(calificacion >= 9 && calificacion < 10){
            System.out.println("Has sacado A");
        }
        else if(calificacion < 9 && calificacion >= 8){
            System.out.println("Has sacado B");
        }
        else if(calificacion < 8 && calificacion >= 7){
            System.out.println("Has sacado C");
        }
        else if(calificacion < 7 && calificacion >= 6){
            System.out.println("Has sacado D");
        }
        else if(calificacion < 6 && calificacion >= 0){
            System.out.println("Has sacado F");
        }
        else if(calificacion < 0 || calificacion > 10){
            System.out.println("Valor desconocido");
        }
    }
}
