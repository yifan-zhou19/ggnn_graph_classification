package <missing>;

public class GlobalMembers
{
	public static int pf(int m,int n)
	{
		int c;
		int i = 0;
		if (m == 0 || n == 1)
		{
			c = 1;
		}
		else if (m < n)
		{
			c = pf(m, (n - 1));
		}
		else
		{
			c = pf(m, (n - 1)) + pf((m - n), n);
		}
		return c;
	}
	public static int Main()
	{
		int a;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= a;i++)
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
			System.out.printf("%d\n",pf(m, n));
		}
		return 0;
	}
}

