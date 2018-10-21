package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  double a;
	  double b;
	  double c;
	  double d;
	  double alpha;
	  double area;
	  double s;
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
		  alpha = Double.parseDouble(tempVar5);
	  }
	  s = (a + b + c + d) / 2;
	  if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(alpha / 2) * Math.cos(alpha / 2)) > 0)
	  {
		  area = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(alpha / 360 * pi) * Math.cos(alpha / 360 * pi));
		  System.out.printf("%.4lf",area);
	  }
	  else
	  {
		  System.out.print("Invalid input");
	  }
	}

}

