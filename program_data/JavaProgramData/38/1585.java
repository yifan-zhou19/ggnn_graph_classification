package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		double[] x = new double[1000];
		double[] a = new double[1000];
		double[] c = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < k;i++)
		{
			double s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (int j = 0;j < n;j++)
			{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 x[j] = Double.parseDouble(tempVar3);
			 }
			 a[i] += x[j];

			}
			a[i] /= n;
			for (int j = 0;j < n;j++)
			{
			c[i] += Math.pow((x[j] - a[i]),2);
			}
			 s = Math.sqrt(c[i] / n);
			System.out.printf("%.5lf\n",s);
		}

		return 0;
	}
}

