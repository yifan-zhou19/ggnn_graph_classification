package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		double e = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double l;
		double m;
		double x;
		double o;
		int[] a = new int[101];
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
			if (a[i] >= 1 && a[i] <= 18)
			{
				e++;
			}
			if (a[i] >= 19 && a[i] <= 35)
			{
				b++;
			}
			if (a[i] >= 36 && a[i] <= 60)
			{
				c++;
			}
			if (a[i] > 60)
			{
				d++;
			}
		}
		l = 100 * (e+0.0) / n;
		m = 100 * (b + 0.0) / n;
		x = 100 * (c + 0.0) / n;
		o = 100 * (d + 0.0) / n;
		System.out.print("1-18: ");
		System.out.printf("%.2lf",l);
		System.out.print("%%\n");
		System.out.print("19-35: ");
		System.out.printf("%.2lf",m);
		System.out.print("%%\n");
		System.out.print("36-60: ");
		System.out.printf("%.2lf",x);
		System.out.print("%%\n");
		System.out.print("60??: ");
		System.out.printf("%.2lf",o);
		System.out.print("%%");
	}
}

