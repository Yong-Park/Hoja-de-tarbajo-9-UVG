import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver{
    public static void main (String[] args){
        SplayTree tree = new SplayTree();
		/*tree.insert("hola");
		tree.insert("jaja");
		tree.insert("jiji");
		tree.insert("xd");
		tree.insert("pedro");
		tree.insert("oscar");
		tree.insert("santiago");
		tree.insert("yong");
		tree.prettyPrint();
		tree.searchTree("oscar");
		tree.searchTree("jiji");
		tree.prettyPrint();
		tree.deleteNode("hola");
		tree.deleteNode("jaja");
		tree.deleteNode("jiji");
		tree.deleteNode("xd");
		tree.prettyPrint();
		tree.deleteNode("pedro");
		tree.deleteNode("oscar");
		tree.deleteNode("santiago");
		tree.deleteNode("yong");
		tree.prettyPrint();*/
		//lectura del archivo txt
        Scanner scanner = new Scanner(System.in);
			//lectura del diccionario
			ArrayList<String> words = new ArrayList<>();
            try{
                File datos = new File("prueba.txt");
                Scanner lectura = new Scanner(datos);

                while(lectura.hasNextLine()){
                    String expresion = lectura.nextLine();
                    String[] strsplit = expresion.split("	");
					ArrayList<String> data = new ArrayList<>();
					for(int i=0; i<strsplit.length;i++){
						data.add(strsplit[i]);
					}
					System.out.println(data);
                    tree.insert(data.get(0));     
                }
                lectura.close();
            }catch(FileNotFoundException e){
                System.out.println("No se encontro el archivo");
                e.printStackTrace();
            }

			//mostrar el tree
			tree.prettyPrint();

			//dejar un espacio para que haya como salto
			System.out.println("\n");
			
			//realizar busqueda de palabras en el diccionario para ver si estan o no. 
			ArrayList<String> palabras = new ArrayList<>();
			palabras.add("abandoning");
			palabras.add("abash");
			for(int i=0;i<palabras.size();i++){
				if(tree.TreeContains(palabras.get(i))){
					System.out.println("si la contiene");
				}else{
					System.out.println("no la contiene");
				}
			}
			

			
			
    }

}