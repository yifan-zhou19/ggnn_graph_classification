package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		double t = 0;
		double s = 0;
		double h = 0;
		double S = 0;
		double pi = 3.1415926;
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
		  t = Double.parseDouble(tempVar5);
	  }
	  t = t / 2;
	  h = t * pi / 180;
	  s = (a + b + c + d) / 2;
	  if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(h) * Math.cos(h) >= 0.getValue() != 0)
	  {
		  S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(h) * Math.cos(h));
	  System.out.printf("%.4lf",S);
	  }
	  else if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(h) * Math.cos(h) < 0)
	  {
	  System.out.print("Invalid input");
	  }
		return (0);



	}
}

