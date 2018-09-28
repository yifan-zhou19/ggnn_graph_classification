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
		double[] x = new double[1000];
		double[] y = new double[1000];
		double dt;
		double dtmax = 0;
		for (int m = 0;m < n;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[m] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[m] = Double.parseDouble(tempVar3);
			}
		}
		for (int i = 0;i < n - 1;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				dt = Math.sqrt(Math.pow(x[j] - x[i],2) + Math.pow(y[j] - y[i],2));
				if (dtmax < dt)
				{
					dtmax = dt;
				}
			}
		}
		System.out.printf("%.4lf\n",dtmax);
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}


}

