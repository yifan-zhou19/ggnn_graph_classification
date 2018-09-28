package <missing>;

public class GlobalMembers
{
	public static double cos2(float alpha)
	{
	 return Math.cos(alpha / 360 * PI) * Math.cos(alpha / 360 * PI);
	}

	public static int Main()
	{
	double a;
	double b;
	double c;
	double d;
	double alpha;
	double s;
	double sum;
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
		alpha = Double.parseDouble(tempVar5);
	}
	s = (a + b + c + d) / 2;
	sum = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * cos2(alpha);
	if (sum < 0)
	{
	 System.out.print("Invalid input\n");
	}
	else
	{
	 System.out.printf("%.4lf\n",Math.sqrt(sum));
	}
	}

}

