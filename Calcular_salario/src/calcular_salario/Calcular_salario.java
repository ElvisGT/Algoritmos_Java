
package calcular_salario;
import java.util.Scanner;


public class Calcular_salario {

    public static void main(String[] args) {
        Scanner user_inp = new Scanner(System.in);
        int user_hours,extra_hours;
        int base_hours = 40;
        int salary_hours = 16;
        float total_salary;
        
        System.out.print("Teclee las horas trabajadas en la semana: ");
        user_hours = user_inp.nextInt();
        
        if(user_hours <= base_hours){
            total_salary = salary_hours * user_hours;
        }else{
          extra_hours = user_hours - base_hours;
          total_salary = (base_hours * 16) + (extra_hours * 20); 
        }
        
        System.out.println("Su salario semanal es de " + total_salary + " dolares");
    }
    
}
