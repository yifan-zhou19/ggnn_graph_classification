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
		double s;
		double t;
		double u;
		double v;
		double all;
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
			if (x[i] <= 18)
			{
				a++;
			}
			else if (x[i] > 18 && x[i] < 36)
			{
				b++;
			}
			else if (x[i] > 35 && x[i] < 61)
			{
				c++;
			}
			else
			{
				d++;
			}
		}
		all = a + b + c + d;
		s = 100 * a / all;
		t = 100 * b / all;
		u = 100 * c / all;
		v = 100 * d / all;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",s,t,u,v);
		return 0;
	}
}

