package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n / 10000 == 1)
		{
		System.out.print("00001");
		}
		else if (n / 1000 != 0)
		{
			a = n;
		  b = a % 10;
		  a = a / 10;
		  c = a % 10;
		  a = a / 10;
		  d = a % 10;
		  a = a / 10;
		  System.out.printf("%d%d%d%d",b,c,d,a);
		}
		else if (n / 100 != 0)
		{
		 a = n;
		  b = a % 10;
		  a = a / 10;
		  c = a % 10;
		  a = a / 10;
		  System.out.printf("%d%d%d",b,c,a);
		}
		  else if (n / 10 != 0)
		  {
		   a = n;
		   b = a % 10;
		   a = a / 10;
		   System.out.printf("%d%d",b,a);
		  }
		   else
		   {
			   System.out.printf("%d",n);
		   }
		   return 0;
	}

}

