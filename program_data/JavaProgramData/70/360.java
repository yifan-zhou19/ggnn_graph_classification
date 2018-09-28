package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int a;
		double[] x = new double[1000];
		double[] y = new double[1000];
		double d;
		double D = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 1;a <= n;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[a] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[a] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				d = Math.sqrt(Math.pow(x[j] - x[i],2) + Math.pow(y[j] - y[i],2));
					if (D < d)
					{
						D = d;
					}
			}
		}
		System.out.printf("%.4lf\n", D);
	}
}

