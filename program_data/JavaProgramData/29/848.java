package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int k;
		double a;
		double b;
		double c;
		double e;
		double f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (k = 0;k < m;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			a = 2,b = 1,c = 0;
			for (i = 0;i < n;i++)
			{
				c = c + a / b;
				e = a + b;
				f = a;
				a = e;
				b = f;
			}
			System.out.printf("%.3lf\n",c);
		}
		return 0;
	}

}

