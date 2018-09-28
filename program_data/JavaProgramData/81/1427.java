package <missing>;

public class GlobalMembers
{
	public static int jhsz(int[][] sz, int m, int n)
	{
		int i;
		int j;
		int[] jh = new int[5];

		if (m > 4 || n > 4)
		{
			System.out.print("error");
		}
		else
		{
			for (j = 0;j < 5;j++)
			{
				jh[j] = sz[m][j];
				sz[m][j] = sz[n][j];
				sz[n][j] = jh[j];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",sz[i][j]);
				}
				System.out.printf("%d\n",sz[i][4]);
			}
		}
		return sz[5][5];
	}
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int m;
		int n;
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}

		sz[5][5] = jhsz(sz, m, n);

		return 0;
	}
}

