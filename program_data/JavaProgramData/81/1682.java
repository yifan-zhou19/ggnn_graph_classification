package <missing>;

public class GlobalMembers
{
	public static int fun(int[][] a, int n, int m)
	{
		int i;
		int t;
		if (!(n >= 0 && n < 5 && m >= 0 && m < 5))
		{
			return 0;
		}
		for (i = 0;i < 5;i++)
		{
			t = a[n][i];
			a[n][i] = a[m][i];
			a[m][i] = t;
		}
		return 1;
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int n;
		int m;
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		i = fun(a, n, m);
		if (i == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
	if (j != 4)
	{
					System.out.printf("%d ",a[i][j]);
	}
	else
	{
		System.out.printf("%d",a[i][j]);
	}
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

