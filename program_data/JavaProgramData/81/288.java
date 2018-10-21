package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		int exchange = new int(int x,int y,int a[5][5]);

		for (i = 0;i < 5;i = i + 1)
		{
			for (j = 0;j < 5;j = j + 1)
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
		exchange(m, n, a);
		if (exchange(m, n, a) == 0)
		{
			System.out.print("error\n");
		}
		else if (exchange(m, n, a) == 1)
		{
			for (i = 0;i < 5;i = i + 1)
			{
				for (j = 0;j < 5;j = j + 1)
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
	}

	public static int exchange(int x, int y, int[][] a)
	{
		int z;
		int k;
		int temp;
		if (x < 5 && y < 5)
		{
			z = 1;
			for (k = 0;k < 5;k = k + 1)
			{
				temp = a[x][k];
				a[x][k] = a[y][k];
				a[y][k] = temp;
			}
		}
		else
		{
			z = 0;
		}
		return (z);
	}
}

