package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int n;
		int i;
		int q;
		int w;
		int e;
		int r;
		double z;
		double x;
		double c;
		double v;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		q = 0;
		w = 0;
		e = 0;
		r = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] <= 18)
			{
				q++;
			}
			if (18 < a[i] && a[i] < 36)
			{
				w++;
			}
			if (35 < a[i] && a[i] < 61)
			{
				e++;
			}
			if (a[i] > 60)
			{
				r++;
			}
		}
		z = 100.00 * q / n;
		x = 100.00 * w / n;
		c = 100.00 * e / n;
		v = 100.00 * r / n;
		System.out.print("1-18: ");
		System.out.printf("%.2lf",z);
		System.out.print("%%\n");
		System.out.print("19-35: ");
		System.out.printf("%.2lf",x);
		System.out.print("%%\n");
		System.out.print("36-60: ");
		System.out.printf("%.2lf",c);
		System.out.print("%%\n");
		System.out.print("60??: ");
		System.out.printf("%.2lf",v);
		System.out.print("%%\n");
	return 0;
	}
}

