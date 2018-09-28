package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		int[] a = new int[100];
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] <= 18)
			{
				b++;
			}
			else if (a[i] >= 10 && a[i] <= 35)
			{
				c++;
			}
			else if (a[i] >= 36 && a[i] <= 60)
			{
				d++;
			}
			else if (a[i] >= 61)
			{
				e++;
			}
		}
			b = (double)b / n * 100;
			c = (double)c / n * 100;
			d = (double)d / n * 100;
			e = (double)e / n * 100;
			System.out.printf("1-18: " "%.2lf""%%\n",b);
			System.out.printf("19-35: " "%.2lf""%%\n",c);
			System.out.printf("36-60: " "%.2lf""%%\n",d);
			System.out.printf("60??: " "%.2lf""%%",e);
		return 0;
	}
}

