/*
 * Universidad del Valle de Guatemala
 * Estructura de Datos - Seccion 10
 * @author Yong Park - 20117
 * @author Christopher Garcia - 20541
 * HT9 - Diccionario Ingles-Espanol
 */
//Import de Scanner
import java.util.Scanner;
//Clase Vista para respetar el MVC
public class Vista {
    
    /** 
     * @return int
     */
    //Menu del programa
    public int menu(){
        Scanner scanner = new Scanner(System.in);
        int opcion_numero=0;
        System.out.println("__________________________________");
        System.out.println("\t\tDiccionario");
        System.out.println("__________________________________");
        System.out.println("1. SplayTree");
        System.out.println("2. Mapeo basado en hashing");
        System.out.println("3. Salir");
        System.out.println("__________________________________");
        boolean ciclo_numero=true;
        do{
            try{
                String opcion = scanner.next();
                //verificar que sea una opcion adecuada
                opcion_numero = Integer.parseInt(opcion);
                if(opcion_numero>=1 && opcion_numero<=3){
                    ciclo_numero=false;
                }else{
                    System.out.println("Porfavor escoja una de las opciones que se presentan en el menu");
                }
            }catch(Exception e){
                System.out.println("Ingresa solo datos numericos");
            }
        }while(ciclo_numero);
        return opcion_numero;
    }
}
