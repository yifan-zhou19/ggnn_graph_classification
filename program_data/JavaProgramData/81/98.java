package <missing>;

public class GlobalMembers
{
	public static int hanshu(int x, int y)
	{
		int result;
		if (x >= 0 && x <= 4 && y <= 4 && y >= 0)
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		return result;
	}
	public static int Main()
	{
		int[][] x = new int[5][5];
		int n;
		int m;
		int i;
		int e;
		int c;
		int j;
		int a;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					x[i][j] = Integer.parseInt(tempVar);
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
		c = hanshu(n, m);
		if (c == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				e = x[n][i];
				x[n][i] = x[m][i];
				x[m][i] = e;
			}
			for (a = 0;a < 5;a++)
			{
			for (j = 0;j < 5;j++)
			{
				if (j < 4)
				{
				System.out.printf("%d ",x[a][j]);
				}
				else
				{
					System.out.printf("%d",x[a][j]);
				}
			}
			System.out.print("\n");
			}
		}
		return 0;
	}

}

