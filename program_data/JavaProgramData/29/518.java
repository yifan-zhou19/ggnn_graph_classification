package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int[] a = new int[100];
		int p;
		int q;
		int k;
		double[] z = new double[100];
		double[] b = new double[100];
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
				a[i] = Integer.parseInt(tempVar2);
			}
						   q = 2;
						   k = 1;
				for (p = 0;p < a[i];p++)
				{
					b[p] = 1.00000 * q / k;
					q += k;
					k = q - k;
					z[i] += b[p];
				}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",z[i]);
		}
		return 0;
	}


}

