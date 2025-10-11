import java.util.Scanner;

public class SwithCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el dia de la semana (1-7):");
        // Leer el dia ingresado por el usuario
        int dia = Integer.parseInt(sc.nextLine());
        String nombreDia;

        // Switch case
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Dia invalido";
        }
        System.out.println("El dia es: " + nombreDia);
        sc.close();
    }
    
}
