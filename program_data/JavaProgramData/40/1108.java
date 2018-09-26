package <missing>;

public class GlobalMembers
{
	public static void Main()
	{


		void S(double a,double b,double c,double d,double jiao);
		double a;
		double b;
		double c;
		double d;
		double jiao;
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
			jiao = Double.parseDouble(tempVar5);
		}
		S(a, b, c, d, jiao);



	}

	   public static void S(double a,double b,double c,double d,double jiao)
	   {
		   double PI;
		   double s;
		   double m;

			s = (a + b + c + d) / 2;
			PI = 3.1415926;
			jiao = PI * jiao / 360;
			m = Math.cos(jiao);
			if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * m * m) < 0)
			{
				System.out.print("Invalid input");

			}
			else
			{
			   s = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * m * m);
				  System.out.printf("%.4lf",s);
			}
	   }

}

