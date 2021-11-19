package Test;

import static aritmetica.Aritmetica.divicion;

public class TestExepciones {
    public static void main(String[] args) {
   
        int resultado = 0;
        // la variable queda por fuera del codigo try catch
//    try{
        resultado = divicion(10, 0);
//    }catch(Exception e){
//        System.out.println("Ocurrio un error: ");
//        e.printStackTrace(System.out);
//// printStackTrace muestra la pila de excepciones y despues las imprimimos
//        System.out.println(e.getMessage());
//        //para acceder al mensaje
//    }
    System.out.println("Resultado = " + resultado);
    
    // el bloque de codigo try / catch, es para que el programa no termine de manera abrupta
    
    }
}
