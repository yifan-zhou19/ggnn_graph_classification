package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int b;
	 int c;
	 int d;
	 int e;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 a = n / 10000;
	 b = (n - 10000 * a) / 1000;
	 c = (n - 10000 * a - 1000 * b) / 100;
	 d = (n % 100) / 10;
	 e = n % 10;
	 if (a != 0)
	 {
		 System.out.printf("%d%d%d%d%d",e,d,c,b,a);
	 }
		   else if (b != 0)
		   {
			   System.out.printf("%d%d%d%d",e,d,c,b);
		   }
				 else if (c != 0)
				 {
					 System.out.printf("%d%d%d",e,d,c);
				 }
					  else if (d != 0)
					  {
						  System.out.printf("%d%d",e,d);
					  }
						   else if (e != 0)
						   {
							   System.out.printf("%d",e);
						   }
								 else
								 {
									 System.out.print("0");
								 }
	  return 0;
	}
}

