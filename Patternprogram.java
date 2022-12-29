package assignment1;

public class Patternprogram {

	public static void main(String[] args) {
		int n=15;
				for(int i=0;i<n;i++)
		     {
	             for(int j=0;j<n;j++)
	             {
	            	 if(i==0||i==(n-1)||j==0||j==(n-1)||i>=(n-4)&&j>n/4&&j<3*n/4||i<=n/4&&i>0&&j<=n/4&&j>0&&j!=1||i<=n/4&&j>=3*n/4&&j!=(n-2)||i>n/4&&j>(3*n-2)/8&&j<(5*n-2)/8&&i<(n-1)/2)

	            	   {
	        	     System.out.print("*");
	                   }
	            	 else{
	                 System.out.print(" ");
	            	   }
	            	 
	            }
	             System.out.println();
	       }
				
		

}
	}
