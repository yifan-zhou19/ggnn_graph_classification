package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  double a;
		  double b;
		  double c;
		  double d;
		  double e;
		  double i;
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
		  String tempVar5 = ConsoleInput.scanfRead();
		  if (tempVar5 != null)
		  {
			  e = Double.parseDouble(tempVar5);
		  }
		  i = (double)(e / 2);
		  double f;
		  double g;
		  f = (double)((a + b + c + d) / 2);
		  double p;
		  p = (double)((i / 180) * PI);
		  g = (double)((f - a) * (f - b) * (f - c) * (f - d) - a * b * c * d * Math.cos(p) * Math.cos(p));
		  if (g < 0)
		  {
		  System.out.print("Invalid input");
		  }
		  else
		  {
			  double s;
			  s = Math.sqrt(g);
			  System.out.printf("%.4lf",s);
		  }
		  System.in.read();
		  System.in.read();
	}
}

