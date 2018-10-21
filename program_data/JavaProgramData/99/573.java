package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[120];
		int less = 0;
		int nd = 0;
		int rd = 0;
		int th = 0;
		double k;
		double l;
		double m;
		double t;
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
				less += 1;
			}
			else if (a[i] >= 19 && a[i] <= 35)
			{
				nd += 1;
			}
			else if (a[i] >= 36 && a[i] <= 60)
			{
				rd += 1;
			}
			else if (a[i] >= 61)
			{
				th += 1;
			}
		}
		k = (double)less * 100 / n;
		l = (double)nd * 100 / n;
		m = (double)rd * 100 / n;
		t = (double)th * 100 / n;
		System.out.printf("1-18: %.2lf",k);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",l);
		System.out.print("%%\n");
		System.out.printf("36-60: %.2lf",m);
		System.out.print("%%\n");
		System.out.printf("60??: %.2lf",t);
		System.out.print("%%\n");
		return 0;

	}
}

