package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double m;
	double[] sz = new double[100];
	double[] fm = new double[100];
	double[] a = new double[100];
	double[] result = new double[100];
	int k;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Double.parseDouble(tempVar);
	}
	for (k = 0;k < m;k++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[k] = Double.parseDouble(tempVar2);
		}
	}
	for (k = 0;k < m;k++)
	{
		if (sz[k] == 1)
		{
			result[k] = 2.000;
		}
					 else
					 {
						 for (i = 1;i <= sz[k] + 1;i++)
						 {
							 fm[1] = 1;
								   fm[2] = 2;
								   fm[i] = fm[i - 1] + fm[i - 2];
						 }
					 for (i = 1;i <= sz[k];i++)
					 {
						 a[i] = fm[i + 1] / fm[i];
					 }
					 result[k] = 0;
					 for (i = 1;i <= sz[k];i++)
					 {
						 result[k] += a[i];
					 }
					 }
	}
	for (k = 0;k < m;k++)
	{
		System.out.printf("%.3lf\n",result[k]);
	}
	return 0;
	}
}

