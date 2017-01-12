package Clase2;

public class ArrayBidimensionales {

	public static void main(String[] args) {
		int [][] matrix = {
				{15,16,17,18,19},
				{20,21,22,23,24},
				{25,26,27,28,29},
				{30,31,32,33,34}
		}; 
	for(int[]fila:matrix){
		System.out.println();
		for(int z :fila){
			System.out.print(z + " ");
		}
	}


}
}