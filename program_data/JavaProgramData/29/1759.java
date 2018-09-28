package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] b = new int[1000];
		int[] c = new int[1000];
		int n;
		int m;
		int i;
		int j;
		int k;
		double[] a = new double[1000];
		double[] num = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		b[0] = 2;
		b[1] = 3;
		c[0] = 1;
		c[1] = 2;
		a[0] = 1.0 * b[0] / c[0];
		a[1] = 1.0 * b[1] / c[1];
		for (j = 0;j < m;j++)
		{
			i = 2;
			num[j] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			while (i >= 2 && i < n)
			{
			   b[i] = b[i - 1] + b[i - 2];
			   c[i] = c[i - 1] + c[i - 2];
			   a[i] = 1.0 * b[i] / c[i];
				i++;
			}
			for (k = 0;k < n;k++)
			{
				num[j] = num[j] + a[k];
			}
			System.out.printf("%.3lf\n",num[j]);
		}
		return 0;
	}
}

