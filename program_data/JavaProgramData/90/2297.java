package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		if ((n == 1) || (m == 0))
		{
			return 1;
		}
		if (n > m)
		{
		return f(m, m);
		}
		if (n <= m)
		{
		return f(m, n - 1) + f(m - n, n);
		}
	}
	public static int Main()
	{
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t > 0)
		{
		int m;
		int n;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		System.out.printf("%d\n",f(m, n));
		t--;
		}
	}

}

