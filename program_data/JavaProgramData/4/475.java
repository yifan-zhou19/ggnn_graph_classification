package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
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
		int i;
		int j;
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
		int t;
		for (t = 0;t <= row + col - 2;t++)
		{
			if (t == 0)
			{
				System.out.printf("\n%d",a[0][0]);
			}
			else if (t > 0)
			{
				if (t <= col - 1)
				{
					for (i = t;i >= 0;i--)
					{
						if (t - i >= 0 && t - i <= row - 1)
						{
							System.out.printf("\n%d",a[t - i][i]);

						}
					}
				}
				else
				{
					for (i = col - 1;i >= 0;i--)
					{
						if (t - i >= 0 && t - i <= row - 1)
						{
							System.out.printf("\n%d",a[t - i][i]);

						}
					}

				}

			}
		}

	return 0;
	}
}

