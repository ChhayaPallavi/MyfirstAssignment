
public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//q-5

		
int p = 20;
		
		for(int i=0; i<p; i++) {
			
			for(int j=0; j<p; j++) {
				
				if(i==0 || i==p-1 || (i+j<(p-1)/2)||(i-j>(p-1)/2) ) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			
			System.out.println();
			
	}

}}
