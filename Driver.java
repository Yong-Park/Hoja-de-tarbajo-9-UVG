
public class Driver{
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
			//correr el ****
			}else if(op==2){

			//terminar
			}else if(op==3){
				ciclo=false;
			}
		}while(ciclo);
		
		
    }

}