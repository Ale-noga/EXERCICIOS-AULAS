package ExercicioUM;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class DUASMATRIZES {

	public static void main (String args[]) {
		
		int x,y,matum[][] = new int [4][6];
		int matdois[][] = new int [4][6]; 
		int mattres[][] = new int [4][6]; 
		int matquatro[][] = new int [4][6]; 
						
		for (x=0;x<4;x++) {
									
			for (y=0;y<6;y++) {
				matum[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Informe os dados da MATRIZ A:\n"+(x+1)+"a. LINHA | COLUNA "+(y+1)));
			}
			
		}
					
		for (x=0;x<4;x++) {
									
			for (y=0;y<6;y++) {
								
				matdois[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Informe os dados da MATRIZ B:\n"+(x+1)+"a. LINHA | COLUNA "+(y+1)));
			}
			
		}
		
		for (x=0;x<4;x++) {
								
			for (y=0;y<6;y++) {
			
			mattres[x][y]= matum[x][y]+matdois[x][y];
			matquatro[x][y]= matum[x][y]-matdois[x][y];
						
			}
			
		}
															
				String matriz3 = Arrays.deepToString(mattres);

				JOptionPane.showMessageDialog(null,"Matriz 3:\n"+matriz3);				
		
		
				String matriz4 = Arrays.deepToString(mattres);

				JOptionPane.showMessageDialog(null,"Matriz 4:\n"+matriz4);
							
		
}
}
