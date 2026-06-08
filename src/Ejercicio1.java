import java.util.Stack;

public class Ejercicio1 {

    // Metodo que devuelve una cadena de 
    //texto invertido 
    // texto -> COMPUTACION
    // return -> NOICATUPMOC
    // USANDO SOLO PILAS 
    public String inveString (String texto){
        
        Stack< Character> pila = new Stack<>();
        for ( int i = 0 ; i< texto.length(); i++){
           texto.charAt(i); // nos devuelve la parabra del texto 
            pila.push(texto.charAt(i)); 
        }
        
        texto.toCharArray(); // nos devuelve en arreglo 

        for (char letra : texto.toCharArray()){
            pila.push(letra);
        }
        
        String invertido = "";
        while(!pila.isEmpty()){
            invertido+= pila.pop();
        }
        return invertido;  
        
    }

}
