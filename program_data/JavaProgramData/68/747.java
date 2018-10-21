package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int su;
		int su2;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (j = 3;(2 * j) <= i;j = j + 2)
			{
				su = j;
				su2 = i - su;
				for (k = 3;(k * k) <= i;k = k + 2)
				{
				if ((((su % k) == 0) && (su > k)) || (((su2 % k) == 0) && (su2 > k)))
				{
				q = 1;
				break;
				}
				}
				if (q == 0)
				{
				System.out.printf("%d=%d+%d\n",i,su,su2);
				break;
				}
				else
				{
				q = 0;
				}

			}
		}
	}
}

