package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int m = 0;
		int q = 0;
		int x = 0;
		int y = 0;
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
				a = Integer.parseInt(tempVar2);
			}
			if (a <= 18)
			{
				m++;
			}
			else if (a <= 35)
			{
				q++;
			}
			else if (a <= 60)
			{
				x++;
			}
			else if (a >= 61)
			{
				y++;
			}

		}

		f = m / (double)n * 100;
		g = q / (double)n * 100;
		h = x / (double)n * 100;
		j = y / (double)n * 100;
		System.out.printf("1-18: %.2lf%\n",f);
		System.out.printf("19-35: %.2lf%\n",g);
		System.out.printf("36-60: %.2lf%\n",h);
		System.out.printf("60??: %.2lf%\n",j);
		return 0;
	}
}

