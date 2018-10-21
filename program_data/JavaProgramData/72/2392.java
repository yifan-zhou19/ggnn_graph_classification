package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] shandi = new int[22][22];
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				shandi[i][j] = Integer.parseInt(tempVar3);
			}
			}
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
			if (shandi[i][j] >= shandi[i - 1][j] != 0 && shandi[i][j] >= shandi[i + 1][j] != 0 && shandi[i][j] >= shandi[i][j - 1] != 0 && shandi[i][j] >= shandi[i][j + 1])
			{
				System.out.printf("%d %d\n",i - 1,j - 1);
			}
			}
		}
		return 0;
	}

}

