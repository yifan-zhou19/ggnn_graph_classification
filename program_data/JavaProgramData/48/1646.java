package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[][] num1 = new int[11][11];
	public static int[][] num2 = new int[11][11];
	public static int i;
	public static int j;
	public static int t;
	public static int num(int x,int y)
	{
		int N;
		N = num1[x - 1][y - 1] + num1[x][y - 1] + num1[x + 1][y - 1] + num1[x - 1][y] + num1[x + 1][y] + num1[x - 1][y + 1] + num1[x][y + 1] + num1[x + 1][y + 1];
		return N;
	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		num1[5][5] = num2[5][5] = m;
		for (t = 1;t <= n;t++)
		{
			for (i = 5 - t;i <= 5 + t;i++)
			{
				for (j = 5 - t;j <= 5 + t;j++)
				{
					num2[i][j] = 2 * num1[i][j] + num(i, j);
				}
			}
			for (i = 5 - t;i <= 5 + t;i++)
			{
				for (j = 5 - t;j <= 5 + t;j++)
				{
					num1[i][j] = num2[i][j];
				}
			}
		}
		for (i = 1;i < 10;i++)
		{
				for (j = 1;j < 10;j++)
				{
					if (j == 1)
					{
						System.out.printf("%d",num1[i][j]);
					}
					else
					{
						System.out.printf(" %d",num1[i][j]);
					}
				}
				System.out.print("\n");
		}
	}

}

