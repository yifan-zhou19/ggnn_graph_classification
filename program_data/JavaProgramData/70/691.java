package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[] x = new double[999];
		double[] y = new double[999];
		double[] z = new double[999];
		double max = 0.0;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Double.parseDouble(tempVar3);
			}
		}
		for (j = 1;j < n;j++)
		{
		   for (i = j;i <= n;i++)
		   {
			   z[j + i] = Math.sqrt((x[j] - x[i]) * (x[j] - x[i]) + (y[j] - y[i]) * (y[j] - y[i]));
				   if (z[i + j] > max)
				   {
					   max = z[i + j];
				   }
		   }
		}
		System.out.printf("%.4f\n",max);
		return 0;
	}
}

