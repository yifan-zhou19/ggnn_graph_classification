package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		   double y = 0;
		   double a;
		   double b;
		   double c;
		   double d;
		   double s = 0;
		   double x = 0;
		   double e;
		   double v = 0;
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
			   e = Double.parseDouble(tempVar5);
		   }
		   s = (a + b + c + d) / 2;
		   v = e / 360 * 3.1415926;
		   x = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(v) * Math.cos(v);
		  if (x < 0)
		  {
		   System.out.print("Invalid input");
		  }
		  else
		  {
		  System.out.printf("%.4lf",Math.sqrt(x));
		  }

	   return 0;
	}
}

