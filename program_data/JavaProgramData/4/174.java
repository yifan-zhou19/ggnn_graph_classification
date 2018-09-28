package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int m;
		int n;
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
		for (i = 0;i <= row - 1;i++)
		{
			for (j = 0;j <= col - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
			m = row + col - 2;
			for (n = 0;n <= m;n++)
			{
				for (i = 0;i <= row - 1;i++)
				{
					for (j = 0;j <= col - 1;j++)
					{
						if (i + j == n)
						{
							System.out.printf("%d\n",a[i][j]);
						}
					}
				}
			}

	}
}

