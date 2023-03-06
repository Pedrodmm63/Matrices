package matrices;

public class Caracol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int filas = 5;
		int columnas = 5;
		int numero = filas*columnas;
		int[][] matriz = new int[filas][columnas];
		
		
		matriz[2][2] = 1;
		for(int i=0; i<filas; i++) {
			for(int j=0; j<columnas; j++) {
				matriz[0][0] = numero;
				
				System.out.print(matriz[i][j] + " ");
				
			}
			System.out.println();
		}
		
	}

}
