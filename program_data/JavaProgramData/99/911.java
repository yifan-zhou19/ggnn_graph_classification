package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		int i;
		int n;
		int u;
		int v;
		int y;
		int z;
		int[] nl = new int[1000];
		u = 0;
		v = 0;
		y = 0;
		z = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(nl[i]) = Integer.parseInt(tempVar2);
		}
			if (0 < (nl[i]) && (nl[i]) < 19)
			{
				u += 1;
			}
			else if ((nl[i]) > 18 && (nl[i]) < 36)
			{
				v += 1;
			}
			else if ((nl[i]) > 35 && (nl[i]) < 61)
			{
				y += 1;
			}
			else if ((nl[i]) > 60)
			{
				z += 1;
			}
		}
		a = 1.0 * u / n * 100.0;
		b = 1.0 * v / n * 100.0;
		c = 1.0 * y / n * 100.0;
		d = 1.0 * z / n * 100.0;

		System.out.printf("1-18: %.2lf%\n",a);
		System.out.printf("19-35: %.2lf%\n",b);
		System.out.printf("36-60: %.2lf%\n",c);
		System.out.printf("60??: %.2lf%\n",d);
		return 0;
	}
}

