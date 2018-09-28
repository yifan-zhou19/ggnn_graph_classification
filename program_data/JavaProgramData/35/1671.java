package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
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
		int[][] sz1 = new int[8][8];
		for (i = 0;i < row;i++)
		{
				for (j = 0;j < col;j++)
				{
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							sz1[i][j] = Integer.parseInt(tempVar3);
						}
				}
		}
		int e;
		int d;
		int k;
		int h;
		int f;

		for (k = 0;k < row;k++)
		{
				e = 0;
				d = 0;
				for (h = 0;h < col;h++)
				{
						if (sz1[k][h] > sz1[k][e])
						{
								e = h;
						}
				}
				for (f = 0;f < row;f++)
				{
						if (sz1[f][e] < sz1[d][e])
						{
								d = f;
						}
				}
				if (sz1[k][e] == sz1[d][e])
				{
					   break;
				}
		}
		if (sz1[k][e] == sz1[d][e])
		{
			   System.out.printf("%d+%d",d,e);
		}
		else
		{
			   System.out.print("No");
		}
		return 0;
	}

}

