package <missing>;

public class GlobalMembers
{
	public static double area(double a,double b,double c,double d,double p)
	{
		   double s = (a + b + c + d) / 2;
		   double PI = 3.1415926;
		   double S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(p * PI / 360) * Math.cos(p * PI / 360));
		   return S;
	}
	public static int Main()
	{
		  double a;
		  double b;
		  double c;
		  double d;
		  double p;
		  double S;
		  double PI = 3.1415926;
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
			  p = Double.parseDouble(tempVar5);
		  }
		  double s = (a + b + c + d) / 2;
		  double m = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(p * PI / 360) * Math.cos(p * PI / 360);
		  if (m < 0)
		  {
				 System.out.print("Invalid input");
		  }
		  else
		  {
			  S = area(a, b, c, d, p);
			  System.out.printf("%.4lf",S);
		  }
	}

}

