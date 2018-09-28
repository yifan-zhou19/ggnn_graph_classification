package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int k;
		int p;
		int q;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 6;m <= n;m = m + 2)
		{
			for (a = 3;a <= m / 2;a = a + 2)
			{
			p = (int)Math.sqrt(a);
				 q = (int)Math.sqrt(m - a);
		for (i = 2;i <= p;i++)
		{
			if (a % i == 0)
			{
				break;
			}
		}
		for (k = 2;k <= q;k++)
		{
			if ((m - a) % k == 0)
			{
				break;
			}
		}
		if (i > p && k > q)
		{
			System.out.printf("%d=%d+%d\n",m,a,m - a);
			break;
		}
			}
		}
		  return 0;

	}




}

