package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[500];
		int i;
		int j;
		int x;
		int k;
		int[][][] a = new int[100][100][100];
		int[][] b = new int[500][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			n[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i][1] = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < b[i][0];j++)
			{
				for (x = 0;x < b[i][1];x++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i][j][x] = Integer.parseInt(tempVar4);
					}
					if (j == 0 || x == 0 || j == b[i][0] - 1 || x == b[i][1] - 1)
					{
						n[i] += a[i][j][x];
					}
				}
			}

		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%d\n",n[i]);
		}
		return 0;
	}
}

