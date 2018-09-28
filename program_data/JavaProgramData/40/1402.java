package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[5];
		double S;
		double s;
		double q;
		double w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			(a[1]) = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(a[2]) = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(a[3]) = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			(a[4]) = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			(a[5]) = Double.parseDouble(tempVar5);
		}
		s = (a[1] + a[2] + a[3] + a[4]) / 2;
		w = (a[5] * PI) / 360;
		q = (s - a[1]) * (s - a[2]) * (s - a[3]) * (s - a[4]) - a[1] * a[2] * a[3] * a[4] * Math.cos(w) * Math.cos(w);
		if (q >= 0)
		{
			S = Math.sqrt(q);
			System.out.printf("%.4lf",S);
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}

}

