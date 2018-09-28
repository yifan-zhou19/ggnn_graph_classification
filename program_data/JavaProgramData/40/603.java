package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	float a;
	float b;
	float c;
	float d;
	double e;
	double f;
	double g;
	double h;
	double i;
	double s;
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
		e = Double.parseDouble(tempVar5);
	}
	s = (a + b + c + d) / 2;
	h = e / 360 * pi;
	f = Math.cos(h);
	i = f * f;
	if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * i < 0)
	{
	System.out.print("Invalid input\n");
	}
	else
	{
	g = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * i);
	System.out.printf("%.4f\n",g);
	}
	}


}

