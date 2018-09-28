package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
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
		int[][] sz = new int[100][100];
		int i;
		int j;
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
		int n;
		int time = 0;
		i = 0,j = 0;
		for (n = 0;;n++)
		{
			for (;j < col - n;j++)
			{
				System.out.printf("%d\n",sz[i][j]);
				time++;
			}
			if (time == row * col)
			{
					break;
			}
			j--;
			i++;
			for (;i < row - n;i++)
			{
				System.out.printf("%d\n",sz[i][j]);
				time++;
			}
			if (time == row * col)
			{
					break;
			}
			i--;
			j--;
			for (;j > n - 1;j--)
			{
				System.out.printf("%d\n",sz[i][j]);
				time++;
			}
			if (time == row * col)
			{
					break;
			}
			j++;
			i--;
			for (;i > n;i--)
			{
				System.out.printf("%d\n",sz[i][j]);
				time++;
			}
			if (time == row * col)
			{
					break;
			}
			i++;
			j++;
		}
		return 0;
	}


}

