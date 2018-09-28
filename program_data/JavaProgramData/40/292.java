package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double A;
		double s;
		double S;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			A = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		if ((s - a) < 0 || (s - b) < 0 || (s - c) < 0 || (s - d) < 0)
		{
			System.out.printf("Invalid input",s);
		}
		else
		{
			 S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(A * 3.1415926 / 360) * Math.cos(A * 3.1415926 / 360));
		System.out.printf("%.4lf\n",S);
		}
		return 0;
	}

}

