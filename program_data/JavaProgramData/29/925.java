package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int k;
		int i;
		int[] sz1 = new int[1000];
		int[] sz2 = new int[1000];
		double[] x = new double[1000];
		sz1[0] = 2;
		sz1[1] = 3;
		sz2[0] = 1;
		sz2[1] = 2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 100;i++)
		{
			sz1[i + 2] = sz1[i] + sz1[i + 1];
			sz2[i + 2] = sz2[i] + sz2[i + 1];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (k = 0;k < m;k++)
			{
				x[i] = x[i] + (double)sz1[k] / sz2[k];
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.3lf\n",x[i]);
		}
	}


}

