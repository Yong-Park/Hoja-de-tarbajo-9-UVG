/*
 * Universidad del Valle de Guatemala
 * Estructura de Datos - Seccion 10
 * @author Yong Park - 20117
 * @author Christopher Garcia - 20541
 * HT9 - Diccionario Ingles-Espanol
 */
/*Imports*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 *Clase TreeOne
 *Encargada del desarrollo del SplayTree, asociaciones del diccionario y traducciones con este Arbol
 */
public class TreeOne implements Interface{
	/**
	 * Método runSplayTree: Encargado de iniciar el proceso de ejecucion
	 */
    public void runTree(){
		//Creación de arbol
        SplayTree2<String,String> tree = new SplayTree2<>();
		//lectura del archivo txt
        Scanner scanner = new Scanner(System.in);
		//lectura del diccionario
		ArrayList<ArrayList<String>> words = new ArrayList<>();
		//Try-Catch como parte de la programación defensiva
        try{
            File datos = new File("Spanish.txt");
            Scanner lectura = new Scanner(datos);

			//Separacion y asignacion de las palabras del diccionario al arbol
            while(lectura.hasNextLine()){
                String expresion = lectura.nextLine();
                String[] strsplit = expresion.split("	");
				ArrayList<String> data = new ArrayList<>();
				for(int i=0; i<strsplit.length;i++){
					data.add(strsplit[i]);
				}
				words.add(data);
                tree.put(data.get(0),data.get(1));     
            }
            lectura.close();
        }catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo");
            e.printStackTrace();
        }

		//lectura del archivo palabras.txt que son las oraciones en ingles
		ArrayList<ArrayList<String>> traducir = new ArrayList<>();
        try{
            File datos = new File("palabras.txt");
            Scanner lectura = new Scanner(datos);

            while(lectura.hasNextLine()){
                String expresion = lectura.nextLine();
                String[] strsplit = expresion.split(" ");
				ArrayList<String> data = new ArrayList<>();
				for(int i=0; i<strsplit.length;i++){
					data.add(strsplit[i]);
				}
				traducir.add(data);  
            }
            lectura.close();
        }catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo");
            e.printStackTrace();
        }
			
		//realizar busqueda de palabras en el diccionario para ver si estan o no. 
		for(ArrayList<String> linea : traducir){
			//antes de traducir
			System.out.println("_________________________________________");
			System.out.println("Original");
			String oracion = "";
			for(int i=0;i<linea.size();i++){
				oracion += linea.get(i) + " " ;
			}
			System.out.println(oracion);
			System.out.println("_________________________________________");

			//traducir
			for(int i=0;i<linea.size();i++){
				if(tree.contains(linea.get(i))){
					String change = tree.get(linea.get(i));
					if(change.contains(",")){
						String[] strsplit = change.split(",");
						linea.set(i,strsplit[0]);
					}else if(change.contains("[")){
                        String[] strsplit = change.split(" ");
						linea.set(i,strsplit[0]);
                    }else{
						linea.set(i,change);
					}
				}
			}
			//juntar las palabras para hacerlo en una oracion
			System.out.println("_________________________________________");
			System.out.println("Traducido");
			oracion = "";
			for(int i=0;i<linea.size();i++){
				oracion += linea.get(i) + " " ;
			}
			System.out.println(oracion);
			System.out.println("_________________________________________");
		}
    }
}
