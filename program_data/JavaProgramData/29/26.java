package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int k;
		int f0;
		int f1;
		int f2;
		int fm;
		int fz;
		double x = 0;
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
			m = Integer.parseInt(tempVar2);
		}
		if (m == 1)
		{
			x = 1.0 * 2 / 1;
			System.out.printf("%.3lf\n",x);
		}
		if (m == 2)
		{
			x = 1.0 * 3 / 2 + 1.0 * 2 / 1;
			System.out.printf("%.3lf\n",x);
		}
		if (m > 2)
		{
		f0 = 1;
		f1 = 2;
		f2 = 3;
		x = 0;
		x += 1.0 * 3 / 2 + 1.0 * 2 / 1;
			for (k = 2;k < m;k++)
			{
				fz = f1 + f2;
				fm = f0 + f1;
				f0 = f1;
				f1 = f2;
				f2 = fz;
			x += 1.0 * fz / fm;
			}

			System.out.printf("%.3lf\n",x);

		}
		}


		return 0;
	}
}

