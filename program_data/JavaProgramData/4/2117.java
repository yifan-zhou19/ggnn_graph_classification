package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int k;
		int n;
		int m;
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
		for (k = 0;k < row + col - 1;k++)
		{
			for (m = 0;m < row;m++)
			{
				if ((k - m) < 0)
				{
					break;
				}
				for (n = k - m;;)
				{
					if ((k - m) > (col - 1))
					{
						break;
					}
					System.out.printf("%d\n",a[m][n]);
					break;
				}
			}
		}
		return 0;
	}



}

