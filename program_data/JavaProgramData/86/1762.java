package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] f = new int[60];
		int i;
		int s;
		int t;
		int m;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int[] g = new int[200];
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (t = 1,k = 0;t < m + 1;t++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					f[t] = Integer.parseInt(tempVar3);
				}
				k = k + f[t] - f[t - 1];
				g[k + 1] = 1;
				g[k + 2] = 1;
				g[k + 3] = 1;
				k = k + 3;
			}
			for (t = 1,s = 60;t < 61;t++)
			{
				if (g[t] == 1)
				{
					s--;
				}
			}
			System.out.printf("%d\n",s);
		}
		return 0;
	}

}

