
public class StringRev {
	public static void main(String args[]) 
	{
		String x="jai";
		char y[]=x.toCharArray();
		int size=y.length;
		char a[]=new char[size];
		int i=0;
		while(i!=size) 
		{
			a[size-1-i]=y[i];
			++i;
		}
		System.out.println(y);
		System.out.println(a);
		
	}

}
/*for(int i= chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);
            
     in place of y       */
