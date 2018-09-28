package <missing>;

public class GlobalMembers
{
	public static double f(int n)
	{
		if (n == 0)
		{
		   return 1.000;
		}
		else if (n == 1)
		{
		   return 2.000;
		}
		else
		{
		   return f(n - 1) + f(n - 2);
		}
	}
	public static double g(int n)
	{
			double z = 0.000;
		for (int i = 0;i < n;i++)
		{
			z = z + f(i + 1) / f(i);
		}
		return z;
	}
	public static int Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < m;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					n = Integer.parseInt(tempVar2);
				}
				System.out.printf("%.3f\n",g(n));
		}
		System.in.read();
		System.in.read();
	}

}

