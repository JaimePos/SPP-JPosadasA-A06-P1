
package spp.jposadasa.a06.p1;
import java.util.Scanner;
public class SPPJPosadasAA06P1 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = 0;
        int suma = 0;
        num = pedir();
        while (num > 0){
            suma = suma(num, suma);
            num = pedir();
        }
        System.out.println("La suma de numero es: " + suma);
    }
    
    public static int pedir (){
    int num, suma = 0;
    Scanner kb = new Scanner(System.in);
            System.out.println("Porfavor introduzca un numero entero");
            num = kb.nextInt();
    return num;
}
    
    public static int suma (int num, int suma) {
        suma = suma + num;
        return suma;
    }
}