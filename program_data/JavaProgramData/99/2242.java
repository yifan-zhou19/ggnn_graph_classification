package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int[] b = new int[100];
		double w;
		double x;
		double y;
		double z;
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
			b[0]++;
		}
		if (a[i] < 36 && a[i]>18)
		{
			b[1]++;
		}
		if (a[i] > 35 && a[i] < 61)
		{
			b[2]++;
		}
		if (a[i] > 60)
		{
			b[3]++;
		}
		}
		w = 1.0 * b[0] * 100 / n;
		x = 1.0 * b[1] * 100 / n;
		y = 1.0 * b[2] * 100 / n;
		z = 1.0 * b[3] * 100 / n;
	System.out.printf("1-18: %.2lf",w);
	System.out.print("%%\n");
	System.out.printf("19-35: %.2lf",x);
	System.out.print("%%\n");
	System.out.printf("36-60: %.2lf",y);
	System.out.print("%%\n");
	System.out.printf("60??: %.2lf",z);
	System.out.print("%%\n");
	return 0;
	}
}

