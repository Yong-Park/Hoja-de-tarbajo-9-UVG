import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver{
    public static void main (String[] args){
        SplayTree2<String,String> tree = new SplayTree2();
		//lectura del archivo txt
        Scanner scanner = new Scanner(System.in);
			//lectura del diccionario
			ArrayList<ArrayList<String>> words = new ArrayList<>();
            try{
                File datos = new File("Spanish.txt");
                Scanner lectura = new Scanner(datos);

                while(lectura.hasNextLine()){
                    String expresion = lectura.nextLine();
                    String[] strsplit = expresion.split("	");
					ArrayList<String> data = new ArrayList<>();
					for(int i=0; i<strsplit.length;i++){
						data.add(strsplit[i]);
					}
					//de este de agregar solo cuando la palabra no este no estoy muy seguro.
					/*if(!tree.contains(data.get(0))){
						
					}*/
					words.add(data);
					System.out.println(data);
                    tree.put(data.get(0),data.get(1));     
                }
                lectura.close();
            }catch(FileNotFoundException e){
                System.out.println("No se encontro el archivo");
                e.printStackTrace();
            }

			//dejar un espacio para que haya como salto
			System.out.println("\n");
			
			//realizar busqueda de palabras en el diccionario para ver si estan o no. 
			ArrayList<String> palabras = new ArrayList<>();
			palabras.add("the");
			palabras.add("woman");
			palabras.add("asked");
			palabras.add("me");
			palabras.add("to");
			palabras.add("do");
			palabras.add("my");
			palabras.add("homework");
			palabras.add("in");
			palabras.add("the");
			palabras.add("town");
			
			         
			//se esta buscando esto tambien es prueba
			for(int i=0;i<palabras.size();i++){
				if(tree.contains(palabras.get(i))){
					System.out.println("si la contiene");
					System.out.println(palabras.get(i));
					System.out.println(tree.get(palabras.get(i)));
				}else{
					System.out.println("no la contiene");
					System.out.println(palabras.get(i));
				}
				System.out.println("___________________");
			}

			//probando
			/*if(tree.contains("abased")){
				for(int i=0;i<words.size();i++){
					if(words.get(i).contains("abased")){
						System.out.println(words.get(i).get(1));
					}
				}
			}
			System.out.println(words);*/
			
			
			

			
			
    }

}