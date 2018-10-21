package <missing>;

public class GlobalMembers
{
	public static double S(double a, double b, double c, double d, double e)
	{
		double jieguo;
		double s;
		double zhi;
		s = (a + b + c + d) / 2.0;
		zhi = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(e),2);
		jieguo = Math.sqrt(zhi);

		return (jieguo);
	}

	public static int Main()
	{
		double[] bian = new double[4];
		double jiao;
		double banjiao;
		double z;
		int i;
		for (i = 0;i < 4;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				bian[i] = Double.parseDouble(tempVar);
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			jiao = Double.parseDouble(tempVar2);
		}
		banjiao = jiao / 360.0 * PI;
		z = S(bian[1], bian[2], bian[3], bian[0], banjiao);
		if (z > 0)
		{
			System.out.printf("%.4lf",z);
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}

}

