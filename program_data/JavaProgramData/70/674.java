package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k = 0;
		int n;
		double t;
		double[] x = new double[100];
		double[] y = new double[100];
		double[] d = new double[500];
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				d[k] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				k++;
			}
		}
		for (j = 0;j < k;j++)
		{
			for (i = 0;i < k - j;i++)
			{
				if (d[i] < d[i + 1])
				{
					t = d[i];
					d[i] = d[i + 1];
					d[i + 1] = t;
				}
			}
		}
				System.out.printf("%.4lf\n",d[0]);
	}

}

