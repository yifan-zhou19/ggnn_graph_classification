package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] x = new int[100];
		int[] y = new int[100];
		int[][] sz = new int[100][100];
		int i;
		int j;
		int k;
		int[] m = new int[100];
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < x[i];j++)
			{
				for (k = 0;k < y[i];k++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[j][k] = Integer.parseInt(tempVar4);
					}
					if (j == x[i] - 1 || j == 0 || k == y[i] - 1 || k == 0)
					{
						m[p] += sz[j][k];
					}
				}
			}
			p++;
		}
		for (i = 0;i < p;i++)
		{
			System.out.printf("%d\n",m[i]);
		}
		return 0;
	}
}

