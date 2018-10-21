package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[9][9];
	public static int row;
	public static int line;
	public static int check(int M,int N)
	{
		int i;
		int j;
		for (i = 0;i < row;i++)
		{
			if (a[i][N] < a[M][N])
			{
				return 0;
			}
		}
		for (j = 0;j < line;j++)
		{
			if (a[M][j] > a[M][N])
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int i;
		int j;
		int judge = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			line = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < line;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < line;j++)
			{
				if (check(i, j) != 0)
				{
					System.out.printf("%d+%d\n",i,j);
					judge++;
					break;
				}
			}
			if (judge != 0)
			{
				break;
			}
		}
		if (judge == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}

