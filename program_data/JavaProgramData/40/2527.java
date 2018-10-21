package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a; //p???????????
		double b;
		double c;
		double d;
		double s;
		double p;
		double q;
		double size;
		double sumangel;
		double angel;
		final double PI = 3.1415926;
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
			sumangel = Double.parseDouble(tempVar5);
		}
		s = (a + b + c + d) / 2;
		angel = sumangel / 180 * PI / 2;
		q = Math.cos(angel);
		p = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * q * q;
		if (p >= 0)
		{
			size = Math.sqrt(p);
			System.out.printf("%.4f\n",size);
		}
		else
		{
			System.out.print("Invalid input");
		}
		return 0;
	}

}

