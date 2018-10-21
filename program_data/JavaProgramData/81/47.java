package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int m;
	int n;
	int row;
	int col;
	int[][] sz = new int[5][5];
	int[] e = new int[5];
	for (row = 0;row < 5;row++)
	{
		for (col = 0;col < 5;col++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sz[row][col] = Integer.parseInt(tempVar);
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
	if ((n >= 0 && n <= 4) && (m >= 0 && m <= 4))
	{
		for (i = 0;i < 5;i++)
		{
			e[i] = sz[n][i];
			sz[n][i] = sz[m][i];
			sz[m][i] = e[i];
		}
		for (row = 0;row < 5;row++)
		{
			for (col = 0;col < 5;col++)
			{
				if (col == 0)
				{
				  System.out.printf("%d",sz[row][col]);
				}
				else if (col == 4)
				{
				  System.out.printf(" %d\n",sz[row][col]);
				}
				else if (col > 0 && col < 4)
				{
					System.out.printf(" %d",sz[row][col]);
				}
			}
		}
	return 0;
	}
	else
	{
		System.out.print("error\n");
	return 0;
	}
	}
}

