package <missing>;

public class GlobalMembers
{
	public static int times(int x,int y)
	{
		int z;
		z = (x < y)?x:y;
		if (z % 2 != 0)
		{
			return (z + 1) / 2;
		}
		else
		{
			return z / 2;
		}
	}
	public static void spinout(int[][] b, int x, int y)
	{
		int i;
		int j;
		int[][] k = new int[100][100];
		for (i = 0;i < times(x, y);i++)
		{
			for (j = 0;j < y;j++)
			{
				if (k[i][j] == 0)
				{
					System.out.printf("%d\n",b[i][j]);
					k[i][j] = 1;
				}
			}
			for (j = 0;j < x;j++)
			{
				if (k[j][y - 1 - i] == 0)
				{
					System.out.printf("%d\n",b[j][y - 1 - i]);
					k[j][y - 1 - i] = 1;
				}
			}
			for (j = y - 1;j >= 0;j--)
			{
				if (k[x - 1 - i][j] == 0)
				{
					System.out.printf("%d\n",b[x - 1 - i][j]);
					k[x - 1 - i][j] = 1;
				}
			}
			for (j = x - 1;j >= 0;j--)
			{
				if (k[j][i] == 0)
				{
					System.out.printf("%d\n",b[j][i]);
					k[j][i] = 1;
				}
			}
		}
	}
	public static void Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					*(a + i) + j = tempVar3;
				}
			}
		}
		spinout(a, row, col);
	}
}

