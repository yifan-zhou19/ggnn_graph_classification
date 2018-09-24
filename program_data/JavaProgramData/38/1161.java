package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] x = new double[1000];
		double a;
		double z;
		double s;
		double[] S = new double[100];
		int n;
		int i;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (e = 0;e < n;e++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i = Integer.parseInt(tempVar2);
			}
			z = 0;
			s = 0;
			for (f = 0;f < i;f++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[f] = Double.parseDouble(tempVar3);
				}
				z += x[f];
			}
			a = z / i;
			for (f = 0;f < i;f++)
			{
				s += Math.pow(x[f] - a,2);
			}
			S[e] = Math.pow(s / i,0.5);
		}
		for (e = 0;e < n;e++)
		{
			System.out.printf("%.5lf\n", S[e]);
		}
		return 0;
	}
}

