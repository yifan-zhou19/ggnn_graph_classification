package <missing>;

public class GlobalMembers
{
	public static int ok(int m, int n, int k)
	{
		int i;
		for (i = 1;i <= n;i++)
		{
			if (m / n < 1 || m % n != k)
			{
				return 0;
			}
			m = m - m % n - m / n;
		}
		return 1;
	}
	public static void Main()
	{
		int m;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (m = 1;;m++)
		{
			if (ok(m, n, k) != 0)
			{
				break;
			}
		}
		System.out.printf("%d\n",m);
	}

}

