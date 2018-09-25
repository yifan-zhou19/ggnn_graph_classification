package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] x = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double d = 0.0;
		double e;
		double f;
		double g;
		double h;

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (x[i] <= 18)
			{
				a = a + 1.0;
			}
			else if ((x[i] >= 19) && (x[i] <= 35))
			{
				b = b + 1.0;
			}
			else if ((x[i] >= 36) && (x[i] <= 60))
			{
				c = c + 1.0;
			}
			else if (x[i] >= 61)
			{
				d = d + 1.0;
			}
		}

		e = a * 100 / n;
		f = b * 100 / n;
		g = c * 100 / n;
		h = d * 100 / n;
		System.out.printf("1-18: %.2lf%\n",e);
		System.out.printf("19-35: %.2lf%\n",f);
		System.out.printf("36-60: %.2lf%\n",g);
		System.out.printf("60??: %.2lf%\n",h);

		return 0;
	}

}

