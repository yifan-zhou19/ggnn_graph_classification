package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int col;
		int row;
		int n;
		int t;
		int j;
		int m;
		int i;
		int k;
		int l;
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
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
		for (i = 1;i <= row;i++)
		{
			b[i][0] = 1;
			b[i][col + 1] = 1;
		}
		for (j = 1;j <= col;j++)
		{
			b[0][j] = 1;
			b[row + 1][j] = 1;
		}
		m = 0;
		i = 1;
		j = 1;
		while (m < col * row)
		{
			System.out.printf("%d\n",a[i][j]);
			m = m + 1;
			b[i][j] = 1;
			if (b[i - 1][j] == 1)
			{
				if (b[i][j - 1] == 1)
				{
					if (b[i][j + 1] == 0)
					{
						j++;
					}
					else
					{
						i++;
					}
				}
				else
				{
					if (b[i + 1][j] == 0)
					{
						i++;
					}
					else
					{
						j--;
					}
				}
			}
			else
			{
				if (b[i][j - 1] == 0)
				{
					j--;
				}
				else
				{
					i--;
				}
			}
		}
	return 0;
	}
}

