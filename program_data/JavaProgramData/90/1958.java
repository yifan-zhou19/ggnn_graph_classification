package <missing>;

public class GlobalMembers
{
	public static int fpg(int m,int n)
	{
		int ff;
		ff = 0;
		if ((m == 1) || (n == 1) || (m == 0) || (n == 0))
		{
			ff = 1;
			return 1;
		}
		else if (m >= n)
		{
			ff = ff + fpg(m - n, n);
					  ff = ff + fpg(m, n - 1);
		}
		else
		{
				 ff = ff + fpg(m, n - 1);
		}
		return ff;
	}
	public static int Main()
	{
		int m;
		int i;
		int t;
		int n;
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
			System.out.printf("%d\n",fpg(m, n));
		}
		return 0;
	}

}

