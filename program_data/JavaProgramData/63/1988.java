package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
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
		int[][] a = new int[120][120];
		for (int i = 0;i <= m - 1;i++)
		{
			for (int j = 0;j <= n - 1;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
			}
		}
		int p;
		int q;
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			q = Integer.parseInt(tempVar5);
		}
		int[][] b = new int[120][120];
		for (int c = 0;c <= p - 1;c++)
		{
			for (int d = 0;d <= q - 1;d++)
			{
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				b[c][d] = Integer.parseInt(tempVar6);
			}
			}
		}
		int[][] e = new int[120][120];
		for (int f = 0;f <= m - 1;f++)
		{
			for (int g = 0;g <= q - 1;g++)
			{
				e[f][g] = 0;
				for (int h = 0;h <= n - 1;h++)
				{
				e[f][g] = e[f][g] + a[f][h] * b[h][g];
				}
			}
		}
		for (int k = 0;k <= m - 1;k++)
		{
			 for (int l = 0;l <= q - 2;l++)
			 {
			 System.out.printf("%d ",e[k][l]);
			 }
			 System.out.printf("%d\n",e[k][q - 1]);
		}
	}
}

