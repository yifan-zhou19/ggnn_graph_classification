package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int q;
		int w;
		int e;
		int r;
		int i;
		int j;
		int t = -3;
		int[][] MX = new int[10][10];
		int[] P = new int[10];
		int[] Q = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			w = Integer.parseInt(tempVar2);
		}
		if (q > w)
		{
			r = q;
		}
		else
		{
			r = w;
		}
		for (i = 0;i < r;i++)
		{
			P[i] = -99;
			Q[i] = 10000;
		}
		for (i = 0;i < q;i++)
		{
			for (j = 0;j < w;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					MX[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < q;i++)
		{
			for (j = 0;j < w;j++)
			{
				if (MX[i][j] > P[i])
				{
					P[i] = MX[i][j];
				}
			}
		}
		for (j = 0;j < w;j++)
		{
			for (i = 0;i < q;i++)
			{
				if (MX[i][j] < Q[j])
				{
					Q[j] = MX[i][j];
				}
			}
	//		printf("%d\n",Q[j]);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < r;j++)
			{
			if (P[i] == Q[j])
			{
				e = P[i];
	//
			}
			}
		}
		for (i = 0;i < q;i++)
		{
			for (j = 0;j < w;j++)
			{
				if (MX[i][j] == e)
				{
					System.out.printf("%d+%d",i,j);
					t = 3;
				}
			}
		}
		if (t < 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

