package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		double[] a = new double[5];
		double s;
		double S;
		double e;
		for (i = 0;i < 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Double.parseDouble(tempVar);
			}
		}
		s = (a[1] + a[2] + a[3] + a[0]) / 2;
		e = ((s - a[1]) * (s - a[2]) * (s - a[3]) * (s - a[0]) - a[1] * a[2] * a[3] * a[0] * Math.cos(a[4] / 2 * 3.1415926 / 180) * Math.cos(a[4] / 2 * 3.1415926 / 180));
		if (e < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			S = Math.sqrt(e);
			System.out.printf("%.4lf",S);
		}
		return 0;
	}



}

