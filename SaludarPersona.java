public class SaludarPersona {
    
   public static void saludarPersona(String nombre){
        System.out.println("Hola " + nombre);
    }
        
   public static int sumar(int a, int b){
    return a + b;
   } 

   public static void saludar(){
    System.out.println("Hola Mundo");
   }

   public static void main(String[] args) {
    saludarPersona("Jorge");
    int resultado = sumar(5, 3);
    System.out.println("El resultado de la suma es: " + resultado);
    saludar();
   }
}
