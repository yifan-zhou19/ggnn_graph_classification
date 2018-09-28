package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   double a = 0;
	   double b = 0;
	   double c = 0;
	   double d = 0;
	   double t = 0;
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
		   t = Double.parseDouble(tempVar5);
	   }
	   double p = 0;
	   double s = 0;
	   t = t / 360 * PAI;
	   p = (a + b + c + d) / 2;
	   s = (p - a) * (p - b) * (p - c) * (p - d) - a * b * c * d * Math.cos(t) * Math.cos(t);
	   if (s < 0)
	   {
		   System.out.print("Invalid input");
	   }
	   else
	   {
		   s = Math.sqrt(s);
		   System.out.printf("%.4lf",s);
	   }
	}
}

