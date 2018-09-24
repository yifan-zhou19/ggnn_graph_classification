package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		double[] a = new double[5];
		double s;
		double q;
		for (i = 0;i < 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Double.parseDouble(tempVar);
			}
		}
		q = (a[1] + a[2] + a[3] + a[0]) / 2;
		s = (q - a[0]) * (q - a[1]) * (q - a[2]) * (q - a[3]) - a[0] * a[1] * a[2] * a[3] * Math.cos(a[4] * PI / (double)360) * Math.cos(a[4] * PI / (double)360);
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

