package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int exchange = new int(int a[5][5],int n,int m);
		int[][] a = new int[5][5];
		int n;
		int m;
		int i;
		int j;
		int y;
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
		y = exchange(a, n, m);
		if (y == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					System.out.printf("%d",a[i][j]);
					if (j != 4)
					{
						System.out.print(" ");
					}
				}
				System.out.print("\n");
			}
		}


		return 0;
	}


	public static int exchange(int[][] a, int n, int m)
	{
		int z;
		int k;
		int i;
		int j;
		if (n >= 0 && n < 5 && m >= 0 && m < 5)
		{
			for (j = 0;j < 5;j++)
			{
				k = a[m][j];
				a[m][j] = a[n][j];
				a[n][j] = k;
			}
			z = 1;
		}
		else
		{
			z = 0;
		}
		return z;
	}

}

