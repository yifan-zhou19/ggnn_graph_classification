package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	double a;
	double b;
	double c;
	double d;
	double s;
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

	double w;
	double x;
	double W;
	double X;
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		w = Double.parseDouble(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		x = Double.parseDouble(tempVar6);
	}
	W = w / 180 * PI;
	X = x / 180 * PI;

	double R;
	double M;
	M = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(W / 2 + X / 2) * Math.cos(W / 2 + X / 2);

	if (M < 0)
	{
		System.out.print("Invalid input");
	}
	else
	{
		R = Math.sqrt(M);
		System.out.printf("%.4lf", R);
	}

	return 0;
	}

}

