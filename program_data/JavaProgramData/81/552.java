package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int n;
		int m;
		int l;
		int i;
		int j;
		int swap = new int(int a[][5],int,int);
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
		l = swap(a, m, n);
		if (l == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == 0)
					{
					System.out.printf("%d",a[i][j]);
					}
					else
					{
					System.out.printf(" %d",a[i][j]);
					}
				}
				System.out.print("\n");
			}
		}
	}

	public static int swap(int[][] a, int x, int y)
	{
		int z;
		int j;
		int m;
		if (x >= 0 && x < 5 && y >= 0 && y < 5)
		{
			z = 1;
			for (j = 0;j < 5;j++)
			{
				m = a[x][j];
				a[x][j] = a[y][j];
				a[y][j] = m;
			}
		}
		else
		{
			z = 0;
		}
		return (z);
	}
}

