package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int g;
		int k;
		int p;
		int num;
		int time = 0;
		int[][] sz = new int[110][110];
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
		num = row * col;
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
		for (i = 0;;i++)
		{
			for (j = i;j < col - i;j++)
			{
				System.out.printf("%d\n",sz[i][j]);
				time++;
			}
			  if (time == num)
			  {
				  break;
			  }
			for (g = 1 + i;g < row - i;g++)
			{
				System.out.printf("%d\n",sz[g][col - 1 - i]);
				time++;
			}
			  if (time == num)
			  {
				  break;
			  }
			for (k = col - 2 - i;k >= i;k--)
			{
				System.out.printf("%d\n",sz[row - 1 - i][k]);
				time++;
			}
			  if (time == num)
			  {
				  break;
			  }
			for (p = row - 2 - i;p > i;p--)
			{
				System.out.printf("%d\n",sz[p][i]);
				time++;
			}
			  if (time == num)
			  {
				  break;
			  }
		}
	}


}

