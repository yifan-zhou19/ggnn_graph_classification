package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int c;
		double s = 0;
		double[] sh = new double[1000];
		double[] xia = new double[1000];
		double[] sz = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		sh[0] = 2;
		xia[0] = 1;
		sh[1] = 3;
		xia[1] = 2;
		sz[0] = 2.000 / 1.000;
		sz[1] = 3.000 / 2.000;
		for (i = 2;i < 1000;i++)
		{
			sh[i] = sh[i - 2] + sh[i - 1];
			xia[i] = xia[i - 2] + xia[i - 1];
			sz[i] = sh[i] / xia[i];
		}
		for (c = 0;c < m;c++)
		{
			s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < n;i++)
			{
				s += sz[i];
			}
			System.out.printf("%.3lf\n",s);
		}
		return 0;
	}
}

