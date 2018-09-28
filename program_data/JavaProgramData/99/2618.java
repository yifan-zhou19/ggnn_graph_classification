package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] x = new int[100];
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
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
					x[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				if (x[i] >= 1 && x[i] <= 18)
				{
					a = a + 1;
				}

				if (x[i] >= 19 && x[i] <= 35)
				{
					b = b + 1;
				}

				if (x[i] >= 36 && x[i] <= 60)
				{
					c = c + 1;
				}

				if (x[i] > 60)
				{
					d = d + 1;
				}

			}
			double y = 0;
			y = a + b + c + d;
			double e = 0;
			double f = 0;
			double g = 0;
			double h = 0;
			e = (a / y) * 100;
			f = (b / y) * 100;
			g = (c / y) * 100;
			h = (d / y) * 100;
			System.out.printf("1-18: %.2lf%%\n",e);
			System.out.printf("19-35: %.2lf%%\n",f);
			System.out.printf("36-60: %.2lf%%\n",g);
			System.out.printf("60??: %.2lf%%\n",h);
			return 0;
	}

}

