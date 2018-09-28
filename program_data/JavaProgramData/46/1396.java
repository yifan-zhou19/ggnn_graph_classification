package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[105][105];
		int row;
		int col;
		int i;
		int j;
		int t = 0;
		int temp = 0;
		int count = 0;
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
		int sum = row * col;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		while (true)
		{
			for (i = t;i < col - t;i++)
			{
				System.out.printf("%d\n",a[t][i]);
				count++;
			}
			if (count == sum)
			{
				break;
			}
			for (i = t + 1;i < row - t;i++)
			{
				System.out.printf("%d\n",a[i][col - t - 1]);
				count++;
			}
			if (count == sum)
			{
				break;
			}
			for (i = col - 2 - t;i >= t;i--)
			{
				System.out.printf("%d\n",a[row - t - 1][i]);
				count++;
			}
			if (count == sum)
			{
				break;
			}
			for (i = row - 2 - t;i > t;i--)
			{
				System.out.printf("%d\n",a[i][t]);
				count++;
			}
			if (count == sum)
			{
				break;
			}
			t++;
		}
		return 0;
	}



}

