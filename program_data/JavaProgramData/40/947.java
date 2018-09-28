package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double a;
	double b;
	double c;
	double d;
	double e;
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
	double y;
	if (((b + c + d - a) / 2 * (a + c + d - b) / 2 * (a + b + d - c) / 2 * (a + b + c - d) / 2 - a * b * c * d * Math.cos(e * pi / 360) * Math.cos(e * pi / 360)) < 0)
	{
	System.out.print("Invalid input");
	}
	else
	{
	y = Math.sqrt((b + c + d - a) / 2 * (a + c + d - b) / 2 * (a + b + d - c) / 2 * (a + b + c - d) / 2 - a * b * c * d * Math.cos(e * pi / 360) * Math.cos(e * pi / 360));
	System.out.printf("%.4f",y);
	}
	return 0;
	}



}

