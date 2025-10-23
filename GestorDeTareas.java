import java.util.Scanner;

// Clase principal del gestor de tareas
public class GestorDeTareas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcion;
        int totalPrioridad= 0;
        Actividad ultimaTarea = null;

        // Bucle del menu
        do{
            mostrarMenu();
            opcion = leerOpcion(sc);
            Resultado resultado = ejecutarOpcion(opcion, sc, totalPrioridad, ultimaTarea );
            totalPrioridad = resultado.totalPrioridad;
            ultimaTarea = resultado.tarea;
        } while (opcion != 3);

        sc.close();
    }

        public static void mostrarMenu(){
            System.out.println("=== Gestor de Tareas ==");
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Ver ultima tarea");
            System.out.println("3. Salir");
        }   

        public static int leerOpcion(Scanner sc){
            System.out.println("Elige una opcion: ");
            return sc.nextInt();
        }
        
        public static Resultado ejecutarOpcion(int opcion, Scanner sc, int totalPrioridad, Actividad tarea){
            sc.nextLine(); // Limpiar el buffer
            switch (opcion) {
                case 1:
                    Resultado res = agregarTarea(sc, totalPrioridad);
                    totalPrioridad = res.totalPrioridad;
                    tarea = res.tarea;
                    break;
                case 2:
                    if (tarea != null){
                        tarea.ejecutar();
                    } else {
                        System.out.println("No se ha agregado ninguna tarea aun.");
                    }
                    break;
                case 3:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion Invalida. Intenta de nuevo.");
            }
            return new Resultado(totalPrioridad, tarea);        
        }
        public static Resultado agregarTarea(Scanner sc, int totalPrioridad){
            System.out.println("Nombre de la tarea: ");
            String nombreTarea = sc.nextLine();

            System.out.println("Prioridad (1 a 5); ");
            int prioridad = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            if (prioridad >= 1 && prioridad <= 5){
                totalPrioridad += prioridad;// Se acumula la prioridad
                Tarea nueva = new Tarea(nombreTarea, prioridad);
                System.out.println("Tarea agregada: " + nombreTarea + " con prioridad " + prioridad + " agregada.");
                System.out.println("Total acumulado de prioridades: " + totalPrioridad);
                return new Resultado(totalPrioridad, nueva);
            }else {
                    System.out.println("Prioridad no validad.");
                    return new Resultado(totalPrioridad, null);
            }
            
        }
        // Clase auxiliar para devolver multiples valores
        public static class Resultado{
            int totalPrioridad;
            Actividad tarea;

            // Constructor
            public Resultado(int totalPrioridad, Actividad tarea){
                this.totalPrioridad = totalPrioridad;
                this.tarea = tarea;
            }

        }
}