package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int m;
	public static int asdf(int a)
	{
		int i;
		for (i = 1;i <= n;i++)
		{
			if (a % (n - 1) != 0)
			{
			return 0;
			}
			a = a / (n - 1) * n + k;
		}
		m = a;
		return 1;
	}
	public static int Main()
	{
		int i;
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
		for (i = n - 1;;i += (n - 1))
		{
			m = 0;
			if (asdf(i) != 0)
			{
				System.out.printf("%d",m);
				return 0;
			}
		}
	}
}

