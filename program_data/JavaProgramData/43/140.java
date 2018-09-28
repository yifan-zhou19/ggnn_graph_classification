package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int i;
		int t;
		double k;
		k = Math.sqrt(x);
		if (x % 2 == 0)
		{
			;
		}
		t = 0;
		if (x % 2 == 1)
		{
			for (i = 2;i <= k;i++)
			{
		   if (x % i == 0)
		   {
		   break;
		   }
			}
		   if (i > k)
		   {
		   t = 1;
		   }
		   else
		   {
		   t = 0;
		   }
		}
		   return t;
	}
	public static int Main()
	{
	   int m;
	   int j;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   for (j = 3;j <= (m / 2);j++)
	   {
		 if ((f(j) == 1) && (f(m - j) == 1))
		 {
		 System.out.printf("%d %d\n",j,m - j);
		 }
	   }
		 System.in.read();
		 System.in.read();
		 System.in.read();
	}


}

