package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int i;
		int[] m = new int[100];
		double a1;
		double b1;
		double c1;
		double d1;
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
				m[i] = Integer.parseInt(tempVar2);
			}
		}
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		for (i = 0;i < n;i++)
		{
			if (m[i] <= 18)
			{
				a++;
			}
			else
			{
				if (m[i] <= 35)
				{
					b++;
				}
				else
				{
					if (m[i] <= 60)
					{
						c++;
					}
					else
					{
						d++;
					}
				}
			}
		}
		a1 = (double)a / n;
		b1 = (double)b / n;
		c1 = (double)c / n;
		d1 = (double)d / n;
		a1 = a1 * 100;
		b1 = b1 * 100;
		c1 = c1 * 100;
		d1 = d1 * 100;
		System.out.printf("1-18: %.2lf%%\n",a1);
		System.out.printf("19-35: %.2lf%%\n",b1);
		System.out.printf("36-60: %.2lf%%\n",c1);
		System.out.printf("60??: %.2lf%%\n",d1);
		return 0;
	}
}

