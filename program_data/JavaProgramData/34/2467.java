package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int a = 3;
		  int b = 1;
		  int c = 2;
		  int s;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  while (n != 1)
		  {
					 if (n % 2 == 1)
					 {
							   s = n * a + b;
					 System.out.printf("%d*%d+%d=%d\n",n,a,b,s);
					 }
					 else
					 {
						 s = n / c;
					 System.out.printf("%d/%d=%d\n",n,c,s);
					 }
					 n = s;
		  }
		  System.out.print("End");
		  System.in.read();
		  System.in.read();
	}
}

