package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int[] a = new int[100];
		double f;
		double g;
		double h;
		double j;
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
			if (a[i] >= 1 && a[i] <= 18)
			{
				b++;
			}
			if (a[i] >= 19 && a[i] <= 35)
			{
				c++;
			}
			if (a[i] >= 36 && a[i] <= 60)
			{
				d++;
			}
			if (a[i] >= 61)
			{
				e++;
			}
		}
		f = (double)b / n;
		g = (double)c / n;
		h = (double)d / n;
		j = (double)e / n;
		System.out.printf("1-18: %.2lf",100 * f);
		System.out.print("%%\n");
		System.out.printf("19-35: %.2lf",100 * g);
		System.out.print("%%\n");
		System.out.printf("36-60: %.2lf",100 * h);
		System.out.print("%%\n");
		System.out.printf("60??: %.2lf",100 * j);
		System.out.print("%%\n");

	}
}

