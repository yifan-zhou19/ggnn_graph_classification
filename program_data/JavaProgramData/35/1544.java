package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int i1;
		int[][] sz = new int[8][8];
			 char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			col = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			int max = sz[i][0];
			int p = 0;
			for (j = 1;j < col;j++)
			{
				if (sz[i][j] > max)
				{
					max = sz[i][j];
					p = j;
				}
			}
			int min = sz[i][p];
			for (i1 = 0;i1 < row;i1++)
			{
				if (min > sz[i1][p])
				{
					break;
				}
			}
			if (i1 == row)
			{
				System.out.printf("%d+%d",i,p);
				break;
			}
		}
		if (i == row)
		{
			System.out.print("No");
		}
		return 0;
	}

}

