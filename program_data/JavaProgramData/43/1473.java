package <missing>;

public class GlobalMembers
{
	public static int fun(int x)
	{
		int b = 1;
		for (int a = 2;a < x;a++)
		{
		   if (x % a == 0)
		   {
			  b = 0;
			  break;
		   }
		}
		return b;
	}
	public static int Main()
	{
	   int m;
	   int n;
	   int k;
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   n = m / 2;
	   k = (n + 1) / 2;
	   for (i = 2;i <= k;i++)
	   {
		  int c = 2 * i - 1;
		  if (fun(c) == 1 && fun(m - c) == 1)
		  {
			 System.out.printf("%d %d\n",c,m - c);
		  }
	   }
	   System.in.read();
	   System.in.read();
	}

}

