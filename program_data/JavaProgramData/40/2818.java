package <missing>;

public class GlobalMembers
{
	public static double PI = 3.1415926;
	public static double f(double a,double b,double c,double d,double alpha)
	{
	 double s = (a + b + c + d) / 2;
	double tmp = ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(alpha * PI / 360),2));
	if (tmp < 0)
	{
	return -1;
	}
	else
	{
	return Math.sqrt(tmp);
	}
	}
	public static int Main()
	{
	 double a;
	 double b;
	 double c;
	 double d;
	 double alpha;
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
	if (f(a, b, c, d, alpha) < 0)
	{
	System.out.print("Invalid input");
	}
	else
	{
	System.out.printf("%.4lf",f(a, b, c, d, alpha));
	}
	}
}

