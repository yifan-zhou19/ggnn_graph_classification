package <missing>;

public class GlobalMembers
{
	public static int a(int n,int m)
	{
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int[][] c = new int[5][5];
		int[] e = new int[5];
		int d;
		int i;
		int j;
		int n;
		int m;

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					c[i][j] = Integer.parseInt(tempVar);
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
		d = a(n, m);
		if (d == 1)
		{
			for (j = 0;j < 5;j++)
			{
				e[j] = c[n][j];
				c[n][j] = c[m][j];
				c[m][j] = e[j];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j < 4)
					{
					System.out.printf("%d ",c[i][j]);
					}
					else
					{
						System.out.printf("%d\n",c[i][j]);
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

