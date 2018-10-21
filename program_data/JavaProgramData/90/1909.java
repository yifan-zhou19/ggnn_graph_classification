package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int count;
		if (m == 1 || n == 1)
		{
			return 1;
		}
		if (m < n)
		{
			count = f(m, n - 1);
		}
		else
		{
			count = f(m - n, n) + f(m, n - 1);
		}
		return count;
	}

	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		int count;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			count = f(m, n);
			System.out.printf("%d\n",count);
		}

		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		return 0;
	}

}

