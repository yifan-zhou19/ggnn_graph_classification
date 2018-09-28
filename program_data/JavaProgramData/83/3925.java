package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int b;
	int c = 0;
	int d;
	float x;
	float e = 0F;
	float[] a = new float[10];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n - 1;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		a[i] = b;
		c = c + b;
	}
	for (i = 0;i <= n - 1;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if (d <= 100 && d >= 90)
		{
			e = e+4.0 * a[i];
		}
		if (d <= 89 && d >= 85)
		{
			e = e+3.7 * a[i];
		}
		if (d <= 84 && d >= 82)
		{
			e = e+3.3 * a[i];
		}
		if (d <= 81 && d >= 78)
		{
			e = e+3.0 * a[i];
		}
		if (d <= 77 && d >= 75)
		{
			e = e+2.7 * a[i];
		}
		if (d <= 74 && d >= 72)
		{
			e = e+2.3 * a[i];
		}
		if (d <= 71 && d >= 68)
		{
			e = e+2.0 * a[i];
		}
		if (d <= 67 && d >= 64)
		{
			e = e+1.5 * a[i];
		}
		if (d <= 63 && d >= 60)
		{
			e = e+1.0 * a[i];
		}
	}
	x = e / c;
	System.out.printf("%.2f",x);
	return 0;
	}
}

