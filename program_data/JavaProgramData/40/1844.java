package <missing>;

public class GlobalMembers
{
	public static double mj(float a,float b,float c,float d,float z)
	{
	  double y;
	  double s;
	  s = (a + b + c + d) / 2;
		  y = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(z) * Math.cos(z));
	  return (y);
	}
	public static double Main()
	{
		double a;
		double b;
		double c;
		double d;
		double x;
		double z;
		double PI = 3.1415926;
		double S;
		double s;
		double m;
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
			x = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		z = ((x / 2) * PI) / 180;
		m = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(z) * Math.cos(z);
		if (m < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			S = mj(a, b, c, d, z);
		System.out.printf("%.4lf",S);
		}
	}

}

