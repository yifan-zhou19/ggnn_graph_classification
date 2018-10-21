package <missing>;

public class GlobalMembers
{
	public static int pl(int m,int n)
	{
	   int c;
	   if (m == 0)
	   {
	   c = 1;
	   }
	   else if (m < 0)
	   {
	   c = 0;
	   }
	   else if (n == 1)
	   {
	   c = 1;
	   }

	   else
	   {
	   c = pl(m - n, n) + pl(m, n - 1);
	   }

	   return c;
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int t;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
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
			c = pl(m, n);
			System.out.printf("%d\n",c);
		}
	}


}

