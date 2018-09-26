package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int[] sz = new int[10000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		int[][] zr = new int[10000][2];
		zr[0][0] = 2;
		zr[0][1] = 1;
		zr[1][0] = 3;
		zr[1][1] = 2;
		for (i = 2;i < 10000;i++)
		{
			zr[i][0] = zr[i - 1][0] + zr[i - 2][0];
			zr[i][1] = zr[i - 1][1] + zr[i - 2][1];
		}

		double[] fs = new double[10000];
		for (i = 0;i < 10000;i++)
		{
			fs[i] = (double)zr[i][0] / zr[i][1];
		}
		double[] jg = new double[10000];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < sz[i];j++)
			{
				jg[i] += fs[j];
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.3lf\n",jg[i]);
		}
		return 0;
	}
}

