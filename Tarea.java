public class Tarea extends Actividad {

    private int prioridad;

    // Constructor
    public Tarea(String nombre, int prioridad){
        super(nombre);
        this.prioridad = prioridad;
    }

    // Getter y Setter
    public int getPrioridad(){
        return prioridad;
    }

    public void setPrioridad(int prioridad){
        this.prioridad = prioridad;
    }
    
    // Modificacion del metodo abstracto de Actividad
    @Override
    public void ejecutar(){
        System.out.println("Tarea: " + getNombre() + " con prioridad " + prioridad);
    }
}
