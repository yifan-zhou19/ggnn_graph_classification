package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[105];
		int n;
		int i;
		int e = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double e1;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] <= 18)
			{
				e++;
			}
		else if (a[i] > 18 && a[i] <= 35)
		{
			b++;
		}
		else if (a[i] > 35 && a[i] <= 60)
		{
			c++;
		}
		else
		{
			d++;
		}
		}
		e1 = (double)e / n * 100;
		b1 = (double)b / n * 100;
		c1 = (double)c / n * 100;
		d1 = (double)d / n * 100;
		System.out.printf("1-18: %.2lf%%\n",e1);
		System.out.printf("19-35: %.2lf%%\n",b1);
		System.out.printf("36-60: %.2lf%%\n",c1);
		System.out.printf("60??: %.2lf%%\n",d1);
	}


}

