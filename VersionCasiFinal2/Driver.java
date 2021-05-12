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
			//revisar si es 3 de lo contrario seguir
			if(op==3){
				ciclo=false;
			}else{
				//correr el splaytree
				Factory factory = new Factory();
				Interface Tree= factory.getFactory(op);
				Tree.runTree();
			}
			
			
		}while(ciclo);
    }
}