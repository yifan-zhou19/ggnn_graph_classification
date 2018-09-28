package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   double a;
		   double b;
		   double c;
		   double d;
		   double S;
		   double s;
		   double q;
		   double y;
		   double w;
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
			   q = Double.parseDouble(tempVar5);
		   }
		   s = (a + b + c + d) / 2;
		   w = (double)q * PI / 180;
		   y = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos((double)(w / 2)) * Math.cos((double)(w / 2));
		   if (y < 0)
		   {
		   System.out.print("Invalid input\n");
		   }
		   else
		   {
			   S = Math.sqrt(y);
		   System.out.printf("%.4f\n",S);
		   }
	}

}

