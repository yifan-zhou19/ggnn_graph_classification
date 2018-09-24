package <missing>;

public class GlobalMembers
{
	public static double f(double a,double b,double c,double d,double w)
	{
		   double q;
		   q = w / 2.0 * 3.1415926 / 180.0;
		   double s;
		   double ss;
		   s = (a + b + c + d) / 2.0;
		   ss = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(q) * Math.cos(q));
		   return (ss);
	}
	public static int Main()
	{
		 double a;
		 double b;
		 double c;
		 double d;
		 double w;
		 double z;
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
		 String tempVar5 = ConsoleInput.scanfRead();
		 if (tempVar5 != null)
		 {
			 w = Double.parseDouble(tempVar5);
		 }
		 s = (a + b + c + d) / 2.0;
		  double q;
		  double g;
		   q = w / 2.0 * 3.1415926 / 180.0;
		 z = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(q) * Math.cos(q);
		 if (z < 0)
		 {
				System.out.print("Invalid input");
		 }
		 else
		 {
			 g = f(a, b, c, d, w);
		 System.out.printf("%.4lf",g);
		 }
		 System.in.read();
		 System.in.read();
	}

}

