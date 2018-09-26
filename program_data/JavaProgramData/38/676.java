package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int k;
		double[] sz = new double[1000];
		double s = 0;
		double r = 0;
		double result;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = 0;
			r = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (k = 0;k < m;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[k] = Double.parseDouble(tempVar3);
				}
				s += sz[k];
			}
			for (k = 0;k < m;k++)
			{
				r += (sz[k] - s / (m * 1.0)) * (sz[k] - s / (m * 1.0)) / (m * 1.0);
			}
			result = Math.pow(r,0.5);
			System.out.printf("%.5lf\n",result);
		}
		return 0;
	}
}

