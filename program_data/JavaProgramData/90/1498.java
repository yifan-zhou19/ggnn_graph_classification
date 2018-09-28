package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		if (m < 0)
		{
			return 0;
		}
		if (n == 1)
		{
			return 1;
		}
		return f(m, n - 1) + f(m - n, n);
	}

	public static void Main()
	{
		int m;
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (t - .0.getValue() != 0)
		{
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
		}
	}
}

