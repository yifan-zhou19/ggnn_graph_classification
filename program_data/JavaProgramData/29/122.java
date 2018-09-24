package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int i = 0;
		int[] a = new int[100];
		int[] b = new int[100];
		int j = 0;
		int[] sz = new int[100];
		double[] sz1 = new double[100];
		double[] sum = new double[100];
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
			(sz[i]) = Integer.parseInt(tempVar2);
		}
		}

		for (i = 0;i < m;i++)
		{
				sum[i] = 0;
				 for (j = 0;j < sz[i];j++)
				 {

				 a[0] = 2;
				 b[0] = 1;
					 b[j + 1] = a[j];
					 a[j + 1] = a[j] + b[j];
					 sz1[j] = a[j] * 1.0 / b[j];
					 sum[i] += sz1[j];
				 }
		}
		for (i = 0;i < m;i++)
		{
		System.out.printf("%.3lf\n",sum[i]);
		}
		return 0;
	}



}

