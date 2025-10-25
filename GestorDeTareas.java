import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


// Clase principal del gestor de tareas
public class GestorDeTareas {

    private static final Scanner sc = new Scanner(System.in);
    private static final ArrayList<Tarea> listarTareas = new ArrayList<>();
    private static final HashMap<String, Tarea> mapaTareas = new HashMap<>();
    private static int acumuladorPrioridad = 0;

    public static void main(String[] args) {
        int opcion = 0;
        // Bucle del menu
        do{
            mostrarMenu();
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1 -> agregarTarea();
                case 2 -> listarTareas();
                case 3 -> buscarTarea();
                case 4 -> eliminarTarea();
                case 5 -> mostrarAcumulador();
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion invalida. Intenta de nuevo.");    
            }
        } while (opcion != 6);
    }

        public static void mostrarMenu(){
            System.out.println("\n=== Gestor de Tareas ==");
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Listar Tareas");
            System.out.println("3. Buscar Tarea por ID");
            System.out.println("4. Elimminar Tarea por ID");
            System.out.println("5. Ver Acumulado de Tareas por Prioridad");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opcion: ");
        }   

        private static void agregarTarea(){
            System.out.println("ID de la tarea: ");
            String id = sc.nextLine();

            if (mapaTareas.containsKey(id)){
                System.out.println("Ya existe una tarea con ese ID.");
                return;
            }

            System.out.println("Nombre de la tarea: ");
            String nombre = sc.nextLine();

            System.out.println("Prioridad (1 a 5): ");
            int prioridad = Integer.parseInt(sc.nextLine());

            if (prioridad < 1 || prioridad > 5){
                System.out.println("Prioridad no valida. Debe estar entre 1 y 5.");
                return;
            }

            Tarea nueva = new Tarea(nombre, prioridad);
            listarTareas.add(nueva);
            mapaTareas.put(id, nueva);
            acumuladorPrioridad += prioridad;

            System.out.println("Tarea agragada con exito.");
            System.out.println("Total acumulado e prioridades: " + acumuladorPrioridad);
        }

        private static void listarTareas(){
            if (listarTareas.isEmpty()){
                System.out.println("No hay tareas para mostrar.");
                return;
            }

            System.out.println("\n=== Tareas Registradas ===");
            for(Map.Entry<String, Tarea> entrada : mapaTareas.entrySet()){
                System.out.println("ID: " + entrada.getKey() + " - ");
                entrada.getValue().ejecutar(); // polimorfismo
            }
        }

        private static void buscarTarea(){
            System.out.print("Ingresa el ID de la tarea a buscar: ");
            String id = sc.nextLine();

            Tarea t = mapaTareas.get(id);
            if (t != null){
                System.out.println("Tarea encontrada: ");
                t.ejecutar();
            } else {
                System.out.println("No se encontro ninguna tarea con ese ID.");
            }
        }

        private static void eliminarTarea(){
            System.out.print("Ingresa el ID de la tarea a eliminar: ");
            String id = sc.nextLine();

            Tarea t = mapaTareas.remove(id);
            if (t != null){
                listarTareas.remove(t);
                acumuladorPrioridad -= t.getPrioridad();
                System.out.println("Tarea eliminada con exito.");
                System.out.println("Total acumulado de prioridades: " + acumuladorPrioridad);
            } else {
                System.out.println("No se encontro ninguna tarea con ese ID.");
            }
        }

        private static void mostrarAcumulador(){
            System.out.println("Total acumulado de prioridades: " + acumuladorPrioridad);
        }

        
}