public class fibonacci{
	public static void main(String args[]) {
		int n=10,p=0,q=1,sum=0;
		System.out.println("first"+" "+ n +" "+ "terms");
		for(int i=0;i<10;++i)
		{
			System.out.print(p+"+");
			sum=p+q;
			p=q;
			q=sum;
			
		}		

		
		
		
	}
	
	
	
	
}