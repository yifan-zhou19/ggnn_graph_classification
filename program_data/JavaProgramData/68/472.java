package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p = int x;
		int n;
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 6;m <= n;m = m + 2)
		{
		for (i = 3;i <= m / 2;i++)
		{
			if (p(i) == 1 && p(m - i) == 1)
			{
			System.out.printf("%d=%d+%d\n",m,i,m - i);
			break;
			}
		}
		}
		return 0;
	}
		public static int p(int x)
		{
		   int k;
		   int i;
		   int c;
		   k = (int)Math.sqrt(x);
		   for (i = 2;i <= k;i++)
		   {
			   if (x % i == 0)
			   {
				   break;
			   }
		   }
		   if (i > k)
		   {
			   c = 1;
		   }
		   else
		   {
			   c = 0;
		   }
		   return c;
		}
}

