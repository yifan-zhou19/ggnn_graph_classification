package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int ROW;
		int COL;
		int i;
		int j;
		int z;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ROW = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			COL = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < ROW;j++)
		{
			for (i = 0;i < COL;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[j][i] = Integer.parseInt(tempVar3);
				}
			}
		}
		t = ROW + COL;
		for (z = 0;z < t;z++)
		{
			for (j = 0;j < ROW;j++)
			{
				i = z - j;
				if ((i >= 0) && (i < COL))
				{
					System.out.printf("%d\n",sz[j][i]);
				}
			}
		}
		return 0;
	}

}

