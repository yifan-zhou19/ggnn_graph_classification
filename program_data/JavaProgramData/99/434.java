package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int b;
		int c;
		int d;
		int e;
		double o;
		double p;
		double q;
		double r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		 for (i = 0;i < n;i++)
		 {
			if (a[i] < 19)
			{
				b += 1;

			}
			else
			{
				if (a[i] < 36)
				{
					c += 1;

				}
				else
				{
					if (a[i] < 61)
					{
						d += 1;

					}
					else
					{
						e += 1;

					}
				}
			}


		 }
		o = (double)100 * b / n;
		p = (double)100 * c / n;
		q = (double)100 * d / n;
		r = (double)100 * e / n;
		System.out.printf("1-18: %.2lf%%\n",o);
		System.out.printf("19-35: %.2lf%%\n",p);
		System.out.printf("36-60: %.2lf%%\n",q);
		System.out.printf("60??: %.2lf%%",r);
		return 0;
	}

}

