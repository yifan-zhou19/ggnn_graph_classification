package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int time = 0;
		int i;
		int j;
		int way;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
			for (i = 0;i < 100;i++)
			{
				for (j = 0;j < 100;j++)
				{
					b[i][j] = 1;
				}
			}
			i = -1;
			j = -1;
			way = 0;
			while (time < row * col)
			{
				if (way == 0)
				{
					for (i = i + 1, j = j + 1;j < col && b[i][j] != 0;j++)
					{
						System.out.printf("%d\n",a[i][j]);
					 b[i][j] = 0;
					 time++;
					}

					way = 1;

				}
				if (way == 1)
				{
					for (j = j - 1, i = i + 1;(b[i][j] != 0) && (i < row);i++)
					{

						System.out.printf("%d\n",a[i][j]);
						b[i][j] = 0;
						time++;

					}
					way = 2;
				}
				if (way == 2)
				{
					for (i = i - 1, j = j - 1;b[i][j] != 0 && j >= 0;j--)
					{

						System.out.printf("%d\n",a[i][j]);
						b[i][j] = 0;
						time++;

					}
					 way = 3;
				}
				if (way == 3)
				{
					for (i = i - 1, j = j + 1;b[i][j] != 0 && i >= 0;i--)
					{
						System.out.printf("%d\n",a[i][j]);
						b[i][j] = 0;
						time++;
					}
					 way = 0;
				}

			}
	}

}

