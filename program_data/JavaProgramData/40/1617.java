package <missing>;

public class GlobalMembers
{
	public static float f(float x1, float x2, float x3, float x4)
	{
		float u;
		u = (x1 + x2 + x3 + x4) / 2;
		return (u);
	}
	public static int Main()
	{
		double S;
		double a;
		double b;
		double c;
		double d;
		double x;
		double s;
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
		x = x / 360 * 3.1415926;
		s = f(a, b, c, d);
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(x) * Math.cos(x) < 0.getValue() != 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(x) * Math.cos(x));
			System.out.printf("%.4lf",S);
		}
	}
}

