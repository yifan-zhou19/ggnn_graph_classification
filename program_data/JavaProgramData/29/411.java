package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[] sum = new double[199];
		double[] a = new double[199];
		int n;
		int i;
		int m;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			sum[j] = 2;
			for (i = 1;i < m;i++)
			{
				a[0] = 2;
			   a[i] = 1 + 1 / a[i - 1];
			   sum[j] += a[i];
			}
		}
		for (j = 0;j < n;j++)
		{
			  System.out.printf("%.3lf\n",sum[j]);
		}
	}

}

