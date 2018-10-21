package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		double g;
		double k;
		double t;
		double m;
		double b;
		double c;
		double d;
		double f;
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
		for (i = 0,k = 0,t = 0,m = 0,b = 0;i < n;i++)
		{
			if (a[i] >= 1 && a[i] <= 18)
			{
				k = k + 1;
			}
			if (a[i] >= 19 && a[i] <= 35)
			{
				t = t + 1;
			}
			if (a[i] >= 36 && a[i] <= 60)
			{
				m = m + 1;
			}
			else if (a[i] >= 60)
			{
				b = b + 1;
			}
		}
		g = k / n * 100;
		c = t / n * 100;
		d = m / n * 100;
		f = b / n * 100;
		System.out.printf("1-18: %.2lf%%\n",g);
		 System.out.printf("19-35: %.2lf%%\n",c);
		  System.out.printf("36-60: %.2lf%%\n",d);
		   System.out.printf("60??: %.2lf%%\n",f);
	}
}

