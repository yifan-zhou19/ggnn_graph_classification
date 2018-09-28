package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 1;
		int h;
		int l;
		int i;
		int j;
		int[][] a = new int[100][100];
		int lans = 0;
		int[] ans = new int[10000];
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
			for (n = 1;n <= l;n++)
			{
				for (j = 0, k = n - 1;k >= 0 && j <= h - 1;j++, k--)
				{
				ans[lans++] = a[j][k];
				}
			}
			for (n = 2;n <= h;n++)
			{
				for (j = n - 1, k = l - 1;j <= h - 1 && k >= 0;j++, k--)
				{
					ans[lans++] = a[j][k];
				}
			}
			for (i = 0;i < lans;i++)
			{
				System.out.printf("%d\n",ans[i]);
			}


		return 0;
	}


}

