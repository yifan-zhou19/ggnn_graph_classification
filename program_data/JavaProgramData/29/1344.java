package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int u;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int n;
		int i;
		for (u = 0;u < m;u++)
		{
			double s = 0;
						  double a = 2;
						  double b = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < n;i++)
			{
				double t = 0;
				s += a / b;
				t = a;
				a += b;
				b = t;
			}
			System.out.printf("%.3lf\n", s);
		}
		return 0;
	}

}

