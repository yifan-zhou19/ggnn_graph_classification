package <missing>;

public class GlobalMembers
{
	public static int p(int x, int y, int[][] c)
	{
		int i = 0;
		int b;
		if (x >= 0 && x < 5 && y >= 0 && y < 5)
		{
		for (i = 0;i < 5;i++)
		{
			b = c[x][i];
			c[x][i] = c[y][i];
			c[y][i] = b;
		}
		return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int n;
		int m;
		int[][] a = new int[5][5];
		int i;
		int j;
		int k = 0;
		int l = 0;
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
		if (p(m, n, a) == 1)
		{
			for (i = 0;i < 5;i++)
			{
				System.out.printf("%d",a[i][0]);
				for (j = 1;j < 5;j++)
				{
					System.out.printf(" %d",a[i][j]);
				}
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print("error");
		}
	}
}

