package <missing>;

public class GlobalMembers
{
	public static double areo(double a,double b,double c,double d,double w)
	{
			  double s = 0.5 * (a + b + c + d);
		  s = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(w) * Math.cos(w);
		  if (s < 0)
		  {
		  return 0;
		  }
		  else
		  {
		  return Math.sqrt(s);
		  }
	}
		  public static int Main()
		  {
		  double a;
		  double b;
		  double c;
		  double d;
		  double s;
		  double w;
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
			  w = Double.parseDouble(tempVar5);
		  }
		  w = 3.1415926 * w / 180 / 2;
		  s = 0.5 * (a + b + c + d);

		  if (areo(a, b, c, d, w) == 0)
		  {
		  System.out.print("Invalid input");
		  }
		 else
		 {
		  System.out.printf("%.4lf",areo(a, b, c, d, w));
		 }

		  }
}

