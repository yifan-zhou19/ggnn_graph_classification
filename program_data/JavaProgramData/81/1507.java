package <missing>;

public class GlobalMembers
{
	public static int down(int m, int n)
	{
		if (m <= 4 && m >= 0 && n <= 4 && n >= 0)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int[][] a = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
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
		if (down(m, n) == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i <= 4;i++)
			{
				if (i == m)
				{
					for (j = 0;j <= 3;j++)
					{
					System.out.printf("%d ",a[n][j]);
					}
					System.out.printf("%d",a[n][4]);
					System.out.print("\n");
				}
				if (i == n)
				{
					for (j = 0;j <= 3;j++)
					{
					System.out.printf("%d ",a[m][j]);
					}
					System.out.printf("%d",a[m][4]);
					System.out.print("\n");
				}
				else if (i != m && i != n)
				{
					for (j = 0;j <= 3;j++)
					{
					System.out.printf("%d ",a[i][j]);
					}
				System.out.printf("%d",a[i][4]);
				System.out.print("\n");
				}
			}
		}
	}

}

