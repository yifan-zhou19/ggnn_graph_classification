package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int num;
		int i = 1;
		int p = 0;
		int q = 00;
		int u = 0;
		int t = 0;
		double a;
		double b;
		double c;
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			if ((num >= 1) && (num <= 18))
			{
				p += 1;
			}
			else if ((num >= 19) && (num <= 35))
			{
				q += 1;
			}
			else if ((num >= 36) && (num <= 60))
			{
				u += 1;
			}
			else
			{
				if ((num > 60) && (num <= 100))
				{

				t += 1;
				}
			}
			i++;
		}
		a = p * 1.0 / n * 100;
		b = q * 1.0 / n * 100;
		c = u * 1.0 / n * 100;
		d = t * 1.0 / n * 100;
		System.out.printf("1-18: %.2lf%%\n",a);
		System.out.printf("19-35: %.2lf%%\n",b);
		System.out.printf("36-60: %.2lf%%\n",c);
		System.out.printf("60??: %.2lf%%\n",d);
		return 0;
	}
}

