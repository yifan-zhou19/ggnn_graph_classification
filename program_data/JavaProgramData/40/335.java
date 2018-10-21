package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  double cal = new double(double,double,double,double,double,double);
	  double S;
	  double a;
	  double b;
	  double c;
	  double d;
	  double s;
	  double x;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Double.parseDouble(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead("\n");
	  if (tempVar2 != null)
	  {
		  b = Double.parseDouble(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead("\n");
	  if (tempVar3 != null)
	  {
		  c = Double.parseDouble(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead("\n");
	  if (tempVar4 != null)
	  {
		  d = Double.parseDouble(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead("\n");
	  if (tempVar5 != null)
	  {
		  x = Double.parseDouble(tempVar5);
	  }
	  s = (a + b + c + d) / 2;
	  S = cal(a, b, c, d, s, x);
	  if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos((x / 360) * 3.1415926) * Math.cos((x / 360) * 3.1415926) < -0.00001.getValue() != 0)
	  {
		  System.out.print("Invalid input");
	  }
	  else
	  {
		  System.out.printf("%.4lf",S);
	  }
	}

	public static double cal(double a,double b,double c,double d,double s,double x)
	{
		 double S;
		 s = (a + b + c + d) / 2;
		 S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos((x / 360) * 3.1415926) * Math.cos((x / 360) * 3.1415926));
		 return (S);
	}
}

