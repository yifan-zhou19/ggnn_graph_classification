package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double aver = new double(double x[], int n);
		int k;
		int n;
		int i;
		double[] x = new double[1001];
		double a;
		double[] y = new double[1001];
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		while (k != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 0; i < n; i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i] = Double.parseDouble(tempVar3);
				}
			}
			a = aver(x, n);
			for (i = 0; i < n; i++)
			{
				y[i] = (x[i] - a) * (x[i] - a);
			}
			System.out.printf("%.5lf\n", Math.sqrt(aver(y, n)));
			k--;
		}
	}
	public static double aver(double[] x, int n)
	{
		double sum = 0.0;
		int i;
		for (i = 0; i < n; i++)
		{
			sum += x[i];
		}
		return sum / n;
	}
}

