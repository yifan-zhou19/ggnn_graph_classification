package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int n = 0;
		int row = 0;
		int col = 0;
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
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(a[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		n = row + col - 1;
		for (int k = 0;k < n;k++)
		{
			for (int i = 0;i < row;i++)
			{
				for (int j = 0;j < col;j++)
				{
					if (i + j == k)
					{
						System.out.printf("%d\n",a[i][j]);
					}
				}
			}
		}
		return 0;
	}
}

