package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//double sqrt(double p);
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//double cos(double j);
	public static int Main()
	{
		double p;
		double a;
		double b;
		double c;
		double d;
		double j;
		double S;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			j = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		p = ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * cos(j * 3.1415926 / 360) * cos(j * 3.1415926 / 360));

	if (p > 0)
	{
		S = sqrt(p);
		System.out.printf("%.4lf",S);
	}
	else
	{
	System.out.print("Invalid input");
	}
		return 0;
	}

}

