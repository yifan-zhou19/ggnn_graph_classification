package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int sum(int x,int y)
	{
	   int c;
	   int i;
	   if (x > Math.sqrt(y))
	   {
		   c = 0;
	   }
	   else
	   {
		   if (y % x == 0)
		   {
			   for (i = x,c = 1;i <= (y / 2) + 1;i++)
			   {
				   if ((y / x) % i == 0)
				   {
					   c = c + sum(i, (y / x));
				   }
			   }
		   }
		   else
		   {
			   c = 0;
		   }
	   }
	   return (c);
	}
	public static int Main()
	{
		int i;
		int k;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
			k = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (i = 2;i <= (m / 2) + 1;i++)
			{
				k = k + sum(i, m);
			}
				System.out.printf("%d\n",k + 1);
		}
	}

}

