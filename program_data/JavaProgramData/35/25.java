package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int ii;
		int j;
		int jj;
		int m;
		int n;
		int[][] grid = new int[9][9];
		int real = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (ii = 0;ii < n;ii++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					grid[i][ii] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (ii = 0;ii < n;ii++)
			{
							   if (real != 2)
							   {
				real = 1;
							   }
				for (jj = 0;jj < n;jj++)
				{
					if (jj == ii)
					{
						continue;
					}
					if (real == 1)
					{
						real = (grid[i][ii] > grid[i][jj])?1:0;
					}
				}
				for (j = 0;j < m;j++)
				{
					if (i == j)
					{
						continue;
					}
					if (real == 1)
					{
						real = (grid[i][ii] < grid[j][ii])?1:0;
					}
				}
				if (real == 1)
				{
					System.out.printf("%d+%d",i,ii);
					real = 2;
				}
			}
		}
		if (real == 0)
		{
			System.out.print("No");
		}
	}
}

