package <missing>;

public class GlobalMembers
{
	public static int change(int[][] a, int n, int m)
	{
		int i;
		int x;
		if (n > 4 || n < 0 || m>4 || m < 0)
		{
			return 0;
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				x = a[n][i];
				a[n][i] = a[m][i];
				a[m][i] = x;
			}
			return 1;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[][] a = new int[5][5];
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		y = change(a, m, n);
		if (y == 0)
		{
			System.out.print("error\n");
		}
		else
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

			return 0;
	}



}

