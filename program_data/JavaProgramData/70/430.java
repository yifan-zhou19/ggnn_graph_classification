package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		double[] x = new double[1000];
		double[] y = new double[1000];
		double a;
		double b;
		double c;
		double k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
	for (i = 1;i < n;i++)
	{
		for (j = i + 1;j <= n;j++)
		{
		  a = x[j] - x[i];
		  b = y[j] - y[i];
		  c = Math.sqrt(a * a + b * b);
		if (k < c)
		{
			k = c;
		}
		}
	}
		System.out.printf("%.4lf\n",k);
	}


}

