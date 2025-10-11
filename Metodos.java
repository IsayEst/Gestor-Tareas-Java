public class Metodos {
    
public static int resta(int a, int b) {
    return a - b;
}

public static void saludar(){
    String nombre = "Jorge";
    System.out.println("Hola, bienvenido a Java!");
    System.out.println("Seras un crack en Java " + nombre);
}

public void validarEdad( int edad){
    if (edad >= 18){
        System.out.println("Eres mayor de edad.");
        return;
    }else
    System.out.println("Eres menor de edad.");
}

public static void main(String[] args) {
    int resultado = resta(10, 5);
    System.out.println("El resultado de la resta es: " + resultado);

    saludar();

    Metodos m = new Metodos();
    m.validarEdad(38);

}

}




