package matrices;

public class Caracol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tamanio = 5;
//		int columnas = 5;
//		int numero = filas*columnas;
		int[][] matriz = new int[tamanio][tamanio];
		
		int I = tamanio/2;
		int J = tamanio/2;

		int numeroPoner = 1;
		matriz[I][J]  = numeroPoner++;
		//ponemos I--/I++/J--/J++ para que la variable se vaya moviendo pero no se puede porque no se puede automatizar 
//		I--;
//		matriz[I][J]  = numeroPoner++;
//		J++;
//		matriz[I][J]  = numeroPoner++;
//		I++;
//		matriz[I][J]  = numeroPoner++;
		int avance = 2;
		while(numeroPoner-1 != tamanio*tamanio) {
			I--;
			J--;
			
			for(int k = 0; k<avance; k++) {
				
				J++;
				matriz[I][J] = numeroPoner++;
			}
			for(int k = 0; k<avance; k++) {
				
				I++;
				matriz[I][J] = numeroPoner++;
			}
			
			for(int k = 0; k<avance; k++) {
				
				J--;
				matriz[I][J] = numeroPoner++;
			}
			
			for(int k = 0; k<avance; k++) {
				
				I--;
				matriz[I][J] = numeroPoner++;
			}
			avance += 2;
		}
		

		 
//		matriz[2][2] = 1;
		for(int i=0; i<tamanio; i++) {
			for(int j=0; j<tamanio; j++) {
//				matriz[0][0] = numero;
				if(matriz[i][j] < 10) {
					System.out.print("0");
				}
				System.out.print(matriz[i][j] + " ");
				
			}
			System.out.println();
		}
		
	}

}
