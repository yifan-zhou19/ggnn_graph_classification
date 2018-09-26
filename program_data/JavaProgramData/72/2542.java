package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] mountain = new int[22][22];
		int j;
		int k;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (j = 0; j < m + 2; j++)
		{
			mountain[j][0] = -1;
			mountain[j][n + 1] = -1;
		}
		for (k = 1; k < n + 1; k++)
		{
			mountain[0][k] = -1;
			mountain[m + 1][k] = -1;
		}
		for (j = 1; j < m + 1; j++)
		{
			for (k = 1; k < n + 1; k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					mountain[j][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 1; j < m + 1; j++)
		{
			for (k = 1; k < n + 1; k++)
			{
				if (comp(mountain[j][k],mountain[j - 1][k],mountain[j + 1][k],mountain[j][k - 1],mountain[j][k + 1]))
				{
					System.out.printf("%d %d\n",j - 1,k - 1);
				}
			}
		}
	}
}

