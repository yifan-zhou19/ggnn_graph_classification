package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] number = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int a = 0;
		int zongshu = 0;
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
					number[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (a = 0;a >= 0;a++)
		{
			for (j = a;j < col - a;j++)
			{
				System.out.printf("%d\n",number[a][j]);
				zongshu++;
			}
			if (zongshu == row * col)
			{
				break;
			}
			for (i = a + 1;i < row - a;i++)
			{
				System.out.printf("%d\n",number[i][col - a - 1]);
				zongshu++;
			}
			if (zongshu == row * col)
			{
				break;
			}
			for (j = col - 2 - a;j >= a;j--)
			{
				System.out.printf("%d\n",number[row - a - 1][j]);
				zongshu++;
			}
			if (zongshu == row * col)
			{
				break;
			}
			for (i = row - 2 - a;i > a;i--)
			{
				System.out.printf("%d\n",number[i][a]);
				zongshu++;
			}
			if (zongshu == row * col)
			{
				break;
			}
		}
		return 0;
	}


}

