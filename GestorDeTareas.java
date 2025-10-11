import java.util.Scanner;

public class GestorDeTareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        int totalPrioridad= 0;

        do{
            mostrarMenu();
            opcion = leerOpcion(sc);
            totalPrioridad = ejecutarOpcion(opcion, sc, totalPrioridad);
        } while (opcion != 3);

        sc.close();
    }

        public static void mostrarMenu(){
            System.out.println("=== Gestor de Tareas ==");
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Ver tareas (pendiente)");
            System.out.println("3. Salir");
        }

        public static int leerOpcion(Scanner sc){
            System.out.println("Elige una opcion: ");
            return sc.nextInt();
        }
        
        public static int ejecutarOpcion(int opcion, Scanner sc, int totalPrioridad){
            sc.nextLine(); // Limpiar el buffer
            switch (opcion) {
                case 1:
                    totalPrioridad = agregarTarea(sc, totalPrioridad);
                    break;
                case 2:
                    System.out.println("Funcionalidad en desarrollo...");
                    break;
                case 3:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion Invalida. Intenta de nuevo.");
            }
            return totalPrioridad;        
        }
        public static int agregarTarea(Scanner sc, int totalPrioridad){
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
            return totalPrioridad;

        }
}