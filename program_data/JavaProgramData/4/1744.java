package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] s = new int[100][100];
		int i;
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
		for (i = 0;i < row;i++)
		{
			for (k = 0;k < col;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (col < row)
		{
			for (i = 0;i <= (row + col);i++)
			{
				for (k = 0;k < row && k <= i;k++)
				{
					if ((i - k) >= col)
					{
						continue;
					}
					else
					{
						System.out.printf("%d\n",s[k][i - k]);
					}
				}
			}
		}
		else if (col >= row)
		{
			for (i = 0;i <= (col + row);i++)
			{
				for (k = 0;k <= i != 0 && k < row;k++)
				{
					if ((i - k) >= col)
					{
						continue;
					}
					else
					{
						System.out.printf("%d\n",s[k][i - k]);
					}
				}
			}
		}
		return 0;
	}

}

