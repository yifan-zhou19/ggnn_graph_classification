package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	float s;
	float a;
	float b;
	float c;
	float d;
	double e;
	double S;
	double jf;
	double g;
	double PI;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Float.parseFloat(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = Float.parseFloat(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c = Float.parseFloat(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		d = Float.parseFloat(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		g = Double.parseDouble(tempVar5);
	}
	s = (a + b + c + d) / 2;
	PI = 3.1415926;
	e = (g * 1.0 / 2) / 360 * 2 * PI;
	jf = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e) * Math.cos(e);
	if (jf < 0)
	{
		System.out.print("Invalid input\n");
	}
	else
	{
	S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(e) * Math.cos(e));
	System.out.printf("%.4lf\n",S);
	}
		return 0;
	}

}

