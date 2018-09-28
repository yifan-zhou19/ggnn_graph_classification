package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int h;
		int l;
		int j;
		int hb = 0;
		int lb = 0;
		int lans = 0;
		int hs;
		int ls;
		int n = 0;
		int[] ans = new int[10000];
		int[][] a = new int[100][100];
		int z = 0;
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
			hs = h - 1;
			ls = l - 1;
			while (true)
			{
				for (i = lb;i <= ls;i++)
				{
				ans[lans++] = a[hb][i];
				n++;
					if (n == h * l)
					{
						z = 1;
						break;
					}
				}
				if (z == 1)
				{
					break;
				}
				for (i = hb + 1;i <= hs;i++)
				{
				ans[lans++] = a[i][ls];
				n++;
					if (n == h * l)
					{
						z = 1;
						break;
					}
				}
				if (z == 1)
				{
					break;
				}
				for (i = ls - 1;i >= lb;i--)
				{
				ans[lans++] = a[hs][i];
				n++;
					if (n == h * l)
					{
						z = 1;
					break;
					}
				}
				if (z == 1)
				{
					break;
				}
				 for (i = hs - 1;i >= hb + 1;i--)
				 {
				ans[lans++] = a[i][lb];
				n++;
					if (n == h * l)
					{
						z = 1;
					break;
					}
				 }
				if (z == 1)
				{
					break;
				}
			hb++;
			hs--;
			lb++;
			ls--;
			}
			for (i = 0;i < lans;i++)
			{
				System.out.printf("%d\n",ans[i]);
			}




					return 0;
	}


}

