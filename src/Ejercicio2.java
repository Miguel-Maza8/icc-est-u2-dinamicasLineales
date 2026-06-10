import java.util.Stack;

public class Ejercicio2 {
    
    public boolean esPalidromo (String texto){
        
        // Implementacion del metodo
        Stack<Character> pila = new Stack<>();
       for ( char letra : texto.toCharArray()){
         pila.push(letra);
       }
       for ( char letra : texto.toCharArray()){
         if ( letra != pila.pop()){
            return false;
         }
        }
        return true ;
}
}