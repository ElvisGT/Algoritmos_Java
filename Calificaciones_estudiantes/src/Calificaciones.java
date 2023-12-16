import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner user_in = new Scanner(System.in);
        int students_length = 3;
        int signatures_length = 3;
        double max_note, min_note;
        double max_student = 0;
        double min_student = 0;
        double[][] students = new double[students_length][signatures_length];
        double temp_note, sum_total = 0;
        double[] averages = new double[students_length];

        // // // Tomar las notas de los estudiantes
        System.out.println("\n******Ingrese las notas de los estudiantes, deben estar entre 0 y 10*******");
        for (int i = 0; i < students_length; i++) {
            for (int j = 0; j < signatures_length; j++) {
                // Mientras que la nota este fuera de rango se repite
                do {
                    System.out.print("Ingrese la nota " + (j + 1) + " del estudiante " + (i + 1) + ": ");
                    temp_note = user_in.nextDouble();
                    if (temp_note < 0 || temp_note > 10) {
                        System.out.println("La nota es incorrecta, esta fuera de rango");
                    }
                } while (temp_note < 0 || temp_note > 10);

                students[i][j] = temp_note;
                sum_total += temp_note;
                sum_total = 0;
            }
            // Calcular el promedio de cada alumno
            averages[i] = sum_total / signatures_length;
        }

        // Determinar la mayor y menor puntuacion
        min_note = 11;
        max_note = -1;
        for (int i = 0; i < students_length; i++) {
            for (int j = 0; j < signatures_length; j++) {
                // Determinar el maximo
                if (students[i][j] > max_note) {
                    max_student = i + 1;
                    max_note = students[i][j];

                }
                if (students[i][j] < min_note) {
                    min_student = i + 1;
                    min_note = students[i][j];
                }
            }
        }

        // Mostrar las notas de los estudiantes
        for (int i = 0; i < students_length; i++) {
            System.out.println("Estudiante " + (i + 1) + ": ");
            for (int j = 0; j < signatures_length; j++) {
                System.out.print("\tNota " + (j + 1) + ": " + students[i][j] + " ");
            }
            System.out.println("\n\tPromedio: " + averages[i]);
            System.out.println();
        }

        // Mostrar mayores y menores notas
        System.out.println("La mayor nota la tiene el estudiante " + max_student + " con una nota de " + max_note);
        System.out.println("La menor nota la tiene el estudiante " + min_student + " con una nota de " + min_note);
    }
}