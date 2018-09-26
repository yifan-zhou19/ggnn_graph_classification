package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int i;
		int n;
		int t;
		a = b = c = d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			if (t <= 18)
			{
				a++;
			}
			else
			{
				if (t >= 19 && t <= 35)
				{
				b++;
				}
				else
				{
					if (t >= 36 && t <= 60)
					{
					c++;
					}
					else
					{
						if (t >= 61)
						{
						d++;
						}
					}
				}
			}
		}
		double e;
		double f;
		double g;
		double h;
		e = a * 1.0 / n * 100;
		f = b * 1.0 / n * 100;
		g = c * 1.0 / n * 100;
		h = d * 1.0 / n * 100;
		System.out.printf("1-18: %.2lf%\n", e);
		System.out.printf("19-35: %.2lf%\n", f);
		System.out.printf("36-60: %.2lf%\n", g);
		System.out.printf("60??: %.2lf%\n", h);
		return 0;
	}

}

