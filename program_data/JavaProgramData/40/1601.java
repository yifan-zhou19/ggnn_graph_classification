package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 double s = new double(double a,double b,double c,double d,double t);
	 int i;
	 double[] l = new double[5];
	 for (i = 0;i <= 4;i++)
	 {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  l[i] = Double.parseDouble(tempVar);
	  }
	 }
	 if (s(l[0], l[1], l[2], l[3], l[4]) < 0)
	 {
	  System.out.print("Invalid input");
	 }
	 else
	 {
	  System.out.printf("%.4lf",Math.sqrt(s(l[0], l[1], l[2], l[3], l[4])));
	 }
	}
	public static double s(double a,double b,double c,double d,double t)
	{
	 double x;
	 double m;
	 t = t / 360 * 3.1415926;
	 m = (a + b + c + d) / 2;
	 x = (m - a) * (m - b) * (m - c) * (m - d) - a * b * c * d * Math.cos(t) * Math.cos(t);
	 return (x);
	}
}

