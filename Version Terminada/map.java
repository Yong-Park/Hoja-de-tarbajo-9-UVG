/*
 * Universidad del Valle de Guatemala
 * Estructura de Datos - Seccion 10
 * @author Yong Park - 20117
 * @author Christopher Garcia - 20541
 * HT9 - Diccionario Ingles-Espanol
 * 
 * Referencia de trabajos anteriores
 */
interface map<key,value> {
    public boolean contains(key key);
    public void put(key key, value value);
    public void remove(key key);
    public int size();
    public value get(key key);
    public int height();
}

