package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		double a;
		double b;
		double c;
		double d;
		a = b = c = d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = Integer.parseInt(tempVar2);
			}
			if (s <= 18)
			{
				a++;
			}
			else if (s <= 35)
			{
				b++;
			}
			else if (s <= 60)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		a = a / n * 100;
		b = b / n * 100;
		c = c / n * 100;
		d = d / n * 100;
		System.out.printf("1-18: %.2lf%%\n",a);
		System.out.printf("19-35: %.2lf%%\n",b);
		System.out.printf("36-60: %.2lf%%\n",c);
		System.out.printf("60??: %.2lf%%\n",d);
		return 0;
	}



}

