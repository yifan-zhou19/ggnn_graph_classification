package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int m;
		m = 1;
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
		if (n == 2)
		{
		for (i = 1;i <= n + 1;i++)
		{
		m = m * n;
		}
		m = m - k * n + k;
		System.out.printf("%d",m);
		}
		else
		{
		for (i = 1;i <= n;i++)
		{
		m = m * n;
		}
		m = m - k * n + k;
		System.out.printf("%d",m);
		}
		return 0;
	}
}

