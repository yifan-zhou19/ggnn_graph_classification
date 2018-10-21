package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p = 0;
		int q = 0;
		int r = 0;
		int s = 0;
		int i;
		double c1;
		double c2;
		double c3;
		double c4;
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
				p = p + 1;
			}
			if (a[i] >= 19 && a[i] <= 35)
			{
				q = q + 1;
			}
			if (a[i] >= 36 && a[i] <= 60)
			{
				r = r + 1;
			}
			if (a[i] >= 61)
			{
				s = s + 1;
			}
		}
		c1 = (double)p / n * 100;
		c2 = (double)q / n * 100;
		c3 = (double)r / n * 100;
		c4 = (double)s / n * 100;
		System.out.printf("1-18: %.2lf",c1);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",c2);
		System.out.print("%%\n");
		System.out.printf("36-60: %.2lf",c3);
		System.out.print("%%\n");
		System.out.printf("60??: %.2lf",c4);
		System.out.print("%%\n");
		return 0;
	}

}

