package matrices;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int filas = 9;
		 int columnas = 9;
		 
		 //Lo ponemos como char para que quede mas bonito y sin 0
		 char [][] matriz = new char[filas][columnas];
		 
		 //insertar en la matriz numeros
//		matriz[5][7] = 100;

//		 int numero = 1;
//		for (int i = 0; i<filas; i++ ) {
//			for(int j=0; j<columnas; j++) {
				//insertar en todas las filas 1,2,3...
//				matriz[i][j] = i+1;
				//hacer que empiece en X numero y que vaya aumentando de 1 en 1
				//insertar en todas las columnas 1,2,3...
//				matriz[i][j] = j+1;
//				if(i == 0 || j == 0 || i == filas-1 || j == columnas-1) {
//					matriz[i][j] = 1;
//				}
				
				//NO FUNCIONA EJEMPLO MARIPOSA CON NUMEROS
//				if(j == 0 | j == columnas-1 | i == j | j == i-2 | i== j-2 | i == 2 ) {
//					
//					matriz[i][j] = 5;
//					
//				}
				
//			}
		 int perdida = 0;
		 for (int j=0; j<columnas; j++) {
			 
			 for(int i=perdida; i<filas-perdida;i++) {
				 
				 matriz[i][j] = '#';
				
			 }
			 if(j<columnas/2) {
				 perdida++;
			 }
			 else {
				 perdida--;
			 }
			 
		 }
			
		 for(int i=0; i<filas;i++) {
			 for(int j=0; j<columnas;j++) {
				
				 System.out.print(matriz[i][j]+ " ");
			 }
			 System.out.println();
		 }
		}
		 
		
	}


