package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double g;
		double h;
		double j;
		double k;
		int num;
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			if (num < 19)
			{
				a++;
			}
			else if (num < 36)
			{
				b++;
			}
			else if (num < 61)
			{
				c++;
			}
			else
			{
				d++;
			}
			i++;
		}
		g = 1.0 * a / n * 100;
			h = 1.0 * b / n * 100;
			j = 1.0 * c / n * 100;
			k = 1.0 * d / n * 100;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",g,h,j,k);
		return 0;
	}

}

