package test;

public class demo {

	public static void main(String[] args) {
		
		int a = 0 ;
		int	b = 1;
		int c;
		int count = 20;
		//System.out.print(a+",");
	//	System.out.print(b+",");
		
		for( int i = 0; i<count;i++)
		{
			c = a+b;
					
		System.out.print(c+",");  //figoneccis program
		 
		a=b;
		b=c;
				
		}
	
	
		
	}
}