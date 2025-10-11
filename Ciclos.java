import java.util.Scanner;

public class Ciclos {

    public static void main(String[] args){
        
        
        // Ciclo for
        for (int i = 1; i <= 5; i++){
            System.out.println("For iteracion " + i);
        }

        // Ciclo While
        int contador = 1;
        while(contador <= 5){
            System.out.println("While iteracion " + contador );
            contador++;
        }

        // Ciclo Do-While
        int numero;
        do{
            System.out.println("Ingresa un numero mayor a 10: ");
            numero = new Scanner(System.in).nextInt();
            System.out.println("Hasta luego!");
        }while (numero <= 10);


    }
    
}
