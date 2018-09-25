package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int k = 0;
		if (m == 0)
		{
			k = 1;
		}
		if (m == 1)
		{
			k = 1;
		}
		if (n == 1)
		{
			k = 1;
		}
		if (m < n && m>1)
		{
			k = f(m, n - 1);
		}
		if (m >= n != 0 && n > 1)
		{
			k = f(m, n - 1) + f(m - n, n);
		}
		return k;
	}
	public static int Main()
	{
		int t;
		int i;
		int k;
		int m;
		int n;
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
			k = f(m, n);
			System.out.printf("%d\n",k);
		}
		return 0;
	}

}

