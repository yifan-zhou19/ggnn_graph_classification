package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int a;
		int b;
		int c;
		int d;
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
				x = Integer.parseInt(tempVar2);
			}
			if ((x >= 1) && (x <= 18))
			{
				a++;
			}
			else if (x <= 35)
			{
				b++;
			}
			else if (x <= 60)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",100.0 * a / n);
		System.out.printf("19-35: %.2lf%%\n",100.0 * b / n);
		System.out.printf("36-60: %.2lf%%\n",100.0 * c / n);
		System.out.printf("60??: %.2lf%%\n",100.0 * d / n);
		return 0;
	}
}

