package <missing>;

public class GlobalMembers
{
	public static double Area(double a, double b, double c, double d, double s, double y)
	{
		 double S;
		 S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(y) * Math.cos(y));
		 return S;
	}
	public static int Main()
	{
		 double a;
		 double b;
		 double c;
		 double d;
		 double x;
		 double y;
		 double s;
		 double S;
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
			 x = Double.parseDouble(tempVar5);
		 }
		 s = (a + b + c + d) / 2;
		 y = PI * (x / 2) / 180;
		 if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(y) * Math.cos(y)) < 0)
		 {
									 System.out.print("Invalid input\n");
		 }
									 else
									 {
										 S = Area(a, b, c, d, s, y);
										 System.out.printf("%.4lf\n",S);
									 }
		 return 0;
	}


}

