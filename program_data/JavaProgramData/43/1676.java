package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a;
		int b;
		int j;
		int l = 0;
		int e = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i += 2)
		{
			for (j = 3;j <= i / 2;j += 2)
			{
				if (i % j == 0)
				{
					l = l + 1;
				}
			}
			for (k = 3;k <= (n - i) / 2;k += 2)
			{
				if ((n - i) % k == 0)
				{
					e = e+1;
				}
			}
			if (l == 0 && e == 0)
			{
				System.out.printf("%d %d\n",i,n - i);
			}
			j = 3;
			k = 3;
	l = 0;
	e = 0;
		}
		return 0;
	}


}

