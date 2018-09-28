package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//double sqar(double f);

	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double f;
		double g;
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
			e = Double.parseDouble(tempVar5);
		}
		s = 0.5 * (a + b + c + d);
		g = e * PI / 360;
		f = ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(g),2));
		if (f >= 0)
		{
		 S = Math.sqrt(f);
		 System.out.printf("%0.4lf",S);
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}


}

