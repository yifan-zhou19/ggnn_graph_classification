package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] a = new int[100][100];
		int b;
		int c = 0;
		int n;
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
		b = col * row;
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
		for (n = 0;n < 103;n++)
		{
			for (i = n;i < col - n;i++)
			{
				System.out.printf("%d\n",a[n][i]);
				c = c + 1;
			}
			if (c == b)
			{
				break;
			}
			for (i = n + 1;i < row - n;i++)
			{
				System.out.printf("%d\n",a[i][col - n - 1]);
				c = c + 1;
			}
			if (c == b)
			{
				break;
			}
			for (i = col - n - 2;i >= n;i--)
			{
				System.out.printf("%d\n",a[row - 1 - n][i]);
				c = c + 1;
			}
			if (c == b)
			{
				break;
			}
			for (i = row - n - 2;i > n;i--)
			{
				System.out.printf("%d\n",a[i][n]);
				c = c + 1;
			}
			if (c == b)
			{
				break;
			}
		}
		return 0;
	}







}

