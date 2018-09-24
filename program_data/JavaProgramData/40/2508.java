package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double s;
		double S;
		double p;
		double[] sz = new double[5];
		for (i = 0;i < 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sz[i] = Double.parseDouble(tempVar);
			}
		}
		a = sz[0];
		b = sz[1];
		c = sz[2];
		d = sz[3];
		e = sz[4];
		f = (e / 360) * PI;
		s = (a + b + c + d) / 2;
		p = ((s - a) * (s - b) * (s - c) * (s - d)) - (a * b * c * d * Math.cos(f) * Math.cos(f));
		if (p < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
				S = Math.sqrt(p);
			System.out.printf("%.4lf",S);
		}
		return 0;
	}
}

