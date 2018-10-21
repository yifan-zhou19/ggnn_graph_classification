package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double mianji = double X;
	double a;
	double b;
	double c;
	double d;
	double alpha;
	double s;
	double S;
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
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		alpha = Double.parseDouble(tempVar5);
	}
	alpha = alpha * PI / 360;
	s = (a + b + c + d) / 2;
	S = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(alpha) * Math.cos(alpha);
	if (S < 0)
	{
			System.out.print("Invalid input");
	}
			else
			{
				   System.out.printf("%.4lf",mianji(S));
			}
	return 0;
	}

	public static double mianji(double X)
	{
		   double S2;
		   S2 = Math.sqrt(X);
		   return (S2);
	}

}

