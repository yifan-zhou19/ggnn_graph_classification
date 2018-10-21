package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double a;
	double b;
	double c;
	double d;
	double al;
	double s;
	double s0;
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
	s = (a + b + c + d) / 2;
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		al = Double.parseDouble(tempVar5);
	}
	al = al / 2;
	al = 3.1415926 / 180 * al;

	if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(al) * Math.cos(al)) < 0)
	{
								System.out.print("Invalid input");
	}
								else
								{
									 s0 = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(al) * Math.cos(al));
									 System.out.printf("%.4lf",s0);
								}

	return 0;
	}

}

