package <missing>;

public class GlobalMembers
{
	public static int change(int m,int n)
	{
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
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
		int n;
		int m;
		int i;
		int j;
		int p;
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
		if (change(m, n) == 0)
		{
			System.out.print("error");
		}
		else if (change(m, n) == 1)
		{
			for (i = 0;i < 5;i++)
			{
				p = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = p;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					System.out.printf("%d",a[i][j]);
					if (j < 4)
					{
						System.out.print(" ");
					}
					if (i < 4 && j == 4)
					{
						System.out.print("\n");
					}
				}
			}
		}
	}
}

