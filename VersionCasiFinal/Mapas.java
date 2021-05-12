/*
 * Universidad del Valle de Guatemala
 * Estructura de Datos - Seccion 10
 * @author Yong Park - 20117
 * @author Christopher Garcia - 20541
 * HT9 - Diccionario Ingles-Espanol
 * 
 * Referencia de trabajos anteriores
 */
/**
 * Imports de librerias de java
 */
import java.util.Collection;
import java.util.Set;

 /**
  * Interface Mapas 
  * @param A: Tipo de dato (Genéricos)
  * @param B: Tipo de dato (Genéricos)
  */
public interface Mapas<A,B>{

    /**
     * Métodos que utilizaran todas las implementaciones de Map
     */
    public Set<A> Keyset();
    public void Remove(A Dato);
    public void Put(A Dato, B info);
    public boolean ContainsKey(A Dato);
    public boolean ContainsValue(B info);
    public B GetB(A Dato);
    public boolean IsEmpty();
    public int Tamano();
    public void Reemplazo(A Dato, B info);
    public Collection<B> Valores();
}
