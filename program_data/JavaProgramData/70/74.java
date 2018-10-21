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
		double[] x = new double[10];
		double[] y = new double[10];
		double dis = 0;
		double m;
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			double a;
			double b;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			x[i] = a;
			y[i] = b;
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				m = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				if (dis <= m)
				{
					dis = m;
				}
			}
		}
		System.out.printf("%.4f\n",dis);
		return 0;
	}
}

