package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  double a;
	  double b;
	  double c;
	  double d;
	  double x;
	  double s;
	  double y;
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
	  y = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(x * PI / 360) * Math.cos(x * PI / 360));
	   if ((s - a) * (s - b) * (s - c) * (s - d) < a * b * c * d * Math.cos(x * PI / 360) * Math.cos(x * PI / 360))
	   {
	  System.out.print("Invalid input");
	   }
	  else
	  {
	   System.out.printf("%.4lf",y);
	  }
	  return 0;
	}


}

