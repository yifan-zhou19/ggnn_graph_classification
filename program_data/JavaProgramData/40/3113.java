package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  double a;
		  double b;
		  double c;
		  double d;
		  double k;
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
			  k = Double.parseDouble(tempVar5);
		  }
		  double s = (a + b + c + d) / 2;
		  double t = ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * (Math.cos(k * PI / 360)) * (Math.cos(k * PI / 360)));
		  if (t < 0)
		  {
			  System.out.print("Invalid input\n");
		  }
		  else
		  {
			  System.out.printf("%.4lf\n",Math.sqrt(t));
		  }
	}

}

