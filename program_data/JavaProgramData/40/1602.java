package <missing>;

public class GlobalMembers
{
	public static double square(double a,double b,double c,double d,double angel)
	{
		double ans;
		double s;
		s = (a + b + c + d) / 2;
		ans = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(angel) * Math.cos(angel));
		return (ans);
	}
	public static void Main()
	{
		double square = new double(double,double,double,double,double);
		double a;
		double b;
		double c;
		double d;
		double angel;
		double ans;
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
			angel = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		angel = angel * PI / 360;
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(angel) * Math.cos(angel) < 0.getValue() != 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			ans = square(a, b, c, d, angel);
			System.out.printf("%.4f",ans);
		}
	}
}

