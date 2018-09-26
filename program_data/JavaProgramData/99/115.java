package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		double f;
		double g;
		double h;
		double k;
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
			b = b + 1;
		}
		if (a[i] >= 19 && a[i] <= 35)
		{
			c = c + 1;
		}
		if (a[i] > 35 && a[i] <= 60)
		{
			d = d + 1;
		}

			e = n - b - c - d;
	}
	f = ((double)b / n) * 100;
	g = ((double)c / n) * 100;
	h = ((double)d / n) * 100;
	k = ((double)e / n) * 100;
	System.out.printf("1-18: %.2f%%\n", f);
	System.out.printf("19-35: %.2f%%\n", g);
	System.out.printf("36-60: %.2f%%\n", h);
	System.out.printf("60??: %.2f%%", k);
	}


}

