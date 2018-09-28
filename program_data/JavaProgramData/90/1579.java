package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
	   int c;
	   if (n == 1 || m == 1 || m == 0)
	   {
		   c = 1;
	   }
	   else if (m < 0)
	   {
		   c = 0;
	   }
	   else
	   {
		   c = f(m, n - 1) + f(m - n, n);
	   }
	   return c;
	}
	public static int Main()
	{
		int m;
		int n;
		int c;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= c;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			k = f(m, n);
			System.out.printf("%d\n",k);
		}

	}


}

