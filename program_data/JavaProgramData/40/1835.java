package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double s;
		double S;
		double t;
		int i;
		double[] g = new double[5];
		for (i = 0;i < 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				g[i] = Double.parseDouble(tempVar);
			}
		}
		s = (double)(g[0] + g[1] + g[2] + g[3]) / (double)2;
		f = (double)g[4] / (double)180 * 3.1415926;
		t = (s - g[0]) * (s - g[1]) * (s - g[2]) * (s - g[3]) - g[0] * g[1] * g[2] * g[3] * Math.cos(f / 2) * Math.cos(f / 2);
		if (t < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			S = Math.sqrt(t);
			System.out.printf("%.4lf",S);
		}
	}
}

