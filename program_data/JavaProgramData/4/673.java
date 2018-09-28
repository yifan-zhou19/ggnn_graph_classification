package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int col;
		int row;
		int i;
		int j;
		int n;
		int[][] a = new int[101][101];
		int t;
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
		for (i = 0;i <= row + col - 2;i++)
		{
			for (j = 0;j <= i;j++)
			{
				if (j < row && (i - j) < col)
				{
				System.out.printf("%d\n",a[j][i - j]);
				}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			t = Integer.parseInt(tempVar4);
		}
	}
}

