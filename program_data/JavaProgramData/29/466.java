package <missing>;

public class GlobalMembers
{
	public static double f(double n)
	{
		double result = 0;
		double a = 1;
		double b = 2;
		double e;
		double c;
		double i;

		for (i = 0;i < n;i++)
		{
			result += b / a;
			e = a + b;
			c = b;
			a = c;
			b = e;
		}
	return (result);
	}
	public static int Main()
	{

		int n;
		int i;
		double[][] m = new double[100][2];
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
				(m[i][0]) = Double.parseDouble(tempVar2);
			}
			m[i][1] = f(m[i][0]);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%.3lf\n",m[i][1]);
		}



	return 0;
	}

}

