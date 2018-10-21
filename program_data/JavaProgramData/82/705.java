package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[100][100];
		int[] jg = new int[100];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
		}

		int t = 0;
		int p = 0;

		for (int k = 0;k <= n;k++)
		{
			if ((sz[k][0] <= 140) && (sz[k][0] >= 90) && (sz[k][1] >= 60) && (sz[k][1] <= 90))
			{
				jg[t]++;
			}
			else
			{
				t += 2;
			}
		}
		for (int q = 0;q < (t + 1);q++)
		{
			int e;
			if (jg[q] > jg[q + 1])
			{
				e = jg[q];
				jg[q + 1] = jg[q];
				e = jg[q];
			}
		}

		System.out.printf("%d",jg[t + 1]);
	return 0;
	}



}

