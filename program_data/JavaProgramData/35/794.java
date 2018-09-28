package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[ROW][COL];
		int nr;
		int nc;
		int i;
		int j;
		int k;
		int[] Rm = new int[ROW];
		int[] Cm = new int[COL];
		int exist = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			nr = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			nc = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < nr;i++)
		{
			for (j = 0;j < nc;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < nr;i++)
		{
			Rm[i] = sz[i][0];
			for (j = 0;j < nc;j++)
			{
				if (sz[i][j] > Rm[i])
				{
					Rm[i] = sz[i][j];
				}
			}
		}
		for (j = 0;j < nc;j++)
		{
			Cm[j] = sz[0][j];
			for (i = 0;i < nr;i++)
			{
				if (sz[i][j] < Cm[j])
				{
					Cm[j] = sz[i][j];
				}
			}
		}
		for (i = 0;i < nr;i++)
		{
			for (j = 0;j < nc;j++)
			{
				if (Rm[i] == Cm[j])
				{
					System.out.printf("%d+%d",i,j);
					exist = exist + 1;
				}
			}
		}
		if (exist == 0)
		{
			System.out.print("No");
		}
		return 0;
	}


}

