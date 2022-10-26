
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//q-3
int m = 20;
		
		for(int i=0; i<m; i++) {
			
			for(int j=0; j<m; j++) {
				
				if( i==m-1 || (i-j>(m-1)/2)|| (i+j>m-1+(m-1)/2)) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			
			
			System.out.println();
			

	}

}}
