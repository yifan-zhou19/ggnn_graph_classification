package <missing>;

public class GlobalMembers
{
	public static double dis(double x,double y,double p,double q)
	{
		double d;
		double e;
		double f;
		e = x - p;
		f = y - q;
		d = Math.sqrt(e * e + f * f);
		return d;
	}

	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		double[][] a = new double[30][2];
		double[] ben = new double[300];
		double max;

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
				a[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][1] = Double.parseDouble(tempVar3);
			}
		}
		k = 0;

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				ben[k] = dis(a[i][0], a[i][1], a[j][0], a[j][1]);
			k = k + 1;
			}
		}
		max = ben[0];
		for (i = 0;i < k;i++)
		{
			if (ben[i] > max)
			{
				max = ben[i];
			}
		}
		System.out.printf("%.4lf",max);
	}
}

