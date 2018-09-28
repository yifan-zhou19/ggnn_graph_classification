package <missing>;

public class GlobalMembers
{
	public static int change(int a, int b)
	{
		if (a >= 0 && a <= 4 && b >= 0 && b <= 4)
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] b = new int[5];
		int i;
		int j;
		int x;
		int y;
		int result;
		for (i = 0;i < 5;i++)
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
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		result = change(x, y);
		if (result == 0)
		{
			System.out.print("error");
		}
		if (result == 1)
		{
			for (i = 0;i <= 4;i++)
			{
			b[i] = a[x][i];
			a[x][i] = a[y][i];
			a[y][i] = b[i];
			}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (j == 0)
				{
				System.out.printf("%d",a[i][j]);
				}
				if (j >= 1 && j <= 3)
				{
				System.out.printf(" %d",a[i][j]);
				}
				if (j == 4)
				{
					if (i == 4)
					{
					System.out.printf(" %d",a[i][j]);
					}
					else
					{
					System.out.printf(" %d\n",a[i][j]);
					}
				}
			}
		}
		}
		return 0;
	}
}

