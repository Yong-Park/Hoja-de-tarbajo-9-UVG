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
    
    /*
     *--------------------------------------
     *  Pruebas unitarias para el SplayTree  
     * -------------------------------------
     */

    //prueba para revisar si efectivamente se agregaron y estan las palabras en el diccionario en el splay tree
    @Test
    public void testAgregarSplaytree(){
        SplayTree2<String,String> tree = new SplayTree2<>();
        tree.put("Hello", "Hola");
        tree.put("Bye","adios");
        boolean contiene = tree.contains("Bye");
        assertEquals(true, contiene);
        contiene = tree.contains("Hello");
        assertEquals(true, contiene);
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

    /*
     *----------------------------------------------------------------
     *  Pruebas unitarias para el algoritmo de mapeo basado en Hashing  
     * ---------------------------------------------------------------
     */

    //Prueba unitaria#1: Comprobación de que los elementos se agregan correctamente
    //en este tipo de algoritmo basado en Hashing
    @Test
    public void test1Add(){
        HashmapC<String,String> HashTree = new HashmapC<String,String>();
        HashTree.put("Dog", "Perro");
        HashTree.put("Cat","Gato");
        HashTree.put("Fish","Pez");
        HashTree.put("Ant","Hormiga");
        System.out.println(HashTree);
        boolean Res = HashTree.ContainsKey("Dog");
        assertEquals(true, Res);
        System.out.println("Si lees esto, la prueba es un exito");
        boolean Res2 = HashTree.ContainsKey("Cat");
        assertEquals(true, Res2);
        System.out.println("Si lees esto, la prueba es un exito...de nuevo");
    }

    //Prueba unitaria#2: Comprobación de que los elementos se eliminan correctamente
    //en este tipo de algoritmo basado en Hashing
    @Test
    public void test2Remove(){
        HashmapC<String,String> HashTree = new HashmapC<String,String>();
        HashTree.put("Dog", "Perro");
        HashTree.put("Cat","Gato");
        System.out.println(HashTree);
        HashTree.remove("Cat");
        System.out.println(HashTree);
        boolean Res = HashTree.ContainsKey("Cat");
        assertEquals(false, Res);
        System.out.println("Si lees esto, la prueba es un exito");
    }

    //Prueba unitaria#3: Comprobación de que el sistema de búsqueda y traducción
    //con los elementos se aplica correctamente en este tipo de algoritmo basado en Hashinge
    @Test
    public void test3Search(){
        HashmapC<String,String> HashTree = new HashmapC<String,String>();
        HashTree.put("Dog", "Perro");
        HashTree.put("Cat","Gato");
        String Res = HashTree.get("Cat");
        assertEquals("Gato", Res);
        System.out.println("Si lees esto, la prueba es un exito");
        Res = HashTree.get("Dog");
        assertEquals("Perro", Res);
        System.out.println("Si lees esto, la prueba es un exito...de nuevo");
    }

}
