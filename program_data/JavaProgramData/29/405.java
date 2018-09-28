package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int k;
		int[] c = new int[100];
		int[] d = new int[100];
		double[] b = new double[100];
		double[] e = new double[100];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		c[0] = 1;
		d[0] = 1;
		for (k = 0;k < n;k++)
		{
			b[k] = 0;
			for (i = 1;i <= a[k];i++)
			{
				c[i] = c[i - 1] + d[i - 1];
				d[i] = c[i - 1];
				e[i] = (double)c[i] / d[i];
				b[k] = b[k] + e[i];
			}
			System.out.printf("%.3lf\n",b[k]);
		}
		return 0;
	}

}

