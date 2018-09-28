package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  double a;
	  double b;
	  double c;
	  double d;
	  double s;
	  double e;
	  double m;
	  double n;
	  double f;
	  double p = 3.1415926;
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
		  e = Double.parseDouble(tempVar5);
	  }
	  e = e * p / 360;
	  s = (a + b + c + d) / 2;
	  m = (s - a) * (s - b) * (s - c) * (s - d);
	  f = m - a * b * c * d * Math.cos(e) * Math.cos(e);

	  if (f < 0)
	  {
	 System.out.print("Invalid input");
	  }
	  else
	  {
		n = Math.sqrt(f);
	  System.out.printf("%.4lf",n);
	  }
	 return 0;
	}
}

