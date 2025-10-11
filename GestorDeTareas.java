import java.util.Scanner;

public class GestorDeTareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        int totalPrioridad= 0;

        do{
            System.out.println("=== Gestor de Tareas ==");
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Ver tareas (pendiente)");
            System.out.println("3. Salir");

            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar

            // Validamos que este entre 1 y 3
            switch (opcion) {
                case 1:
                    System.out.println("Nombre de la tarea: ");
                    String nombreTarea = sc.nextLine();

                    System.out.println("Prioridad (1 a 5); ");
                    int prioridad = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer

                    if (prioridad >= 1 && prioridad <= 5){
                        totalPrioridad += prioridad;// Se acumula la prioridad
                        System.out.println("Tarea agregada: " + nombreTarea + " con prioridad " + prioridad + " agregada.");
                        System.out.println("Total acumulado de prioridades: " + totalPrioridad);
                    }else {
                        System.out.println("Prioridad no validad.");
                    }
                    break;
                case 2:
                    System.out.println("Funcion 'ver tareas' aun no implementada.");
                    break;
                case 3:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion Invalida. Intenta de nuevo.");
                    
            }
        }while (opcion != 3);
            
        sc.close();
        
    }
}