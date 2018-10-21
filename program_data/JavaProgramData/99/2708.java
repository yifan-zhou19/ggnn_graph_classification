package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[100];
		int i;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
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
			if (sz[i] <= 18)
			{
				a++;
			}
			else if (sz[i] <= 35)
			{
				b++;
			}
			else if (sz[i] <= 60)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		a = 100.0 * a / n;
		b = 100.0 * b / n;
		c = 100.0 * c / n;
		d = 100.0 * d / n;
		System.out.printf("1-18: %.2lf%%\n",a);
		System.out.printf("19-35: %.2lf%%\n",b);
		System.out.printf("36-60: %.2lf%%\n",c);
		System.out.printf("60??: %.2lf%%\n",d);
		return 0;
	}



}

