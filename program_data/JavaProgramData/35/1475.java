package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] sz = new int[10][10];
		int i;
		int j;
		int[][] n = new int[10][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
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
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int a = 0;
		int p = 0;
		int c = 0;
		int b;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				n[i][j] = sz[i][j];
			}
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col - 1;j++)
			{
				if (n[i][j] > n[i][j + 1])
				{
					n[i][j + 1] = n[i][j];
				}
				else
				{
					a = j + 1;
				}
			}
			for (b = 0;b < row;b++)
			{
				if (sz[i][a] > sz[b][a])
				{
					p++;
				}
			}
			if (p == 0)
			{
				System.out.printf("%d+%d",i,a);
				c++;
			}
		}
		if (c == 0)
		{
			System.out.print("No");
		}
		return 0;
	}




}

