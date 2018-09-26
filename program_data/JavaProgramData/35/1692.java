package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int row;
		int col;
		int i;
		int j;
		int k;
		int l = 0;
		int t;
		int p;
		int[][] sz = new int[8][8];
		int max;
		int min;
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
		for (i = 0;i < row;i++)
		{
			max = sz[i][0];

			for (j = 0;j < col;j++)
			{
				if (sz[i][j] >= max)
				{
					max = sz[i][j];
					k = j;
				}
			}
			min = sz[0][k];

			for (t = 0;t < row;t++)
			{
				if (sz[t][k] <= min)
				{
					min = sz[t][k];
					p = t;

				}
			}
			if (min == max)
			{
				System.out.printf("%d+%d\n",p,k);
				l++;
			}

		}
		if (l == 0)
		{
			System.out.print("No\n");
		}
	}


}

