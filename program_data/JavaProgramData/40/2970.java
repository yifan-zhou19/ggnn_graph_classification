package <missing>;

public class GlobalMembers
{
	public static double area(double a,double b,double c,double d,double arpha)
	{
		double s;
		double S;
		double temp;
		s = (a + b + c + d) / 2;
		arpha *= 0.5 * PI / 180;
		temp = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(arpha) * Math.cos(arpha);
		if (temp < 0)
		{
		return -1;
		}
		else
		{
			S = Math.sqrt(temp);
			return S;
		}
	}
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double arpha;
		double S;
		double temp;
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
			arpha = Double.parseDouble(tempVar5);
		}
		temp = area(a, b, c, d, arpha);
		if (temp < 0)
		{
		System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4f",temp);
		}
	}

}

