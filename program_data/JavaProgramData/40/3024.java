package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[4];
		double corner;
		double s = 0;
		double S;
		double PI = 3.1415926;
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
			corner = Double.parseDouble(tempVar2);
		}
		corner = corner * PI / 180;
		S = (s - a[0]) * (s - a[1]) * (s - a[2]) * (s - a[3]);
		S -= a[0] * a[1] * a[2] * a[3] * Math.cos(corner / 2) * Math.cos(corner / 2);
		if (S < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4f",Math.sqrt(S));
		}
	}
}

