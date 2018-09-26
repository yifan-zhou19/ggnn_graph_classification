package <missing>;

public class GlobalMembers
{
	public static void f(int n,int k)
	{
		int m;
		int i;
		int e;
		for (m = n + k;;m = e+1)
		{
			e = m;
			for (i = 1;i <= n;i++)
			{
				if ((m - k) % n || m - k < n)
				{
					break;
				}
				else
				{
					m -= (m - k) / n + k;
				}
			}
			if (i == n + 1)
			{
				System.out.printf("%d\n",e);
				break;
			}
		}
	}
	public static int Main()
	{
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
		f(n, k);
		return 0;
	}
}

