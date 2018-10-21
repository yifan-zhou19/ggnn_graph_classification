package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double a;
		double b;
		double c;
		double d;
		double x;
		double s;
		double S;
		double y;
		double m;
		double PI = 3.1415926;
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
			x = Double.parseDouble(tempVar5);
		}
		  s = (a + b + c + d) / 2;
		  y = (x * PI) / 360;
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(y) * Math.cos(y));
		m = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(y) * Math.cos(y);
		if (m < 0)
		{
		   System.out.print("Invalid input");
		}
		else
		{
		   System.out.printf("%.4lf\n",S);
		}
	}
}

