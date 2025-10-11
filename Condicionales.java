import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingesa tu edad:");

        int edad = Integer.parseInt(sc.nextLine());
        
        // Condicional operador ternario
        String mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println(mensaje);

        // Condicional if-else
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Eres menor de edad");
        }
        sc.close();
    }
}
