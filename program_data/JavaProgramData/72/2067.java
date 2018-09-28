package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int q;
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
		int[][] qq = new int[m + 2][n + 2];
		for (i = 1;i < m + 1;i++)
		{
			for (q = 1;q < n + 1;q++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qq[i][q] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n + 2;i++)
		{
			qq[0][i] = qq[m + 1][i] = 0;
		}
		for (i = 0;i < m + 2;i++)
		{
			qq[i][0] = qq[i][n + 1] = 0;
		}
		for (i = 1;i < m + 1;i++)
		{
			for (q = 1;q < n + 1;q++)
			{
				if (qq[i][q] >= qq[i - 1][q] & qq[i][q] >= qq[i + 1][q] & qq[i][q] >= qq[i][q - 1] & qq[i][q] >= qq[i][q + 1])
				{
					System.out.printf("%d %d\n",i - 1,q - 1);
				}
				else
				{
					i = i;
					q = q;
				}
			}
		}
		return 0;
	}

}

