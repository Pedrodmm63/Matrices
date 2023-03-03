package matrices;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int filas = 5;
		 int columnas = 5;
		 
		 int[][] matriz = new int[filas][columnas];
		 
		 //insertar en la matriz numeros
//		matriz[5][7] = 100;

		 int numero = 1;
		for (int i = 0; i<filas; i++ ) {
			for(int j=0; j<columnas; j++) {
				//insertar en todas las filas 1,2,3...
//				matriz[i][j] = i+1;
				//hacer que empiece en X numero y que vaya aumentando de 1 en 1
				//insertar en todas las columnas 1,2,3...
//				matriz[i][j] = j+1;
//				if(i == 0 || j == 0 || i == filas-1 || j == columnas-1) {
//					matriz[i][j] = 1;
//				}
				
				if(j== 0 || j == columnas-1 | i == j || j == i-2 | i== j-2| i == 2 ) {
					
					matriz[i][j] = 5;
					
				}
				
			System.out.print(matriz[i][j]+ " ");
				
			}
			System.out.println();
			
		}
		 
		
	}

}
