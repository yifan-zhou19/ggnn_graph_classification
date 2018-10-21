package <missing>;

public class GlobalMembers
{
	public static int A(int n)
	{
		int i;
		int d = 0;
		for (i = 2;i < n;i++)
		{
			if ((n % i) == 0)
			{
				d = 1;
				return 0;
			}
		}
		if (d == 0)
		{
			return 1;
		}
	}
	public static int Main()
	{
		int m;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 2;j <= m / 2;j++)
		{
			if (A(j) != 0 && A(m - j) != 0)
			{
				System.out.printf("%d %d\n",j,m - j);
			}
		}
		return 0;
	}

}

