package <missing>;

public class GlobalMembers
{
	public static int hang(int i, int row, int col, int[][] sz) //?????????????
	{
	int j;
	int max;
	max = sz[i][0];
	for (j = 1;j < col;j++)
	{
	if (sz[i][j] > max)
	{
	max = sz[i][j];
	}
	}
	return max;
	}
	public static int lie(int j, int row, int col, int[][] sz) //?????????????
	{
	int i;
	int min;
	min = sz[0][j];
	for (i = 1;i < row;i++)
	{
		if (sz[i][j] < min)
		{
			min = sz[i][j];
		}
	}
	return min;
	}
	public static void Main()
	{
	int row;
	int col;
	int i;
	int j;
	int[][] sz = new int[8][8];
	int flag = 0;
	int m;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		row = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
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
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				m = hang(i, row, col, sz);
				n = lie(j, row, col, sz);
				if (m == n) //??????????????
				{
					System.out.printf("%d+%d\n",i,j);
					flag++;
					break;
				}
			}
			if (flag == 1)
			{
				break;
			}
		}
		/*	for(i=0;i<row;i++)
			{
			for(j=0;j<col;j++)
			{
				printf("%d",sz[i][j]);
			}
			}*/

		if (flag == 0)
		{
		System.out.print("No\n");
		}
	}
}

