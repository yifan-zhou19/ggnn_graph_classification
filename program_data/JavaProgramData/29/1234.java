package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		double[] sum = new double[MAX];
		double[] s = new double[MAX];
		double[] x = new double[MAX];
		s[0] = 2;
		x[0] = 1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   n = Integer.parseInt(tempVar2);
		   }
		   sum[i] = 0;
		   for (j = 1;j <= n;j++)
		   {

			   s[j] = s[j - 1] + x[j - 1];
			   x[j] = s[j - 1];
			   sum[i] = sum[i] + (s[j - 1]) / (x[j - 1]);

		   }

		}
		for (i = 0;i < m;i++)
		{
		System.out.printf("%.3lf\n",sum[i]);
		}
		return 0;
	}
}

