package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[Row][Col];
		int i;
		int k;
		int m;
		int j;
		int row;
		int col;
		int temp1 = 0;
		int temp2 = 0;
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
					(sz[i][j]) = Integer.parseInt(tempVar3);
				}
		}
		}
		for (i = 0;i < row;i++)
		{
	for (j = 0;j < col;j++)
	{
	for (k = 0;k < col;k++)
	{
		if (k == j)
		{
			continue;
		}
		if (sz[i][j] > sz[i][k])
		{
			temp1++;
		}
	}
	for (m = 0;m < row;m++)
	{
		if (m == i)
		{
			continue;
		}
		if (sz[i][j] < sz[m][j])
		{
		   temp2++;
		}
	}
		if (temp1 == col - 1 && temp2 == row - 1)
		{
			System.out.printf("%d+%d\n",i,j);
			break;
		}
		else
		{
			temp1 = 0;
			temp2 = 0;

		}
	}
	if (temp1 == col - 1 && temp2 == row - 1)
	{
	 break;
	}
		}
	if (temp1 == 0 && temp2 == 0)
	{
		System.out.print("No\n");
	}
	return 0;
	}

}

