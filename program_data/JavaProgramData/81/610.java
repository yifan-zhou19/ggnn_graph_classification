package <missing>;

public class GlobalMembers
{
	public static int f(int[][] a, int n, int m)
	{
		if ((0 <= n != 0 && n < 5) && (0 <= m != 0 && m < 5))
		{
			int i;
			int temp;
			for (i = 0;i < 5;i++)
			{
				temp = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = temp;
			}
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int n;
		int m;
		int i;
		int j;
		int k;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		k = f(a, n, m);
		if (k == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j != 0)
					{
						System.out.print(" ");
					}
					System.out.printf("%d",a[i][j]);
				}
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print("error\n");
		}
	}

}

