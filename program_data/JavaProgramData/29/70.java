package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		double r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
			r = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			double f0;
			double f1;
			double f2;
			f0 = 2;
			f1 = 1;
			if (n == 1)
			{
				System.out.printf("%.3lf\n",f0 / f1);
			}
			else
			{
				for (j = 0;j < n;j++)
				{
					f2 = f0 / f1;
					f0 = f1 + f0;
					f1 = f2 * f1;
					r += f2;
				}
				System.out.printf("%.3lf\n",r);
			}
		}
		return 0;
	}
}

