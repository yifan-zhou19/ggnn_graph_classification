package <missing>;

public class GlobalMembers
{
	public static void area(double a, double b, double c, double d, double r)
	{
	   double s;
	   double t;
	   double S;

	   s = (a + b + c + d) / 2;
	   t = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(r * PI / 360) * Math.cos(r * PI / 360);

	   if (t >= 0)
	   {
		  S = Math.sqrt(t);
		  System.out.printf("%.4lf\n",S);
	   }
	   else
	   {
		  System.out.print("Invalid input\n");
	   }
	}

	public static int Main()
	{
	   double[] a = new double[5];
	   double S;
	   int i;

	   for (i = 0;i < 5;i++)
	   {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i] = Double.parseDouble(tempVar);
		  }
	   }

	   area(a[0], a[1], a[2], a[3], a[4]);

	  return 0;
	}

}

