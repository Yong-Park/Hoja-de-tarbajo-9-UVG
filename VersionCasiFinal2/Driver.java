/*
 * Universidad del Valle de Guatemala
 * Estructura de Datos - Seccion 10
 * @author Yong Park - 20117
 * @author Christopher Garcia - 20541
 * HT9 - Diccionario Ingles-Espanol
 * 
 */
/*
 * Clase Driver
 * Utilizada para respetar el MVC y con esta se inicia el programa
 */
public class Driver{
	/*Método main que controla el desarrollo del programa*/
    public static void main (String[] args){
		//direcciones
		Vista vista = new Vista();
		//labels
		boolean ciclo=true;
        //mostrar menu
		do{
			int op=vista.menu();
			//correr el splaytree
			if(op==1){
				TreeOne splaytree = new TreeOne();
				splaytree.runSplayTree();
			//correr el mapeo
			}else if(op==2){
				TreeTwo Hashingtree = new TreeTwo();
				Hashingtree.runHashingMap();
			//terminar
			}else if(op==3){
				ciclo=false;
			}
		}while(ciclo);
    }
}