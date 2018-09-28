package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int y;
		int m;
		int d;
		int c;
		double[] sz = new double[100];
		double sum = 0.0;
		double S = 0.0;
		double x;
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
				c = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < c;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[j] = Double.parseDouble(tempVar3);
			}
			sum += sz[j];
			}
			d = c;
			c = c * 1.0;
			x = sum / c;
			for (k = 0;k < d;k++)
			{
			   S += (sz[k] - x) * (sz[k] - x);
			}
			S = Math.sqrt(S / c);
			System.out.printf("%.5lf\n",S);
			sum = 0.0,S = 0.0;
		}

		return 0;
	}
}

