package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[4];
		double b;
		double s;
		for (int i = 0;i < 4;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Double.parseDouble(tempVar);
		}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		b = PI * b / 180 / 2;
		s = 0.5 * (a[0] + a[1] + a[2] + a[3]);
		s = (s - a[0]) * (s - a[1]) * (s - a[2]) * (s - a[3]) - a[0] * a[1] * a[2] * a[3] * Math.cos(b) * Math.cos(b);
		if (s < 0)
		{
		System.out.print("Invalid input");
		}
		else
		{
		System.out.printf("%.4lf",Math.sqrt(s));
		}
	}

}

