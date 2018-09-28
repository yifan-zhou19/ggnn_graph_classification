package <missing>;

public class GlobalMembers
{
	public static final double pi = 3.1415926;
	public static double Area(double a,double b,double c,double d,double angle)
	{
		double s = (a + b + c + d) / 2;
		angle = (angle / 2) / 360 * 2 * pi;
		double square = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(angle) * Math.cos(angle);
		if (square < 0)
		{
			return -1;
		}
		return Math.sqrt(square);
	}
	public static int Main()
	{
	  double a;
	  double b;
	  double c;
	  double d;
	  double angle;
	  double ans;
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
		  angle = Double.parseDouble(tempVar5);
	  }
	  ans = Area(a, b, c, d, angle);
	  if (ans >= 0)
	  {
		  System.out.printf("%.4lf",ans);
	  }
	  else
	  {
		  System.out.print("Invalid input");
	  }
	  return 0;
	}
}

