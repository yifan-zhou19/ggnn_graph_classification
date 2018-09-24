package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		double a;
		double b;
		double c;
		double d;
		double x;
		double y;
		double z;
		double s;
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
		y = (double)Math.cos(DefineConstants.PI * x / 360);
		z = (double)(a + b + c + d) / 2;
		if ((z - a) * (z - b) * (z - c) * (z - d) - a * b * c * d * y >= 0)
		{
			s = (double)Math.sqrt((z - a) * (z - b) * (z - c) * (z - d) - a * b * c * d * y * y);
			System.out.printf("%.4lf",s);
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}
}

final class DefineConstants
{
	public static final double PI = 3.1415926;
}

