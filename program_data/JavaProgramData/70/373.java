package <missing>;

public class GlobalMembers
{
	public static double max(double[] a, int k)
	{
		int i;
		double maxdis = a[0];
		for (i = 1;i < k;i++)
		{
			if (maxdis < a[i])
			{
				maxdis = a[i];
			}
		}
		return (maxdis);
	}
	public static void Main()
	{
		double n;
		double[] x = new double[10];
		double[] y = new double[10];
		double[] dis = new double[100];
		int i;
		int j;
		int k = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
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
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				dis[k] = Math.sqrt(Math.pow(x[i] - x[j],2) + Math.pow(y[i] - y[j],2));
				k++;
			}
		}
		System.out.printf("%.4lf",max(dis, k));
	}
}

