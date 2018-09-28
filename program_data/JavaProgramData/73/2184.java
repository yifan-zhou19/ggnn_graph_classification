package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		int row;
		int col;
		int max;
		for (i = 0;i < 5;i++)
		{
			max = 0;
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] >= max)
				{
					max = a[i][j];
					row = i;
					col = j;
				}
			}
			for (j = 0;j < 5;j++)
			{
				if (max > a[j][col])
				{
					break;
				}
			}
			if (j == 5)
			{
				System.out.printf("%d %d %d",row + 1,col + 1,max);
				return 0;
			}
		}
		System.out.print("not found\n");
		return 0;
	}

}

