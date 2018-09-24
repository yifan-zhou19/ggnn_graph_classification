package <missing>;

public class GlobalMembers
{
	public static double sum(int n)
	{
		int a = 1;
		int b = 2;

		double c;
		double h = 0;
		int i = 1;
		int e;
		while (i <= n)
		{
			c = (1.0 * b) / (1.0 * a);
			h += c;
			e = a;
			a = b;
			b += e;
			i++;
		}
		return h;
	}







	public static int Main()
	{
		int m;
		int n;
		double hs;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (int mm = 0;mm < m;mm++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			hs = sum(n);
			System.out.printf("%.3lf",hs);
			if (mm != m - 1)
			{
				System.out.print("\n");
			}
		}

		return 0;
	}
}

