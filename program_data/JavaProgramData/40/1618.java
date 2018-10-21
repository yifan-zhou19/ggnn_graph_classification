package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[4];
		double angle;
		double s = 0.0;
		double S = 0;
		int i;
		for (i = 0;i < 4;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Double.parseDouble(tempVar);
			}
			s += a[i];
		}
		s /= 2;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			angle = Double.parseDouble(tempVar2);
		}
		angle = angle / 360 * PI;
		S = (s - a[0]) * (s - a[1]) * (s - a[2]) * (s - a[3]) - a[0] * a[1] * a[2] * a[3] * Math.cos(angle) * Math.cos(angle);
		if (S < 0)
		{
			System.out.print("Invalid input");
			return 0;
		}
		S = Math.sqrt(S);
		System.out.printf("%.4lf",S);
		return 0;
	}


}

