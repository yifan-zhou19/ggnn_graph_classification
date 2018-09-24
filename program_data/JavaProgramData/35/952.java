package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] sz = new int[8][8];
		int ROW;
		int COL;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ROW = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
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
		int p;
		int q;
		int t;
		t = 0;

		for (i = 0;i < ROW;i++)
		{
			p = 0;
			q = 0;
			for (j = 0;j < COL;j++)
			{
				if (sz[i][j] > sz[i][q])
				{
					p = i;
					q = j;
				}
			}
			for (i = 0;i < ROW;i++)
			{
				if (sz[p][q] > sz[i][q])
				{
					t = 1;
				}
			}
			if (t == 0)
			{
				break;
			}

		}
		if (t == 1)
		{
			System.out.print("No");
		}
		else if (t == 0)
		{
			System.out.printf("%d+%d",p,q);
		}


	}

}

