package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		if ((n == 0) || (n == 1))
		{
			return 1;
		}
		else
		{
			return f(n - 1) + f(n - 2);
		}
	}
	public static double S(int n)
	{
		double a;
		double b;
		double s = 0;
		int i;
		for (i = 1;i <= n;i++)
		{
			a = f(i);
			b = f(i + 1);
			s += b / a;
		}
		return s;
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		double sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			sum = S(n);
			System.out.printf("%.3lf\n", sum);
		}
		return 0;
	}

}

