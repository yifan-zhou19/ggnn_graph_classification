package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static int Main()
	{
		int i;
		int j;
		int k;
		int p;
		int[][] a = new int[100][100];
		int[] s = new int[100];
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (p = 1;p <= k;p++)
		{
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
			for (i = 1;i <= m;i++)
			{
				for (j = 1;j <= n;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (j = 1;j <= n;j++)
			{
				s[p] = s[p] + (a[1][j]);
			}
			for (j = 1;j <= n;j++)
			{
				s[p] = s[p] + (a[m][j]);
			}
			for (i = 2;i <= m - 1;i++)
			{
				s[p] = s[p] + a[i][1] + a[i][n];
			}
		}
		System.out.printf("%d",s[1]);
		for (p = 2;p <= k;p++)
		{
			System.out.printf("\n%d",s[p]);
		}
		return 0;
	}
}

