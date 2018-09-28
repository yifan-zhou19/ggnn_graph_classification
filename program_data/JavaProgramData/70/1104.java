package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int j;
		double[] x = new double[20];
		double[] y = new double[20];
		double[] m = new double[200];
		double a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[k] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[k] = Double.parseDouble(tempVar3);
			}
		}
		k = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				m[k] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				k++;
			}
		}
		for (k = 0;k < n * (n - 1) / 2 - 1;k++)
		{
			if (m[k] > m[k + 1])
			{
				a = m[k];
				m[k] = m[k + 1];
				m[k + 1] = a;
			}
		}
		System.out.printf("%.4f\n",m[k]);
	}



}

