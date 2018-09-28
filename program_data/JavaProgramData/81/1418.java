package <missing>;

public class GlobalMembers
{
	public static int change(int[][] a, int m, int n)
	{
		if ((m > 4) || (m < 0) || (n>4) || (n < 0))
		{
			return 0;
		}
		else
		{
			int i;
			int b;
			for (i = 0;i < 5;i++)
			{
				b = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = b;
			}
			return 1;
		}
	}

	public static void Main()
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
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		change(a, m, n);
		if (change(a, m, n) == 0)
		{
			System.out.print("error\n");
		}
		if (change(a, m, n) == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == 4)
					{
						System.out.printf("%d\n",a[i][j]);
					}
					else
					{
						System.out.printf("%d ",a[i][j]);
					}
				}
			}
		}
	}
}

