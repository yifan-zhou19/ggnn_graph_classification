package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int k;
		if (m < n)
		{
			if (m == 1)
			{
				k = 1;
			}
			else
			{
				k = f(m, m);
			}
		}
		if (m >= n)
		{
			if (n == 1 || n == 0)
			{
				k = 1;
			}
			else
			{
				k = (f(m, (n - 1)) + f((m - n), n));
			}
		}
		return (k);

	}
	public static void Main()
	{
		int n;
		int m;
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
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
			int y = f(m, n);
			System.out.printf("%d\n",y);
		}

	}

}

