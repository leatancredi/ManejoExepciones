package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {
    // la firma del metodo
    public static int divicion(int numerador, int denominador){
        if( denominador == 0){
            //ponemos "throw para que arroje el objeto de la excepcion"
            throw new OperacionExcepcion("Divicion entre cero");
        }
        return numerador / denominador;
    }
}
