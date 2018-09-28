package <missing>;

public class GlobalMembers
{
	public static double a;
	public static double b;
	public static double c;
	public static double d;
	public static double s;
	public static double S;
	public static double f;
	public static double PI = 3.1415926;
	public static void abc()
	{
		s = (a + b + c + d) / 2;
		if (((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(f / 360 * PI) * Math.cos(f / 360 * PI)) > 0)
		{
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(f / 360 * PI) * Math.cos(f / 360 * PI));
		System.out.printf("%.4lf",S);
		}
		else
		{
		System.out.print("Invalid input");
		}

	}
	public static void Main()
	{
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
			f = Double.parseDouble(tempVar5);
		}
		abc();


	}
}

