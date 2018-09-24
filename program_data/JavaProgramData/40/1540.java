package <missing>;

public class GlobalMembers
{
	public static double area(double a,double b,double c,double d,double e)
	{
	  double s;
	  double k;
	  s = (a + b + c + d) / 2;
	  e = Math.cos(e / 360 * PI);
	  e = e * e;
	  s = ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * e);
	  if (s >= 0)
	  {
	  k = Math.sqrt(s);
	  }
	  else
	  {
		  k = -1;
	  }
	  return k;
	}

	public static int Main()
	{
	 double a1;
	 double b1;
	 double c1;
	 double d1;
	 double e1;
	 double s1;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a1 = Double.parseDouble(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 b1 = Double.parseDouble(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 c1 = Double.parseDouble(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 d1 = Double.parseDouble(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead();
	 if (tempVar5 != null)
	 {
		 e1 = Double.parseDouble(tempVar5);
	 }
	 s1 = area(a1, b1, c1, d1, e1);
	 if (s1 == -1)
	 {
	  System.out.print("Invalid input");
	 }
	 else
	 {
	  System.out.printf("%.4lf",s1);
	 }
	  return 0;
	}
}

