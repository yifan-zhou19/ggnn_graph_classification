package <missing>;

public class GlobalMembers
{
	public static int left(int m,int n,int k)
	{
		int i;
		for (i = 1;i <= n;i++)
		{
			if (m % n != k)
			{
				return 0;
			}
			m = m - k - (m - k) / n;
		}
		return m;
	}
	public static int Main()
	{
		int n;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (m = 1;1;m++)
		{
			if (left(m, n, k) >= 1)
			{
				break;
			}
		}
		System.out.printf("%d",m);
		return 0;
	}
}

