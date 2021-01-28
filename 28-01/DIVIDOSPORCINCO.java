package ExercicioUM;

public class DIVIDOSPORCINCO {
	
	public static void main (String args []) {
		
		float div, num;
		
		for (num=1000;num<=1999;num++) {
			
			div=num%11;
			if (div==5) {
				
				System.out.println("Números: "+num);
			}
								
			
		}
		
	}
	

}
