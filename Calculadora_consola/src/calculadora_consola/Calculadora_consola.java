
package calculadora_consola;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Calculadora_consola {

    public static void main(String[] args) {
        Scanner user_inp = new Scanner(System.in);
        char[] operations = {'s','r','m','d'};
        char user_operation;
        boolean isValidOperation = false;
        float num1,num2,resultado;
        
        System.out.println("""
                           1.Suma - S o s
                           2.Resta - R o r
                           3.Multiplicacion - M o m 
                           4.Division - D o d""");
        System.out.print("\nTeclee la letra de la operacion que desea realizar: ");
        user_operation = user_inp.next().charAt(0);
        
        //Determinar si la operacion es permitida
        for(int i = 0;i < operations.length;i++){
           char operation = Array.getChar(operations, i);
           if(operation == Character.toLowerCase(user_operation)){
               isValidOperation = true;
               break;
           }
        }
        
        if(!isValidOperation){
            System.out.println("Operacion no permitida");
            System.exit(0);
        }
        
        //Pedir numeros al usuario
        System.out.print("Digite los 2 numeros para realizar la operacion: ");
        num1 = user_inp.nextFloat();
        num2 = user_inp.nextFloat();
        
        //Ejecutar operacion segun lo indicado por el usuario
        switch(Character.toLowerCase(user_operation)){
            case 's':
                resultado = suma(num1,num2);
                break;
            case 'r':
                resultado = resta(num1,num2);
                break;
            case 'm':
                resultado = mult(num1,num2);
                break;
            case 'd':
                resultado = div(num1,num2);
                break;
            default:
                resultado = 0;
        }
        
        //Mostrando resultado por pantalla
        System.out.println("El resultado de la operacion realizada es: " + resultado);
        
    }
    
    public static float suma(float num1,float num2){
        return num1 + num2;
    }
    public static float resta(float num1,float num2){
        return num1 - num2;
    }
    public static float mult(float num1,float num2){
        return num1 * num2;
    }
    public static float div(float num1,float num2){
        return num1 / num2;
    }
    
}
