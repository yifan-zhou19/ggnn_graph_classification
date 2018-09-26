package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[1000];
		double sum;
		double q;
		int b;
		int c;
		int[] d = new int[1000];
		int j;
		int k;
		int l;
		int n;
		int i;
		b = 2;
		c = 1;
		a[0] = (double)b / c;
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
				d[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = a[0];
			b = 2;
			c = 1;
			for (j = 1;j < d[i];j++)
			{

				k = b;
				b = (b + c);
				c = k;
				a[j] = (double)b / c;
				sum = sum + a[j];
			}
			q = sum;
			System.out.printf("%.3lf\n",q);
		}
		return 0;
	}
}

