
package validar_fecha;
import java.util.Scanner;

public class Validar_fecha {

    public static void main(String[] args) {
        Scanner user_inp = new Scanner(System.in);
        int day,month,year;
        
        System.out.print("Indique separado por espacios el dia, mes y anio de la fecha a validar: ");
        day = user_inp.nextInt();
        month = user_inp.nextInt();
        year = user_inp.nextInt();
        
        if((day > 30 || day <= 0) || 
           (month > 12 || month <= 0) || 
           (year > 3000 || year < 1920)){
            System.out.println("La fecha introducida no es correcta");
            System.exit(0);
        }
        
         System.out.println("La fecha introducida: (" + day + "/" + 
                    month + "/" + year + ") es correcta");
        
    }
    
}
