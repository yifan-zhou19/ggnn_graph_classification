package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] z1 = new int[101][101];
		int[][] z2 = new int[101][101];
		int[][] z3 = new int[101][101];
		int m;
		int n;
		int q;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			q = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= q;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				z1[i][j] = Integer.parseInt(tempVar3);
			}
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			q = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			n = Integer.parseInt(tempVar5);
		}
		for (i = 1;i <= q;i++)
		{
			for (j = 1;j <= n;j++)
			{
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				z2[i][j] = Integer.parseInt(tempVar6);
			}
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
							  z3[i][j] = 0;
							  for (k = 1;k <= q;k++)
							  {
								  z3[i][j] = z3[i][j] + z1[i][k] * z2[k][j];
							  }
			}
		}
		for (i = 1;i <= m;i++)
		{
			System.out.printf("%d",z3[i][1]);
			for (j = 2;j <= n;j++)
			{
			System.out.printf(" %d",z3[i][j]);
			}
			System.out.print("\n");
		}
	}
}

