package <missing>;

public class GlobalMembers
{
	public static int product(int n,int m)
	{
		int z;
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			z = 1;
		}
		else
		{
			z = 0;
		}
		return z;
	}
	public static void Main()
	{
		int product = new int(int n,int m);
		int[] t = new int[5];
		int[][] a = new int[5][5];
		int x;
		int y;
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
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			k = product(x, y);
			if (k == 0)
			{
				System.out.print("error");
			}
			else
			{
				for (j = 0;j < 5;j++)
				{
					t[j] = a[x][j];
					a[x][j] = a[y][j];
					a[y][j] = t[j];
				}

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
	}
}

