package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int m;
		int e;
		int b;
		int c;
		int d;
		double p;
		double q;
		double k;
		double i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		e = 0;
		b = 0;
		c = 0;
		d = 0;
		p = 0;
		q = 0;
		k = 0;
		i = 0;
		for (m = 1;m <= n;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[m] = Integer.parseInt(tempVar2);
			}
			{
				if (1 <= a[m] != 0 && a[m] <= 18)
				{
					e++;
				}
		}
						p = 100 * (double)e / n;

						{
				if (19 <= a[m] != 0 && a[m] <= 35)
				{
					b++;
				}
						}
						q = 100 * (double)b / n;

						{
				if (36 <= a[m] != 0 && a[m] <= 60)
				{
					c++;
				}
						}
						k = 100 * (double)c / n;

						{
				if (61 <= a[m])
				{
					d++;
				}
						}
						i = 100 * (double)d / n;
		}
		System.out.printf("1-18: %.2f%%\n",p);
		System.out.printf("19-35: %.2f%%\n",q);
		System.out.printf("36-60: %.2f%%\n",k);
		System.out.printf("60??: %.2f%%\n",i);
	}
}

