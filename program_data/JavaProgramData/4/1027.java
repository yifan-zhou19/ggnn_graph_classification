package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int row;
		int col;
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
		for (i = 1;i <= row;i++)
		{
			for (j = 1;j <= col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i - 1][j - 1] = Integer.parseInt(tempVar3);
				}
			}
		}
		int sum;
		for (sum = 2;sum <= (col + row);sum++)
		{
			if (sum <= col + 1)
			{
				for (i = 1, j = sum - 1;i < sum && i <= row != 0 && j <= col;i++, j--)
				{
					System.out.printf("%d\n",a[i - 1][j - 1]);
				}
			}
			else
			{
				for (i = sum - col, j = sum - i;i < sum && i <= row != 0 && j <= col;i++, j--)
				{
					System.out.printf("%d\n",a[i - 1][j - 1]);
				}
			}
		}

		return 0;
	}
}

