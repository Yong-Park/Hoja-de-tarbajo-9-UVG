/*
 * Universidad del Valle de Guatemala
 * Estructura de Datos - Seccion 10
 * @author Yong Park - 20117
 * @author Christopher Garcia - 20541
 * HT9 - Diccionario Ingles-Espanol
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.Test;

public class Junit {
    
    //prueba para revisar si efectivamente se agregaron y estan las palabras en el diccionario en el splay tree
    @Test
    public void testAgregarSplaytree(){
        SplayTree2<String,String> tree = new SplayTree2<>();
        tree.put("Hello", "Hola");
        tree.put("Bye","adios");
        boolean contiene = tree.contains("Bye");
        assertEquals(true, contiene);
        contiene = tree.contains("Hello");
        assertEquals(false, contiene);

    }

    //prueba para revisar que se elimino uno de los nodos que se agregaron en el splay tree
    @Test
    public void testEliminarSplaytree(){
        SplayTree2<String,String> tree = new SplayTree2<>();
        tree.put("Hello", "Hola");
        tree.put("Bye","adios");
        tree.remove("Bye");
        boolean contiene = tree.contains("Bye");
        assertEquals(false, contiene);
    }

    //prueba para revisar la traduccion de la palabra del splay tree
    @Test
    public void testObtenerSplaytree(){
        SplayTree2<String,String> tree = new SplayTree2<>();
        tree.put("Hello", "Hola");
        tree.put("Bye","adios");
        String contiene = tree.get("Bye");
        assertEquals("adios", contiene);
        contiene = tree.get("Hello");
        assertEquals("Hola", contiene);

    }

    

}
