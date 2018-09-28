package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int sum;
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
		int[][] a = new int[100][100];
		int i;
		int j;
		for (i = 0;i < row;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][0] = Integer.parseInt(tempVar3);
			}
			for (j = 1;j < col;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					a[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}
		for (sum = 0;sum < (row + col - 1);sum++)
		{
			for (i = 0;i <= sum;i++)
			{
				if (i < row && (sum - i) < col)
				{
				System.out.printf("%d\n",a[i][sum - i]);
				}
			}
		}
		return 0;
	}

}

