package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int n;
		int i;
		int a;
		int b;
		int c;
		int d;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		double A;
		double B;
		double C;
		double D;
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
		for (i = 0;i < n;i++)
		{
			if (sz[i] <= 18 && sz[i] >= 1)
			{
				a++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] >= 19 && sz[i] <= 35)
			{
				b++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] >= 36 && sz[i] <= 60)
			{
				c++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] > 60)
			{
				d++;
			}
		}
		A = 100.0 * a / n;
		B = 100.0 * b / n;
		C = 100.0 * c / n;
		D = 100.0 * d / n;
		System.out.printf("1-18: %.2lf%%\n",A);
		System.out.printf("19-35: %.2lf%%\n",B);
		System.out.printf("36-60: %.2lf%%\n",C);
		System.out.printf("Over60: %.2lf%%\n",D);
		return 0;
	}

}

