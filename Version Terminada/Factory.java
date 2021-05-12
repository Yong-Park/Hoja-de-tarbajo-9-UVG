/*
 * Universidad del Valle de Guatemala
 * Estructura de Datos - Seccion 10
 * @author Yong Park - 20117
 * @author Christopher Garcia - 20541
 * HT9 - Diccionario Ingles-Espanol
 * 
 * Referencia de trabajos anteriores
 */
public class Factory {
    
    /** 
     * @param op
     * @return Interface
     */
    public Interface getFactory(int op){
        if(op==1){
            //regresar el TreeOne
            return new TreeOne(); 
        }else{
            //regresar el TreeTwo
            return new TreeTwo(); 
        }
    }
}
