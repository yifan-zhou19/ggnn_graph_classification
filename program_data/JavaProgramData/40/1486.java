package <missing>;

public class GlobalMembers
{
	public static double mjs(double a,double b,double c,double d,double r)
	{
	  double s;
		s = (a + b + c + d) / 2;
		return (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(3.1415926 * r / 360),2);
	}
	 public static double mjS(double a,double b,double c,double d,double r)
	 {
	   double s;
	   s = (a + b + c + d) / 2;
	  return Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.pow(Math.cos(3.1415926 * r / 360),2));
	 }
	 public static int Main()
	 {
	   double a;
	   double b;
	   double c;
	   double d;
	   double r;
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
	   String tempVar5 = ConsoleInput.scanfRead(" ");
	   if (tempVar5 != null)
	   {
		   r = Double.parseDouble(tempVar5);
	   }
	   if (mjs(a, b, c, d, r) < 0)
	   {
		   System.out.print("Invalid input\n");
	   }
		  else
		  {
			  System.out.printf("%.4lf\n",mjS(a, b, c, d, r));
		  }
		  return 0;
	 }

}

