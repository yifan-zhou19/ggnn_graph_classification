package <missing>;

public class GlobalMembers
{
	public static int hs(int[][] sz, int m, int n)
	{
		int[] szt = new int[5];
		int i;
		if (m >= 0 && m <= 4 && n >= 0 && n <= 4)
		{
			for (i = 0;i < 5;i++)
			{
			szt[i] = sz[n][i];
			sz[n][i] = sz[m][i];
			sz[m][i] = szt[i];
			}
			return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int Main()
	{
		int t;
		int j;
		int d;
		int k;
		int l;
		int[][] z = new int[5][5];
		for (j = 0;j < 5;j++)
		{
			for (d = 0;d < 5;d++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					(z[j][d]) = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			l = Integer.parseInt(tempVar3);
		}
		t = hs(z, k, l);
		if (t == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (j = 0;j < 5;j++)
			{
			   for (d = 0;d < 5;d++)
			   {
				   if (d != 4)
				   {
					   System.out.printf("%d ",z[j][d]);
				   }
				   else
				   {
					   System.out.printf("%d\n",z[j][d]);
				   }
			   }
			}
		}
		return 0;
	}
}

