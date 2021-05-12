/*
 * Universidad del Valle de Guatemala
 * Estructura de Datos - Seccion 10
 * @author Yong Park - 20117
 * @author Christopher Garcia - 20541
 * HT9 - Diccionario Ingles-Espanol
 */
//Imports
import java.io.*;
import java.util.*;
/*
 *Clase TreeTwo
 *Encargada del desarrollo del mapeo basado en Hashing, asociaciones del diccionario y traducciones con este mapa
 */
public class TreeTwo {
    /**
	 * Método runHashingTree: Encargado de iniciar el proceso de ejecucion
	 */
    public void runHashingMap(){

		//Creacion de mapa
    	HashmapC<String,String> HashTree= new HashmapC<String,String>();
        Scanner scanner = new Scanner(System.in);
		//lectura del diccionario
		ArrayList<ArrayList<String>> words = new ArrayList<>();
        //Try-Catch como parte de la programación defensiva
		try{
            File datos = new File("Spanish.txt");
            Scanner lectura = new Scanner(datos);

			//Separacion y asignacion de las palabras del diccionario al mapa
            while(lectura.hasNextLine()){
                String expresion = lectura.nextLine();
                String[] strsplit = expresion.split("	");
				ArrayList<String> data = new ArrayList<>();
				for(int i=0; i<strsplit.length;i++){
					data.add(strsplit[i]);
				}

				words.add(data);
                HashTree.put(data.get(0),data.get(1));     
            }
            lectura.close();
        } catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo");
            e.printStackTrace();
        }

        //lectura del archivo palabras.txt que son las oracioens en ingles
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
				if(HashTree.ContainsKey(linea.get(i))){
					String change = HashTree.get(linea.get(i));
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
