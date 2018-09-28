package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
	if (m == 0 || m == 1)
	{
		return 1;
	}
	if (n == 0 || n == 1)
	{
		return 1;
	}
	if (m < n)
	{
		return f(m, m);
	}
	else
	{
		return f(m - n, n) + f(m, n - 1);
	}
	}
	public static int Main()
	{
		int t = 0;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t-- != 0)
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
			System.out.printf("%d\n",f(m, n));
		}

		return 0;
	}
}

