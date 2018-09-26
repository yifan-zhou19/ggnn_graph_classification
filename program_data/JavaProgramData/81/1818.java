package <missing>;

public class GlobalMembers
{
	public static int f(int[][] a, int n, int m)
	{
		int i;
		int t;
		if ((n >= 0 && n < 5) && (m >= 0 && m < 5))
		{
			for (i = 0;i < 5;i++)
			{
				t = a[n][i];
			a[n][i] = a[m][i];
			a[m][i] = t;
			}
		return 1;
		}

	 return 0;
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int m;
		int n;
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
		if (f(a, n, m) != 0)
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
					System.out.printf("%d\n",a[i][j]);
				}
				}
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}


}

