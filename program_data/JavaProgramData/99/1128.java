package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int n;
		int i;
		double a;
		double b;
		double c;
		double d;
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
			  (sz[i]) = Integer.parseInt(tempVar2);
		  }
		}
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		for (i = 0;i < n;i++)
		{
			if ((sz[i] >= 1) && (sz[i] <= 18))
			{
				a++;
			}
			else if ((sz[i] >= 19) && (sz[i] <= 35))
			{
				b++;
			}
			else if ((sz[i] >= 36) && (sz[i] <= 60))
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		A = a / n * 100;
		B = b / n * 100;
		C = c / n * 100;
		D = d / n * 100;
		System.out.printf("1-18: %.2lf%%\n",A);
		System.out.printf("19-35: %.2lf%%\n",B);
		System.out.printf("36-60: %.2lf%%\n",C);
		System.out.printf("Over60: %.2lf%%\n",D);

	return 0;
	}
}

