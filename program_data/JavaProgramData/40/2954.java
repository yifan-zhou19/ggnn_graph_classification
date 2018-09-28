package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double angle;
		double pi;
		double alpha;
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
		  pi = 3.1415926;
		  alpha = angle * pi / 360;
		  if (angle == 0 || angle == 180)
		  {
		  System.out.print("Invalid input");
		  }
		  else
		  {
		double area;
		double s;
		  s = (a + b + c + d) / 2;
		  area = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(alpha) * Math.cos(alpha));
		  System.out.printf("%.4lf",area);
		  }
		  System.in.read();
		  System.in.read();
	}



}

