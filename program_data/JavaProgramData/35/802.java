package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[8][8];
		int i;
		int j;
		int row;
		int col;
		int[] x = new int[8];
		int[] y = new int[8];
		int m;
		int n = 0;
		int p;
		int q;
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
					(sz[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		//????
		for (i = 0;i < row;i++)
		{
			q = 0;
			for (j = 0;j < col;j++)
			{
				//????????
				if (sz[i][j] < sz[i][q])
				{
				} //q???????????
				else
				{
						x[i] = i;
						q = y[i] = j; //????????
				}

			}
		}

		for (i = 0;i < row;i++)
		{
			p = 1;
			for (j = 0;j < row;j++)
			{
				if (sz[i][y[i]] > sz[j][y[i]])
				{
					p = 0;
					j = row; //????????????????,??p??0
				}
			}
			if (p == 1)
			{
				System.out.printf("%d+%d",i,y[i]);
				i = row; //????????
			}
		}


		if (p == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

