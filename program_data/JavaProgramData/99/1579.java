package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int nian;
		int a;
		int b;
		int c;
		int d;
		double A;
		double B;
		double C;
		double D;

		a = 0;
		b = 0;
		c = 0;
		d = 0;
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
				nian = Integer.parseInt(tempVar2);
			}

			if (nian <= 18)
			{
				a++;
			}
			else if (nian <= 35)
			{
				b++;
			}
			else if (nian <= 60)
			{
				c++;
			}
			else
			{
				d++;
			}
		}

		A = (double)100 * a / n;
		B = (double)100 * b / n;
		C = (double)100 * c / n;
		D = (double)100 * d / n;

		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",A,B,C,D);
		return 0;
	}


}

