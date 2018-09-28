package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[] a = new double[4];
		double p;
		double s = 0;
		double q;
		double m;
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
		s = s / 2;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = Double.parseDouble(tempVar2);
		}
		p = p * Pi / 360;
		q = ((s - a[0]) * (s - a[2]) * (s - a[3]) * (s - a[1]) - a[0] * a[1] * a[3] * a[2] * Math.cos(p) * Math.cos(p));
		if (q < 0)
		{
			System.out.print("Invalid input");
			return;
		}
		else
		{
			m = Math.sqrt(q);
		}
		System.out.printf("%.4lf",m);
	}
}

