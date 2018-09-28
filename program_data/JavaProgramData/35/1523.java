package <missing>;

public class GlobalMembers
{
	public static int[][] sz = new int[10][10];
	public static int Main()
	{
		int row;
		int col;
		int m = 0;
		int n = 0;
		int a = 0;
		int b;
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
		int i;
		int j;
		int k;
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
		i = 0;
		b = 0;
			while (i < row)
			{
			k = 0;
			for (j = 1;j <= col;j++)
			{
				if (sz[i][m] < sz[i][j])
				{
				  m = j;
				}
				else
				{
					m = m;
				}
			}
			while (k < row)
			{
				if (sz[b][m] > sz[k][m])
				{
					a = 0;
					break;
				}
				else
				{
					a = 1;
					k++;
				}
			}
			if (a == 1)
			{
				System.out.printf("%d+%d",i,m);
				break;
			}
			else
			{
			 i++;
			}
			}
			if (i == row)
			{
			  System.out.print("No");
			}
	 return 0;
	}


}

