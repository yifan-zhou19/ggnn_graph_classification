package <missing>;

public class GlobalMembers
{
	public static double[] sz = new double[100];

	public static void Read(double n)
	{
		int i;

		for (i = 0; i < n; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				(sz + i) = tempVar;
			}
		}
	}

	public static void Calculate(double n)
	{
		int i;
		double S;
		double x;
		double sum = 0;

		for (i = 0; i < n; i++)
		{
			sum += sz[i];
		}

		x = sum / n;

		sum = 0;
		for (i = 0; i < n; i++)
		{
			sum += Math.pow((sz[i] - x),2);
		}

		S = Math.pow((sum / n),0.5);

		System.out.printf("%.5f\n", S);
	}

	public static int Main()
	{
		int m;
		int i;
		double n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0; i < m; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Double.parseDouble(tempVar2);
			}
			Read(n);
			Calculate(n);
		}

		return 0;
	}
}

