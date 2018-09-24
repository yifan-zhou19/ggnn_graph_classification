package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	float a;
	float b;
	float c;
	float d;
	float f;
	float s;
	double e;
	double S;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Float.parseFloat(tempVar);
	}
	System.out.print("\n");
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = Float.parseFloat(tempVar2);
	}
	System.out.print("\n");
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c = Float.parseFloat(tempVar3);
	}
	System.out.print("\n");
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		d = Float.parseFloat(tempVar4);
	}
	System.out.print("\n");
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		f = Float.parseFloat(tempVar5);
	}
	System.out.print("\n");
	e = f * PI / 180;
	s = (a + b + c + d) / 2;
	S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e / 2) * Math.cos(e / 2));

	if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e / 2) * Math.cos(e / 2) < 0)
	{
	System.out.print("Invalid input\n");
	}
	else
	{
	System.out.printf("%.4lf\n",S);
	}
	return 0;
	}
}

