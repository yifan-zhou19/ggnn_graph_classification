package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[1000];
		double[] b = new double[1000];
		double[] c = new double[1000];
		double sum = 0;
		int n;
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0;j < m;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			a[0] = 2,b[0] = 1;
			sum = 2.0;
			for (i = 1;i < n;i++)
			{
			   a[i] = a[i - 1] + b[i - 1];
			   b[i] = a[i - 1];
			   c[i] = a[i] / b[i];
			   sum += c[i];
			}
			System.out.printf("%.3lf\n",sum);
		}
		return 0;
	}
}

