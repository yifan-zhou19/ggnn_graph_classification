package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		double n;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double e;
		double f;
		double g;
		double h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		for (int i = 0;i < n;i++)
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
			else if (t > 18 && t <= 35)
			{
				b++;
			}
			else if (t > 35 && t <= 60)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
			System.out.printf("1-18: %.2lf%%\n",e = a / n * 100);
			System.out.printf("19-35: %.2lf%%\n",f = b / n * 100);
			System.out.printf("36-60: %.2lf%%\n",g = c / n * 100);
			System.out.printf("60??: %.2lf%%\n",h = d / n * 100);
		return 0;
	}

}

