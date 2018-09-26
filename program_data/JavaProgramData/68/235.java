package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sun = int x;
		int n;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 6;m <= n;m = m + 2)
		{
		   for (i = 3;i <= m / 2;i = i + 2)
		   {
			   if (sun(i) == 1 && sun(m - i) == 1)
			   {
			   break;
			   }
		   }
			   System.out.printf("%d=%d+%d\n", m, i, m - i);
		}
		 return 0;
	}

	   public static int sun(int x)
	   {
		   int j;
		   int A;
		   int t;
		   t = Math.sqrt(x);
		   for (j = 2;j <= t;j++)
		   {
			   if (x % j == 0)
			   {
				   break;
			   }
		   }
			if (j > t)
			{
				A = 1;
			}
			else
			{
				A = 2;
			}
			return (A);
	   }

}

