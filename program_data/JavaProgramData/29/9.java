package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] he = new double[100];
		double[] a = new double[100];
		double[] b = new double[100];
		int n;
		int i;
		int j;
		int[] sz = new int[100];
		a[0] = 2,b[0] = 1;
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
			sz[i] = Integer.parseInt(tempVar2);
		}
		}
		for (j = 0;j < n;j++)
		{
			he[j] = 2;
		for (i = 1;i < sz[j];i++)
		{
			a[i] = a[i - 1] + b[i - 1];
			b[i] = a[i - 1];
			he[j] += a[i] / b[i];
		}
		}
		for (j = 0;j < n;j++)
		{
		System.out.printf("%.3lf\n",he[j]);
		}


		return 0;
	}
}

