package monopolio;

/*
 * Algoritmo para generar el tablero de Monopoly.
 * El tablero consta de:
 * 						1 casilla grande por esquina, a la que llamaremos "y" 
 * 						9 casillas normales entre las "y", las llamaremos "x"
 * Por lo que:
 * 			El alto sera igual a: 9x + 2y
 * 			El ancho sera igual a: 9x + 2y
 * 
 * Asi que usaremos de base una matriz de 11x11, para simular la estructura del tablero
 * 
 * */
public class GenerarTablero {

	public static void main(String[] args) {
		
		int fila = 11;		//Max rows
		int columna= 11; 	//Max columns
		
		String[][] matriz = new String[fila][columna];
		
		for(int i=0;i<fila;i++) {				//
			for(int j=0;j<columna;j++) {		//To test algorithm
				matriz[i][j] = "x";				//
			}
		}
		
		for(int f = 0; f<fila;f++) { 			//Row printing
			
			for(int c=0;c<columna;c++) {		//Column printing
				
				if(((f) == 0) || ((f) == 10)){																	//Top and Under
					if( ((f==0)&&(c==0)) || ((f==0)&&(c==10)) || ((f==10)&&(c==0)) || ((f==10)&&(c==10)) ) { 	//Corners
																												//
						System.out.print( matriz[f][c] + "x" );													//Change for corner box
																												//
					}																							//
					else System.out.print("i");																	//Change for normal box
				}
				
				else											//		Sides
				if(((f) >= 2) || ((f) <= 8)) {					//
					if( (c<1) ||(c>9) ) { 						//	Left and Right
																//
						System.out.print(matriz[f][c] + "0");	//Change for normal(horizontal) box
					}											//
					else {										//
						System.out.print("/");					//Change for void box
					}
				}
				

			}
			System.out.println();								//Line break for next row
		}
	}

}
