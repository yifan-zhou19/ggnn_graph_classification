package <missing>;

public class GlobalMembers
{
	public static double mianji(double a,double b,double c,double d,double q)
	{
	double s;
	double p;
	p = (a + b + c + d) / 2;
	p = (p - a) * (p - b) * (p - c) * (p - d);
	if (p < 0)
	{
	System.out.print("Invalid input");
	}
	else
	{
	s = Math.sqrt(p - a * b * c * d * (Math.cos(q)) * (Math.cos(q)));

	System.out.printf("%.4lf",s);

	}
	return 0;


	}
	public static void Main(String[] args)
	{
	  double a;
	  double b;
	  double c;
	  double d;
	  double p;
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
		  p = Double.parseDouble(tempVar5);
	  }
	  p = p / 360 * 3.1415926;
	  mianji(a, b, c, d, p);


	}



}

