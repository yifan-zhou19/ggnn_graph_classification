package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	float a;
	float b;
	float c;
	float d;
	float s;
	float A;
	double X;
	double S;
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
	s = (a + b + c + d) / 2;
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		A = Float.parseFloat(tempVar5);
	}
	A = A / 180 * PI;
	X = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(A / 2) * Math.cos(A / 2);
	if (X < 0)
	{
	System.out.print("Invalid input");
	}
	else
	{
	S = Math.sqrt(X);
	System.out.printf("%.4lf",S);
	}
	return 0;
	}
}

