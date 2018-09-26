package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][10];
		int[][] b = new int[10][10];
		int[][] c = new int[10][10];
		int p;
		int q;
		int x;
		int y;
		int z = 0;
		int i;
		int j;
		int k;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			q = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < p;i++)
		{
			for (j = 0;j < q;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < p;i++)
		{
			for (j = 0;j < q;j++)
			{
				b[i][j] = a[i][j];
			}
		}
		for (i = 0;i < p;i++)
		{
			for (j = 0;j < q;j++)
			{
				c[i][j] = a[i][j];
			}
		}
		for (i = 0;i < p;i++)
		{
			for (k = 0;k < q - 1;k++)
			{
				for (j = 0;j < q - 1 - k;j++)
				{
					if (b[i][j] < b[i][j + 1])
					{
						temp = b[i][j];
						b[i][j] = b[i][j + 1];
						b[i][j + 1] = temp;
					}
				}
			}
		}
		for (j = 0;j < q;j++)
		{
			for (k = 0;k < p - 1;k++)
			{
				for (i = 0;i < p - 1 - k;i++)
				{
					if (c[i][j] > c[i + 1][j])
					{
						temp = c[i][j];
						c[i][j] = c[i + 1][j];
						c[i + 1][j] = temp;
					}
				}
			}
		}
		for (i = 0;i < p;i++)
		{
			for (j = 0;j < q;j++)
			{
				if (c[0][j] == b[i][0])
				{
					x = i;
					y = j;
					z = 1;
				}
				else
				{
					continue;
				}
			}
		}
		if (z == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d+%d",x,y);
		}
		return 0;
	}


}

