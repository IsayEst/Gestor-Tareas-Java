public abstract class Actividad {

    private String nombre;
    
    // Constructor
    public Actividad(String nombre) {
        this.nombre = nombre;
    }

    // Getter
    public String getNombre(){
        return nombre;
    }

    // Metodo abstracto
    public abstract void ejecutar();
}
