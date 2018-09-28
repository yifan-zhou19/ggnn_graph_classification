package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[][] jz = new int[8][8];
		int ROW;
		int COL;
		int max;
		int min;
		int q;
		int p;
		int m;
		int n;
		int flag = 0;
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
					jz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < ROW;i++)
		{
			q = 0,p = 0;
			max = jz[i][0];
			for (j = 1;j < COL;j++)
			{
				if (jz[i][j] > max)
				{
					max = jz[i][j];
					q = j;
				}
			}
			min = jz[0][q];
			for (m = q,n = 0;n < ROW;n++)
			{
				if (jz[n][m] < min)
				{
					min = jz[n][m];
					p = n;
				}


			}
			if (max == min)
			{
				flag = 1;
				System.out.printf("%d+%d",p,q);
			}

		}
		if (flag == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

