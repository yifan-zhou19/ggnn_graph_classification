package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int r;
		double M;
		double L;
		double[] max = new double[10];
		double[] x = new double[10];
		double[] y = new double[10];
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
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (r = i + 1,max[i] = 0;r < n;r++)
			{

					double l;
					l = (x[r] - x[i]) * (x[r] - x[i]) + (y[r] - y[i]) * (y[r] - y[i]);
					if (max[i] < l)
					{
					max[i] = l;
					}
			}

			if (i != 0)
			{
				if (max[i] >= max[i - 1])
				{
					M = max[i];
				}
				else
				{
					max[i] = max[i - 1];
					M = max[i];
				}
			};

		};
		L = Math.sqrt(M);
		System.out.printf("%.4f\n",L);
		return 0;
	}

}

