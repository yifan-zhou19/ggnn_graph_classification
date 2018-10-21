package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[] a = new double[5];
		double o;
		double s;
		double S;
		int i;
		for (i = 1;i <= 4;i++)
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
			o = Double.parseDouble(tempVar2);
		}
		o = o / 2;
		o = o / 360 * 2 * 3.1415926;
		s = (a[1] + a[2] + a[3] + a[4]) / 2;
		S = (s - a[1]) * (s - a[2]) * (s - a[3]) * (s - a[4]) - a[1] * a[2] * a[3] * a[4] * Math.cos(o) * Math.cos(o);
		if (S < 0)
		{
			System.out.printf("%s","Invalid input");
		}
		  else
		  {
				S = Math.sqrt(S);
				System.out.printf("%.4lf",S);
		  }

	}

}

