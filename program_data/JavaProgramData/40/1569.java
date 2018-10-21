package <missing>;

public class GlobalMembers
{
	public static double area(double a,double b,double c,double d,double j)
	{
		double s;
		double t;
		double S;
		double pi = 3.1415926;
		   s = (double)(a + b + c + d) / 2;
		   t = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos((double)(j * pi) / 360) * Math.cos((double)(j * pi) / 360);
		   if (t < 0)
		   {
		   return (-1);
		   }
	else
	{
		   S = (double)Math.sqrt(t);
	}

		   return (S);
	}
		public static int Main()
		{
			 double a;
			 double b;
			 double c;
			 double d;
			 double j;
			 double S;

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
				 j = Double.parseDouble(tempVar5);
			 }
			 S = area(a, b, c, d, j);
			 if (S == -1)
			 {
			 System.out.print("Invalid input");
			 }
		 else
		 {
			 System.out.printf("%.4lf",S);
		 }
		}
}

