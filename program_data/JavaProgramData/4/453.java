package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[101][101];
		int i;
		int j;
		int k;
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
				a[i][j] = Integer.parseInt(tempVar3);
			}
			}
		}
		for (k = 2;k <= row + col;k++)
		{
			if (k <= col + 1)
			{
				for (j = k - 1;j >= 1 && k - j <= row;j--)
				{
					System.out.printf("%d\n",a[k - j][j]);
				}
			}
			if (k > col + 1)
			{
				for (j = col;j >= 1 && k - j <= row;j--)
				{
					System.out.printf("%d\n",a[k - j][j]);
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			row = Integer.parseInt(tempVar4);
		}
		return 0;
	}
}

