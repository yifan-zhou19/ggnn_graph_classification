package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int t;
		int i;
		int j;
		int a;
		int ROW;
		int COL;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ROW = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			COL = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < ROW;i++)
		{
			for (j = 0;j < COL;j++)
			{
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  sz[i][j] = Integer.parseInt(tempVar3);
			  }
			}


		}
		for (t = 0;t < ROW + COL - 1;t++)
		{
				if (ROW - 1 >= t)
				{
					a = t;
				}
				else
				{
					a = ROW - 1;
				}
				i = 0;
				while (i < a + 1)
				{
					if (i < t - COL + 1)
					{
					  i = t - COL + 1;
					}
					   j = t - i;
					   System.out.printf("%d\n",sz[i][j]);
					   i++;
				}

		}
		return 0;
	}

}

