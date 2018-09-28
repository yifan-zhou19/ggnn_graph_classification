package <missing>;

public class GlobalMembers
{
	public static double f(double a,double b,double c,double d,double jiaodu)
	{
		   double x;
		   double y;
		   double s;
		   s = (a + b + c + d) / 2;
		   x = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(jiaodu * pi / 360) * Math.cos(jiaodu * pi / 360);
		   if (x < 0)
		   {
			 y = -1;
		   }
			 else
			 {
				y = Math.sqrt(x);
			 }
		   return y;
	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double jiaodu;
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
			jiaodu = Double.parseDouble(tempVar5);
		}
		double square;
		square = f(a, b, c, d, jiaodu);
		if (square == -1)
		{
		  System.out.print("Invalid input");
		}
		  else
		  {
			 System.out.printf("%.4lf",square);
		  }
		return 0;
	}
}

