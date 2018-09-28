package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  double a;
		  double b;
		  double c;
		  double d;
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
		  double s = (a + b + c + d) / 2;
		  double m;
		  String tempVar5 = ConsoleInput.scanfRead();
		  if (tempVar5 != null)
		  {
			  m = Double.parseDouble(tempVar5);
		  }
		  double co = (m / 180) * PI;
		  double p;
		  double q;
		  q = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(co / 2) * Math.cos(co / 2);
		  if (q < 0)
		  {
		  System.out.print("Invalid input");
		  }
		  else
		  {
			  p = Math.sqrt(q);
		  System.out.printf("%.4lf",p);
		  }


	}

}

