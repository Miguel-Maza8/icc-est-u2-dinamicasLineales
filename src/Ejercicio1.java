import java.util.Stack;

public class Ejercicio1 {

    // Metodo que devuelve una cadena de 
    //texto invertido 
    // texto -> COMPUTACION
    // return -> NOICATUPMOC
    // USANDO SOLO PILAS 
    public String inveString (String texto){
        
        Stack< Character> pila = new Stack<>();
        
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
