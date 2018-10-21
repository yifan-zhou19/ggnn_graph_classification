package <missing>;

public class GlobalMembers
{
	public static double xs(int n)
	{
		int e;
		int a = 1;
		int b = 2;
		double sum = 0;
		for (int i = 1;i <= n;i++)
		{
			if (i == 1)
			{
				sum += (1.0 * b) / (1.0 * a);
			}
			else
			{
				e = a + b;
				a = b;
				b = e;
				sum += (1.0 * b) / (1.0 * a);
			}
		}
		return sum;
	}





	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int n;
		double h;
		for (int j = 1;j <= m;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			h = xs(n);
			System.out.printf("%.3lf",h);
			if (j != m)
			{
				System.out.print("\n");
			}
		}



		return 0;
	}
}

