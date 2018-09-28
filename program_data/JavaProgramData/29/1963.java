package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int[] a = new int[1000];
		double[] b = new double[1000];
		double[] c = new double[1000];
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
		b[0] = 1;
		b[1] = 2;
		for (k = 1;k < 999;k++)
		{
			b[k + 1] = b[k] + b[k - 1];
		}
		for (i = 0;i < n;i++)
		{
			c[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < a[i];j++)
			{
				c[i] += b[j + 1] / b[j];
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.3lf\n",c[i]);
		}
		return 0;
	}
}

