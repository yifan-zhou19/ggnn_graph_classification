package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k;
		double a;
		double b;
		double s = 0;
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		a = 1;
		b = 2;
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (k = 0;k < n;k++)
			{
				s = s + b / a;
				e = a;
				a = b;
				b = a + e;
			}
					a = 1;
					b = 2;

					System.out.printf("%.3lf\n",s);

			s = 0;

		}

		return 0;
	}
}

