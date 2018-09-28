package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int h;
		int i;
		int j;
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double he = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a[0] = 2;
		a[1] = 1.5;
		b[0] = 2;
		b[1] = 3;
		c[1] = 2;
		c[0] = 1;
		for (i = 2;i < 100;i++)
		{
			b[i] = b[i - 1] + b[i - 2];
			c[i] = c[i - 1] + c[i - 2];
			a[i] = b[i] / c[i];
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h = Integer.parseInt(tempVar2);
			}
			he = 0;
			for (j = 0;j < h;j++)
			{
				he = he + a[j];
			}
				System.out.printf("%.3lf\n",he);
		}
		 return 0;
	}




}

